package cl.silvercloud.rest.services.tiendas.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.silvercloud.rest.services.tiendas.dao.EmpresasDAO;
import cl.silvercloud.rest.services.tiendas.to.EmpresaTO;

@Component
@RestController(value="EmpresasController")
public class EmpresasController {

	@Autowired
	private EmpresasDAO empresasDao;
	
	@RequestMapping(value="/obtenerDatosNegocio"
			, method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public EmpresaTO obtenerDatosNegocio (@RequestParam("id") long id) {
		return empresasDao.getEmpresaById(id);
	}

}
