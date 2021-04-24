package mvc.app.process;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import mvc.app.conexion.Conexion;
import mvc.app.model.Analista;
import mvc.app.model.Asociado;
import mvc.app.model.Cuotas;
import mvc.app.model.Solicitud;


public class Procesos {
	
	private Connection objConexion;
	private CallableStatement objStm;

	public String Resultado;
	
	private static Connection ObtenerConexion() throws SQLException {
		return Conexion.getConnection();
	}
	
	public void CrearAsociado(Asociado objAsc) throws SQLException {
		objConexion=ObtenerConexion();
		
		objStm= objConexion.prepareCall("{call InsertAsociado(?,?,?,?,?,?,?,?,?,?,?)}");
		
		objStm.setString(1,objAsc.getNombre());
		objStm.setString(2, objAsc.getApellido());
		objStm.setString(3, objAsc.getEstado());
		objStm.setString(4, objAsc.getDNI());
		objStm.setDouble(5, objAsc.getSalario());
		objStm.setString(6, objAsc.getEstudio());
		objStm.setInt(7, objAsc.getHijos());
		objStm.setString(8,objAsc.getEps());
		objStm.setString(9,objAsc.getTelefono());
		objStm.setString(10,objAsc.getDireccion());
		objStm.setDouble(11,objAsc.getAportes());
		
		objStm.execute();
	}
	
	public void CrearSolicitud(Solicitud objSol) throws SQLException {
		
		objConexion=ObtenerConexion();
		
		objStm=objConexion.prepareCall("{call InsertSolicitud(?,?,?,?)}");
		
		objStm.setString(1, objSol.getIdAsociado());
		objStm.setInt(2, objSol.getNcuotas());
		objStm.setDouble(3, objSol.getMonto());
		objStm.setString(4, objSol.getObservaciones());
		
		objStm.execute();
	}

//----ACTUALIZAR--
	
	public void ActualizarAsociado(Asociado objAsc) throws SQLException {
		objConexion=ObtenerConexion();
		
		objStm= objConexion.prepareCall("{call UpdateAsociado(?,?,?,?,?,?,?,?,?,?,?,?)}");
		
		objStm.setString(1, objAsc.getId());
		objStm.setString(2,objAsc.getNombre());
		objStm.setString(3, objAsc.getApellido());
		objStm.setString(4, objAsc.getEstado());
		objStm.setDouble(5, objAsc.getSalario());
		objStm.setString(6, objAsc.getEstudio());
		objStm.setInt(7, objAsc.getHijos());
		objStm.setString(8, objAsc.getEps());
		objStm.setString(9, objAsc.getTelefono());
		objStm.setString(10, objAsc.getDireccion());
		objStm.setDouble(11, objAsc.getAportes());
		
		
		objStm.registerOutParameter("sms",Types.VARCHAR);
		objStm.execute();
		Resultado=objStm.getString("sms");
	}
	
	public void ActualizarSolicitud(Solicitud objSol) throws SQLException {
		objConexion=ObtenerConexion();
		
		objStm= objConexion.prepareCall("{call UpdateSolicitud(?,?,?,?,?)}");
		
		objStm.setString(1, objSol.getCodeSolicitud());
		objStm.setInt(2,objSol.getNcuotas());
		objStm.setFloat(3, objSol.getMonto());
		objStm.setString(4, objSol.getEstado());

		
		
		objStm.registerOutParameter("mensaje",Types.VARCHAR);
		objStm.execute();
		Resultado=objStm.getString("mensaje");
	}
	
	public void ActualizarrAnalista(Analista objAnl) throws SQLException {
		objConexion=ObtenerConexion();
		
		objStm=objConexion.prepareCall("{call UpdateAnalista(?,?,?,?,?,?)}");
		
		objStm.setString(1, objAnl.getCodAnalista());
		objStm.setString(2, objAnl.getCodSolicitud());
		objStm.setString(3, objAnl.getEstado());
		objStm.setString(4, objAnl.getNombre());
		objStm.setString(5,objAnl.getContenido());
		//PARAMETRO DE SALIDA 
		objStm.registerOutParameter("mensaje",Types.VARCHAR);
		
		objStm.execute();
		
		//Capturar el valor del parametro de salida
		Resultado = objStm.getString("mensaje");
	}
//----ELIMINAR--
	public void EliminarAsociado(String id) throws SQLException {
		objConexion=ObtenerConexion();
		
		objStm=objConexion.prepareCall("{call DeleteAsociado(?,?)}");
		
		objStm.setString(1,id);
		
		//PARAMETRO DE SALIDA 
		objStm.registerOutParameter("sms",Types.VARCHAR);
		
		objStm.execute();
		
		//Capturar el valor del parametro de salida
		Resultado = objStm.getString("sms");
	}
	
	public void EliminarSolicitud(Solicitud objSol) throws SQLException {
		objConexion=ObtenerConexion();
		
		objStm=objConexion.prepareCall("{call DeleteSolicitud(?,?)}");
		
		objStm.setString(1, objSol.getCodeSolicitud());
		
		//PARAMETRO DE SALIDA 
		objStm.registerOutParameter("mensaje",Types.VARCHAR);
		
		objStm.execute();
		
		//Capturar el valor del parametro de salida
		Resultado = objStm.getString("mensaje");
	}
	
	public void EliminarAnalista(Analista objAnl) throws SQLException {
		objConexion=ObtenerConexion();
		
		objStm=objConexion.prepareCall("{call DeleteAnalista(?,?)}");
		
		objStm.setString(1, objAnl.getCodSolicitud());
		
		//PARAMETRO DE SALIDA 
		objStm.registerOutParameter("mensaje",Types.VARCHAR);
		
		objStm.execute();
		
		//Capturar el valor del parametro de salida
		Resultado = objStm.getString("mensaje");
	}
	
	public void EliminarCuotas(Cuotas objCuts) throws SQLException {
		objConexion=ObtenerConexion();
		
		objStm=objConexion.prepareCall("{call DeleteCuota(?,?)}");
		
		objStm.setString(1, objCuts.getCodeSolicitud());
		
		//PARAMETRO DE SALIDA 
		objStm.registerOutParameter("mensaje",Types.VARCHAR);
		
		objStm.execute();
		
		//Capturar el valor del parametro de salida
		Resultado = objStm.getString("mensaje");
	}
	
//----VISTAS------
	public List<Asociado> VistaAsociado() throws SQLException {
		
		//Si el sp devuelve registro se utiliza el objeto ResultSet
		ResultSet objRs=null;
		
		List<Asociado> ListaAsociado=new ArrayList<>();
		
		objConexion=ObtenerConexion();
		
		objStm=objConexion.prepareCall("{call VistaAsociado()}");
		objStm.execute();
		
		objRs= objStm.getResultSet();
		
		while(objRs.next()) {
			
			Asociado objAsc = new Asociado();
			
			objAsc.setId(objRs.getString(1));
			objAsc.setNombre(objRs.getString(2));
			objAsc.setApellido(objRs.getString(3));
			objAsc.setEstado(objRs.getString(4));
			objAsc.setDNI(objRs.getString(5));
			objAsc.setSalario(objRs.getDouble(6));
			objAsc.setEstudio(objRs.getString(7));
			objAsc.setHijos(objRs.getInt(8));
			objAsc.setEps(objRs.getString(9));
			objAsc.setTelefono(objRs.getString(10));
			objAsc.setDireccion(objRs.getString(11));
			objAsc.setAportes(objRs.getDouble(12));
			
			ListaAsociado.add(objAsc);
		}
		
		return ListaAsociado;
	}
	
	public List<Asociado> CadaAsociado(String id) throws SQLException {
		
		//Si el sp devuelve registro se utiliza el objeto ResultSet
		ResultSet objRs=null;
		
		List<Asociado> ListaAsociado=new ArrayList<>();
		
		objConexion=ObtenerConexion();
		
		objStm=objConexion.prepareCall("{call EachAsociado(?)}");
		objStm.setString(1,id);
		objStm.execute();
		
		objRs= objStm.getResultSet();
		
		while(objRs.next()) {
			
			Asociado objAsc = new Asociado();
			
			objAsc.setId(objRs.getString(1));
			objAsc.setNombre(objRs.getString(2));
			objAsc.setApellido(objRs.getString(3));
			objAsc.setEstado(objRs.getString(4));
			objAsc.setDNI(objRs.getString(5));
			objAsc.setSalario(objRs.getDouble(6));
			objAsc.setEstudio(objRs.getString(7));
			objAsc.setHijos(objRs.getInt(8));
			objAsc.setEps(objRs.getString(9));
			objAsc.setTelefono(objRs.getString(10));
			objAsc.setDireccion(objRs.getString(11));
			objAsc.setAportes(objRs.getDouble(12));
			
			ListaAsociado.add(objAsc);
		}
		
		return ListaAsociado;
	}
	
	
	public List<Solicitud> VistaSolicitud() throws SQLException{
		
		ResultSet objRs=null;
		
		List<Solicitud> ListaSolicitud= new ArrayList<>();
		
		objConexion=ObtenerConexion();
		objStm=objConexion.prepareCall("{call VistaSolicitud()}");
		objStm.execute();
		
		objRs=objStm.getResultSet();
		
		while(objRs.next()) {
			
			Solicitud objSol = new Solicitud();
			
			objSol.setCodeSolicitud(objRs.getString(1));
			objSol.setIdAsociado(objRs.getString(2));
			objSol.setFecha(objRs.getDate(3));
			objSol.setNcuotas(objRs.getInt(4));
			objSol.setMonto(objRs.getFloat(5));
			objSol.setTasaAnual(objRs.getFloat(6));
			objSol.setObservaciones(objRs.getString(7));
			objSol.setEstado(objRs.getString(8));
			
			ListaSolicitud.add(objSol);
		}
		
		return ListaSolicitud;
	}
	
	public List<Analista> VistaAnalista() throws SQLException{
		
		List<Analista> ListaAnalista = new ArrayList<>();
		ResultSet objRs = null;
		
		objConexion=ObtenerConexion();
		
		objStm=objConexion.prepareCall("{call VistaAnalista()}");
		objStm.execute();
		
		objRs=objStm.getResultSet();
		
		while(objRs.next()) {
			
			Analista objAnl = new Analista();
			
			objAnl.setCodAnalista(objRs.getString(1));
			objAnl.setCodSolicitud(objRs.getString(2));
			objAnl.setIdAsociado(objRs.getString(3));
			objAnl.setEstado(objRs.getString(4));
			objAnl.setNombre(objRs.getString(5));
			objAnl.setContenido(objRs.getString(6));
			
			ListaAnalista.add(objAnl);
		}
		return ListaAnalista;
	}
}
