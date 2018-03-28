package cl.silvercloud.rest.services.tiendas.to;

public class EmpresaTO {

	private long id;
	private String nombre;
	private String rubro;
	private String paginaWeb;
	private String tags;
	private String descripcion;
	
	public EmpresaTO() {
		super();
	}
	
	public EmpresaTO(long id, String nombre, String rubro, String paginaWeb, String tags, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rubro = rubro;
		this.paginaWeb = paginaWeb;
		this.tags = tags;
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
