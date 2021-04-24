package mvc.app.model;

import java.sql.Date;

public class Cuotas {
	
	private String CodeSolicitud;
	private String IdAsociado;
	private int NroCuota;
	private float TasaInteres;
	private double Saldo;
	private Date FechaPago;
	private float Intereses;
	private float Capital;
	
	
	public Cuotas(String codeSolicitud, String idAsociado, int nroCuota, float tasaInteres, double saldo,
			Date fechaPago, float intereses, float capital) {
		super();
		CodeSolicitud = codeSolicitud;
		IdAsociado = idAsociado;
		NroCuota = nroCuota;
		TasaInteres = tasaInteres;
		Saldo = saldo;
		FechaPago = fechaPago;
		Intereses = intereses;
		Capital = capital;
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


	public int getNroCuota() {
		return NroCuota;
	}


	public void setNroCuota(int nroCuota) {
		NroCuota = nroCuota;
	}


	public float getTasaInteres() {
		return TasaInteres;
	}


	public void setTasaInteres(float tasaInteres) {
		TasaInteres = tasaInteres;
	}


	public double getSaldo() {
		return Saldo;
	}


	public void setSaldo(double saldo) {
		Saldo = saldo;
	}


	public Date getFechaPago() {
		return FechaPago;
	}


	public void setFechaPago(Date fechaPago) {
		FechaPago = fechaPago;
	}


	public float getIntereses() {
		return Intereses;
	}


	public void setIntereses(float intereses) {
		Intereses = intereses;
	}


	public float getCapital() {
		return Capital;
	}


	public void setCapital(float capital) {
		Capital = capital;
	}
	
	
}
