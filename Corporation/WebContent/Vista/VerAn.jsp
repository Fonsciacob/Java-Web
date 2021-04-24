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
<h1>Analistas</h1>
<a href="index.jsp" class="link-primary">Volver</a>
<table class="table">
  <thead>
    <tr>
      <th scope="col">CODIGO ANALISTA</th>
      <th scope="col">CODIGO SOLICITUD</th>
      <th scope="col">ID ASOCIADO</th>
      <th scope="col">ESTADO</th>
      <th scope="col">NOMBRE DEL ANALISTA</th>
      <th scope="col">CONTENIDO</th>
      <th scope="col">EDITAR</th>
      <th scope="col">ELIMINAR</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach var="Anl" items="${ListaAn}">
    <tr>
      <td><c:out value="${Anl.codAnalista}"></c:out></td>
      <td><c:out value="${Anl.codSolicitud}"></c:out></td>
      <td><c:out value="${Anl.idAsociado}"></c:out></td>
      <td><c:out value="${Anl.estado}"></c:out></td>
      <td><c:out value="${Anl.nombre}"></c:out></td>
      <td><c:out value="${Anl.contenido}"></c:out></td>
      <td><img src="Img/edit (2).svg" style="height:25px; width:25px;"></img></td>
      <td><img src="Img/delete.svg" style="height:23px; width:23px;"></img></td>
    </tr>
    </c:forEach>
  </tbody>
</table>
</body>
</html>