package cl.silvercloud.rest.services.tiendas.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.silvercloud.rest.services.tiendas.dao.EmpresasDAO;
import cl.silvercloud.rest.services.tiendas.to.EmpresaTO;
import cl.silvercloud.rest.services.tiendas.to.ServiceResponse;

@Component
@RestController(value="EmpresasController")
public class EmpresasController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmpresasController.class); 

	@Autowired
	private EmpresasDAO empresasDao;
	
	@RequestMapping(value="/obtenerDatosNegocio"
			, method=RequestMethod.GET
			, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public EmpresaTO obtenerDatosNegocio (@RequestParam("id") long id) {
		return empresasDao.getEmpresaById(id);
	}

	@RequestMapping(value="/agregarEmpresa"
			, method=RequestMethod.POST
			, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE
			, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ServiceResponse agregarEmpresa(@RequestBody EmpresaTO empresaAdd) {
		
		ServiceResponse response = new ServiceResponse();
		
		try {
			int rowsAffected = empresasDao.addEmpresa(empresaAdd);
			
			response.setIdResponse(String.valueOf(rowsAffected));
			response.setMessage("Se ha creado la empresa exitosamente.");
			response.setObjResponse(empresaAdd);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		
		return response;
	}
	
}
