<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="mvc.app.process.Procesos"%>
<%@page import="mvc.app.model.Asociado"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>

<% Procesos objPro= new Procesos();%>
<% List<Asociado> VistaPrd= new ArrayList<>(); %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<link href="Img" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>
	<h1>CORPORATION M.A.S</h1>
</header>
	
	<div class="d-flex">
		<div>
			<a href="corp?opcion=Crear" class="btn btn-primary">Nuevo Asociado</a>
			<a href="corp?opcion=CrearS" class="btn btn-light">Nueva Solicitud</a>	
		</div>
		<div>
		<a href="corp?opcion=VerS" class="btn btn-danger">Ver Solicitud</a>	
		<a href="corp?opcion=VerAn" class="btn btn-danger">Ver Analistas</a>
		</div>	
	</div>


	<h1 style="text-align:center;">Asociados</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">NOMBRES</th>
      <th scope="col">APELLIDOS</th>
      <th scope="col">ESTADO</th>
      <th scope="col">DNI</th>
      <th scope="col">SALARIO</th>
      <th scope="col">ESTUDIOS</th>
      <th scope="col">HIJOS</th>
      <th scope="col">EPS</th>
      <th scope="col">TELEFONO</th>
      <th scope="col">DIRECCIÓN</th>
      <th scope="col">APORTES</th>
      <th scope="col">EDITAR</th>
      <th scope="col">ELIMINAR</th>
    </tr>
  </thead>
  <tbody>
	<%VistaPrd=objPro.VistaAsociado();
	request.setAttribute("Lista", VistaPrd);%>
	<c:forEach var="Asc" items="${Lista}"> 
    <tr>
      <td><c:out value="${Asc.id}"></c:out></td>
      <td><c:out value="${Asc.nombre}"></c:out></td>
      <td><c:out value="${Asc.apellido}"></c:out></td>
      <td><c:out value="${Asc.estado}"></c:out></td>
      <td><c:out value="${Asc.DNI}"></c:out></td>
      <td><c:out value="${Asc.salario}"></c:out></td>
      <td><c:out value="${Asc.estudio}"></c:out></td>
      <td><c:out value="${Asc.hijos}"></c:out></td>
      <td><c:out value="${Asc.eps}"></c:out></td>
      <td><c:out value="${Asc.telefono}"></c:out></td>
      <td><c:out value="${Asc.direccion}"></c:out></td>
      <td><c:out value="${Asc.aportes}"></c:out></td>
      
      <td>
      	<a href="#" data-bs-toggle="modal" data-bs-target="#editWorkModal" data-id="${Asc.id}" data-name="${Asc.nombre}" data-ape="${Asc.apellido}"
      	data-state="${Asc.estado}" data-slr="${Asc.salario}" data-study="${Asc.estudio}" data-child="${Asc.hijos}"
      	data-eps="${Asc.eps}" data-tlf="${Asc.telefono}" data-dir="${Asc.direccion}" data-apr="${Asc.aportes}">
      		<img src="Img/edit (2).svg" style="height:25px; width:25px;"></img>
      	</a>
      </td>
      <td><a href="" data-bs-toggle="modal" data-bs-target="#deleteAsc" data-id="${Asc.id}" onclick="deleteAs(event);"><img src="Img/delete.svg" style="height:23px; width:23px;"  data-id="${Asc.id}"></img></a></td>
    </tr>
    </c:forEach>
  </tbody>
</table>

<!-- MODAL EDITAR -->
<div class="modal fade" id="editWorkModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-dialog-scrollable modal-dialog-centered">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Editar Asociado</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
		<form action="corp" method="post" id="editWork">
		<input type="hidden" name="opcion" value="GEditAs">
		
			<div class="form-group" hidden>
                <label for="recipient-name" class="col-form-label">Id:</label>
                <input type="text" class="form-control" id="id_work" name="id_work">
            </div>
            
            <div class="form-group">
                <label for="recipient-name" class="col-form-label">Nombres:</label>
                <input type="text" class="form-control" id="name_work" name="name_work">
            </div>

            <div class="form-group">
                <label for="recipient-name" class="col-form-label">Apellidos:</label>
                <input type="text" class="form-control" id="ape_work" name="ape_work">
            </div>
            			            
            <div class="form-group">
                <label for="recipient-name" class="col-form-label">Estado:</label>
                <input type="text" class="form-control" id="state_work" name="state_work">
            </div>
 
         
            <div class="form-group">
                <label for="recipient-name" class="col-form-label">Salario:</label>
                <input type="text" class="form-control" id="slr_work" name="slr_work">
            </div>       
            
            <div class="form-group">
                <label for="recipient-name" class="col-form-label">Estudio:</label>
                <input type="text" class="form-control" id="std_work" name="std_work">
            </div>
            
            <div class="form-group">
                <label for="recipient-name" class="col-form-label">Hijos:</label>
                <input type="text" class="form-control" id="child_work" name="child_work">
            </div>
            
            <div class="form-group">
                <label for="recipient-name" class="col-form-label">Eps:</label>
                <input type="text" class="form-control" id="eps_work" name="eps_work">
            </div>
 
             <div class="form-group">
                <label for="recipient-name" class="col-form-label">Telefono:</label>
                <input type="text" class="form-control" id="tlf_work" name="tlf_work">
            </div>

            <div class="form-group">
                <label for="recipient-name" class="col-form-label">Direccion:</label>
                <input type="text" class="form-control" id="dir_work" name="dir_work">
            </div>
            
            <div class="form-group">
                <label for="recipient-name" class="col-form-label">Aportes:</label>
                <input type="text" class="form-control" id="apr_work" name="apr_work">
            </div>  
            <br>            
      		<div class="modal-footer">
       		 	<button type="button" class="btn btn-danger" data-bs-dismiss="modal">Cancelar</button>
        		<button type="submit" class="btn btn-primary">Guardar Cambios</button>
      		</div>
        </form>
      </div>
    </div>
  </div>
</div>

<!-- MODAL ELIMINAR -->

<div class="modal fade" id="deleteAsc" tabindex="-1" aria-labelledby="deleteAscLabel" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Eliminar Asociado</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <form action="corp" method="post" id="deleteWork">
      <div class="modal-body" id="cont">
        	<input type="hidden" name="opcion" value="DeleteAs">
        	<input type="text" id="idAsc" name="id" hidden>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Cancelar</button>
        <button type="submit" class="btn btn-primary">Aceptar</button>
      </div>
      </form>
    </div>
  </div>
</div>
</body>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="JS/Modals.js"></script>
</html>