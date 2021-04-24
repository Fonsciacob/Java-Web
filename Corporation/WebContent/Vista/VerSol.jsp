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
<h1>Solicitud</h1>
<a href="index.jsp" class="link-primary">Volver</a>
	<table class="table">
  <thead>
    <tr>
      <th scope="col">CODIGO</th>
      <th scope="col">ASOCIADO</th>
      <th scope="col">FECHA</th>
      <th scope="col">NRO CUOTAS</th>
      <th scope="col">MONTO</th>
      <th scope="col">TASA ANUAL</th>
      <th scope="col">OBSERVACIONES</th>
      <th scope="col">ESTADO</th>
      <th scope="col">EDITAR</th>
      <th scope="col">ELIMINAR</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach var="Sol" items="${ListaS}">
    <tr>
      <th><c:out value="${Sol.codeSolicitud}"></c:out></th>
      <td><c:out value="${Sol.idAsociado}"></c:out></td>
      <td><c:out value="${Sol.fecha}"></c:out></td>
      <td><c:out value="${Sol.ncuotas}"></c:out></td>
      <td><c:out value="${Sol.monto}"></c:out></td>
      <td><c:out value="${Sol.tasaAnual}"></c:out></td>
      <td><c:out value="${Sol.observaciones}"></c:out></td>
      <td><c:out value="${Sol.estado}"></c:out></td>
      <td><img src="Img/edit (2).svg" style="height:25px; width:25px;"></img></td>
      <td><img src="Img/delete.svg" style="height:23px; width:23px;"></img></td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</body>
</html>