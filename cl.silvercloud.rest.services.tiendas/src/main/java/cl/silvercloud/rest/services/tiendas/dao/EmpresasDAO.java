package cl.silvercloud.rest.services.tiendas.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import cl.silvercloud.rest.services.tiendas.to.EmpresaTO;

@Component
public class EmpresasDAO {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmpresasDAO.class); 

	@Autowired
	private JdbcTemplate jdbc;
	
	@Value("${cl.silvercloud.tiendas.sql.select-empresa}")
	private String selectEmpresa;
	
	@Value("${cl.silvercloud.tiendas.sql.add-empresa}")
	private String addEmpresa;
	
	public EmpresaTO getEmpresaById(long id) {
		return (EmpresaTO) jdbc.queryForObject(selectEmpresa
				, new Object[] {id}, new BeanPropertyRowMapper<EmpresaTO>(EmpresaTO.class));
	}
	
	public int addEmpresa(EmpresaTO empresaAdd) {
		LOGGER.debug("Insertando datos de la empresa " + empresaAdd.getNombre());
		return jdbc.update(addEmpresa, new Object[]{
				  empresaAdd.getNombre()
				, empresaAdd.getRubro()
				, empresaAdd.getPaginaWeb()
				, empresaAdd.getTags()
				, empresaAdd.getDescripcion()});
	}
	
}
