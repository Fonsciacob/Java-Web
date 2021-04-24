package mvc.app.controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.app.model.Asociado;
import mvc.app.model.Analista;
import mvc.app.model.Solicitud;
import mvc.app.process.Procesos;

/**
 * Servlet implementation class CorporationController
 */
@WebServlet("/corp")
public class CorporationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CorporationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String op=request.getParameter("opcion");
		String id=request.getParameter("id");
		
		if(op.equals("Crear")) {
			System.out.println("Eligio Asociado");
			
			//redireccionar
			
			RequestDispatcher ruta = request.getRequestDispatcher("Vista/NuevoAsoc.jsp");
			ruta.forward(request, response);
		}
		
		else if(op.equals("CrearS")) {
			System.out.println("Eligio Solicitud");
			
			RequestDispatcher ruta = request.getRequestDispatcher("Vista/NuevaSol.jsp");
			ruta.forward(request, response);
		}
		
		else if(op.equals("VerS")) {
			
			Procesos objProc = new Procesos();
			List<Solicitud> VistaSolicitud = new ArrayList<>();
			
			try {
				VistaSolicitud=objProc.VistaSolicitud();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.setAttribute("ListaS", VistaSolicitud);
			RequestDispatcher ruta = request.getRequestDispatcher("Vista/VerSol.jsp");
			ruta.forward(request, response);
		}
		else if(op.equals("VerAn")) {
			
			Procesos objPr = new Procesos();
			List<Analista> VistaAnalista= new ArrayList<>();
			
			try {
				VistaAnalista=objPr.VistaAnalista();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			request.setAttribute("ListaAn", VistaAnalista);
			RequestDispatcher ruta = request.getRequestDispatcher("Vista/VerAn.jsp");
			ruta.forward(request, response);
		}
//		else if(op.equals("EditAs")) {
//		
//		Procesos objProcess = new Procesos();
//		List<Asociado> VistaAsociado = new ArrayList<>();
//		
//		try {
//			VistaAsociado= objProcess.CadaAsociado(id);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		request.setAttribute("Lista", VistaAsociado);
//		RequestDispatcher ruta = request.getRequestDispatcher("Vista/EditAsc.jsp");
//		ruta.forward(request, response);
//		}
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		//Crear una variable para Opción
		String opT=request.getParameter("opcion");
		String id=request.getParameter("id");
		
		//Instancia de la clase proceso
		Procesos objProcess=new Procesos();
		
		if(opT.equals("Guardar")){
			
			
			Asociado objAsc=new Asociado();
			
			objAsc.setNombre(request.getParameter("txtNom"));
			objAsc.setApellido(request.getParameter("txtDes"));
			objAsc.setEstado(request.getParameter("RadioS"));
			objAsc.setDNI(request.getParameter("txtDni"));
			objAsc.setSalario(Double.parseDouble(request.getParameter("txtSlr")));
			objAsc.setEstudio(request.getParameter("txtStd"));
			objAsc.setHijos(Integer.parseInt(request.getParameter("txtHij")));
			objAsc.setEps(request.getParameter("txtEps"));
			objAsc.setTelefono(request.getParameter("txtTel"));
			objAsc.setDireccion(request.getParameter("txtDir"));
			objAsc.setAportes(Double.parseDouble(request.getParameter("txtApr")));
			
			try {
				objProcess.CrearAsociado(objAsc);
				System.out.println("registro exitoso");
				
				RequestDispatcher ruta=request.getRequestDispatcher("index.jsp");
				ruta.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		else if(opT.equals("GuardarS")) {
			
			Solicitud objSol = new Solicitud();
			
			objSol.setIdAsociado(request.getParameter("txtAsc"));
			objSol.setNcuotas(Integer.parseInt(request.getParameter("txtCts")));
			objSol.setMonto(Float.parseFloat(request.getParameter("txtMnto")));
			objSol.setObservaciones(request.getParameter("txtObs"));
			
			
			try {
				objProcess.CrearSolicitud(objSol);
				System.out.println("registro exitoso");
				RequestDispatcher ruta=request.getRequestDispatcher("index.jsp");
				ruta.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if(opT.equals("GEditAs")) {
			
			Asociado objAsc= new Asociado();
			
			objAsc.setId(request.getParameter("id_work"));
			objAsc.setNombre(request.getParameter("name_work"));
			objAsc.setApellido(request.getParameter("ape_work"));
			objAsc.setEstado(request.getParameter("state_work"));
			objAsc.setSalario(Double.parseDouble(request.getParameter("slr_work")));
			objAsc.setEstudio(request.getParameter("std_work"));
			objAsc.setHijos(Integer.parseInt(request.getParameter("child_work")));
			objAsc.setEps(request.getParameter("eps_work"));
			objAsc.setTelefono(request.getParameter("tlf_work"));
			objAsc.setDireccion(request.getParameter("dir_work"));
			objAsc.setAportes(Double.parseDouble(request.getParameter("apr_work")));

			try {
				objProcess.ActualizarAsociado(objAsc);
				System.out.println(objProcess.Resultado);
				RequestDispatcher ruta = request.getRequestDispatcher("index.jsp");
				ruta.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("genial");
		}
		
		else if(opT.equals("DeleteAs")) {
			
			try {
				objProcess.EliminarAsociado(id);
				System.out.println(objProcess.Resultado);
				RequestDispatcher ruta = request.getRequestDispatcher("index.jsp");
				ruta.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
