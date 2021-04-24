package mvc.app.model;

import java.sql.Date;

public class Solicitud {
	
	private String CodeSolicitud;
	private String IdAsociado;
	private Date Fecha;
	private int Ncuotas;
	private float Monto;
	private float TasaAnual;
	private String Observaciones;
	private String Estado;
	
	

	public Solicitud(String codeSolicitud, String idAsociado, Date fecha, int ncuotas, float monto, float tasaAnual,
			String observaciones, String estado) {
		super();
		CodeSolicitud = codeSolicitud;
		IdAsociado = idAsociado;
		Fecha = fecha;
		Ncuotas = ncuotas;
		Monto = monto;
		TasaAnual = tasaAnual;
		Observaciones = observaciones;
		Estado = estado;
	}
	
	
	public Solicitud() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCodeSolicitud() {
		return CodeSolicitud;
	}
	public void setCodeSolicitud(String codeSolicitud) {
		CodeSolicitud = codeSolicitud;
	}
	public String getIdAsociado() {
		return IdAsociado;
	}
	public void setIdAsociado(String idAsociado) {
		IdAsociado = idAsociado;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public int getNcuotas() {
		return Ncuotas;
	}
	public void setNcuotas(int ncuotas) {
		Ncuotas = ncuotas;
	}
	public float getMonto() {
		return Monto;
	}
	public void setMonto(float monto) {
		Monto = monto;
	}
	public float getTasaAnual() {
		return TasaAnual;
	}
	public void setTasaAnual(float tasaAnual) {
		TasaAnual = tasaAnual;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}
