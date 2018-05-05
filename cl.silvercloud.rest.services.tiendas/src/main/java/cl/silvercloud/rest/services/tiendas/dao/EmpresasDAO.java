package cl.silvercloud.rest.services.tiendas.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import cl.silvercloud.rest.services.tiendas.to.EmpresaTO;

@Component
public class EmpresasDAO {

	@Autowired
	private JdbcTemplate jdbc;
	
	public EmpresaTO getEmpresaById(long id) {
		return (EmpresaTO) jdbc.queryForObject(
				  "Select * from tb_empresa where id = ?"
				, new Object[] {id}, new BeanPropertyRowMapper<EmpresaTO>(EmpresaTO.class));
	}
	
}
