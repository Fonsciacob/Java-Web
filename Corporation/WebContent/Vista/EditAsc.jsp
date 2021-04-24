<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<link href="Img" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
<h1>Editar Asociado</h1>
	
	<form action="corp" method="post">
	<input type="hidden" name="opcion" value="GEditAs">
		<c:forEach var="Asc" items="${Lista}"> 
	      <div class="col-sm-5">
	      	<input type="text" class="form-control" name="txtId" value="${Asc.id}">
	      </div>
	      <div>
	      	<p>Nombres:<input type="text" class="form-control" name="txtNom" value="${Asc.nombre}"></p>
	      </div>
	      <div>
	      	<p>Apellidos:<input type="text" class="form-control" name="txtAp" value="${Asc.apellido}"></p>
	      </div>
	      <div class="col-sm-5 d-flex">
	      	<p>Estado:</p>
			<div class="d-flex">
				<div class="form-check ms-3">
	  				<input class="form-check-input" type="radio" name="RadioS" id="RadioS" value="Soltero">
	  				<label class="form-check-label" for="RadioS">
	    			Soltero(a)
	  				</label>
				</div>
				<div class="form-check ms-3">
	  				<input class="form-check-input" type="radio" name="RadioS" id="RadioS2" value="Casado">
	  				<label class="form-check-label" for="RadioS2">
	    			Casado(a)
	  				</label>
				</div>
				<div class="form-check ms-3">
	  				<input class="form-check-input" type="radio" name="RadioS" id="RadioS3" value="Divorciado">
	  				<label class="form-check-label" for="RadioS3">
	    			Divorciado(a)
	  				</label>
				</div>
			</div>
	      </div>
	      <div>
	      	<p>Salario:<input type="text" class="form-control" name="txtSlr" value="${Asc.salario}"></p>
	      </div>
	      <div>
	      	<p>Estudios:<input type="text" class="form-control" name="txtEstd" value="${Asc.estudio}"></p>
	      </div>
	      <div>
	      	<p>Hijos:<input type="text" class="form-control" name="txtHjs" value="${Asc.hijos}"></p>
	      </div>
	      <div>
	      	<p>Eps:<input type="text" class="form-control" name="txtEps" value="${Asc.eps}"></p>
	      </div>
	      <div>
	      	<p>Telefono:<input type="text" class="form-control" name="txtTlf" value="${Asc.telefono}"></p>
	      </div>
	      <div>
	      	<p>Direccion:<input type="text" class="form-control" name="txtDir" value="${Asc.direccion}"></p>
	      </div>
	      <div>
	      	<p>Aportes:<input type="text" class="form-control" name="txtApr" value="${Asc.aportes}"></p>
	      </div>
		<div class="col-sm-5">
			<p><input type="submit" class="btn btn-primary" value="Guardar"></p>
		</div>
		</c:forEach>
	</form>	
</body>
<script type="text/javascript" src="JS/script.js"></script>
</html>