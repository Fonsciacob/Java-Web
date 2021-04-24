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
	<form action="corp" method="post" class="col-lg-5">
		<input type="hidden" name="opcion" value="GuardarS">
		<p>ID Asociado:<input type="text" class="form-control" name="txtAsc" size=50></p>
		<p>Nro Cuotas:<input type="text" class="form-control" name="txtCts" size=50></p>
		<p>Monto:<input type="text" class="form-control" name="txtMnto" size=50></p>
		<p>Observaciones:<input type="text" class="form-control" name="txtObs" size=50></p>
		<p><input type="submit" value="Guardar" class="btn btn-primary"></p>
	</form>
</body>
</html>