<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
</head>
<body>
<h1>Nuevo Asociado</h1>
	<form action="corp" method="post">
		<input type="hidden" name="opcion" value="Guardar">
		<div class="col-sm-5">
			<p>Nombres:<input type="text" class="form-control" name="txtNom" size=50></p>
		</div>
		<div class="col-sm-5">
			<p>Apellidos:<input type="text" class="form-control" name="txtDes" size=50></p>
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
		<div class="col-sm-5">
			<p>DNI:<input type="text" class="form-control" name="txtDni" size=50></p>
		</div>
		<div class="col-sm-5">
			<p>Salario:<input type="text" class="form-control" name="txtSlr" size=50></p>
		</div>
		<div class="col-sm-5">
			<p>Estudios:<input type="text" class="form-control" name="txtStd" size=50></p>
		</div>
		<div class="col-sm-5">
			<p>Hijos:<input type="number" class="form-control" name="txtHij" size=50></p>
		</div>
		<div class="col-sm-5">
			<p>Eps:<input type="text" class="form-control" name="txtEps" size=50></p>
		</div>
		<div class="col-sm-5">
			<p>Telefono:<input type="text" class="form-control" name="txtTel" size=50></p>
		</div>
		<div class="col-sm-5">
			<p>Direccion:<input type="text" class="form-control" name="txtDir" size=50></p>
		</div>
		<div class="col-sm-5">
			<p>Aportes:<input type="text" class="form-control" name="txtApr" size=50></p>
		</div>
		<div class="col-sm-5">
			<p><input type="submit" class="btn btn-primary" value="Guardar"></p>
		</div>
		
	</form>
</body>
</html>