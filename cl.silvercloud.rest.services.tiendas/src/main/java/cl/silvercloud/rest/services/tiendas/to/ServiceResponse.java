package cl.silvercloud.rest.services.tiendas.to;

public class ServiceResponse {

	private String idResponse;
	private String message;
	private Object objResponse;
	
	public ServiceResponse() {
		
	}
	
	public ServiceResponse(String idResponse, String message, Object objResponse) {
		super();
		this.idResponse = idResponse;
		this.message = message;
		this.objResponse = objResponse;
	}

	public String getIdResponse() {
		return idResponse;
	}

	public void setIdResponse(String idResponse) {
		this.idResponse = idResponse;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObjResponse() {
		return objResponse;
	}

	public void setObjResponse(Object objResponse) {
		this.objResponse = objResponse;
	}
	
}
