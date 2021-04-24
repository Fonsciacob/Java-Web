package mvc.app.model;

public class Asociado {

	//ATRIBUTOS DE LA CLASE
	
	private String Id;
	private String Nombre;
	private String Apellido;
	private String Estado;
	private String DNI;
	private double Salario;
	private String Estudio;
	private int Hijos;
	private String Eps;
	private String Telefono;
	private String Direccion;
	private double Aportes;
	
	

	public Asociado(String id, String nombre, String apellido, String estado, String dNI, double salario,
			String estudio, int hijos, String eps, String telefono, String direccion, double aportes) {
		super();
		Id = id;
		Nombre = nombre;
		Apellido = apellido;
		Estado = estado;
		DNI = dNI;
		Salario = salario;
		Estudio = estudio;
		Hijos = hijos;
		Eps = eps;
		Telefono = telefono;
		Direccion = direccion;
		Aportes = aportes;
	}
	
	public Asociado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	public String getEstudio() {
		return Estudio;
	}

	public void setEstudio(String estudio) {
		Estudio = estudio;
	}

	public int getHijos() {
		return Hijos;
	}

	public void setHijos(int hijos) {
		Hijos = hijos;
	}

	public String getEps() {
		return Eps;
	}

	public void setEps(String eps) {
		Eps = eps;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public double getAportes() {
		return Aportes;
	}

	public void setAportes(double aportes) {
		Aportes = aportes;
	}


	
}
