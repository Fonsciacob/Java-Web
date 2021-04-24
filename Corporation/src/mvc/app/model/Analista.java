package mvc.app.model;

public class Analista {
	
	//ATRIBUTOS DE LA CLASE
	
	private String CodAnalista;
	private String CodSolicitud;
	private String IdAsociado;
	private String Estado;
	private String Nombre;
	private String Contenido;
	
	
	public Analista(String codA,String codS,String idAsc, String state, String nom,String content) {
		
		super();
		CodAnalista=codA;
		CodSolicitud=codS;
		IdAsociado=idAsc;
		Estado=state;
		Nombre=nom;
		Contenido=content;
	}
		
	public Analista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCodAnalista() {
		return CodAnalista;
	}
	public void setCodAnalista(String codAnalista) {
		CodAnalista = codAnalista;
	}
	
	public String getCodSolicitud() {
		return CodSolicitud;
	}
	public void setCodSolicitud(String codSolicitud) {
		CodSolicitud = codSolicitud;
	}
	
	public String getIdAsociado() {
		return IdAsociado;
	}
	public void setIdAsociado(String idAsociado) {
		IdAsociado = idAsociado;
	}
	
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String getContenido() {
		return Contenido;
	}
	public void setContenido(String contenido) {
		Contenido = contenido;
	}
	
}
