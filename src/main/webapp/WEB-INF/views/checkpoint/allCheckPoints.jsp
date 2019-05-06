<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/css/bootstrap.css" rel="stylesheet" media="screen">
<title>Todos Pontos</title>
</head>
<body>
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/addUser">Add CheckPoint</a>
	<br>
	<h3>List of all checkpoints</h3>
	${message}
	<br>
	<br>
	<table border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<th>Data Ponto</th>
				<th>Hora Entrada</th>
				<th>Hora Saida</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach var="checkPoint" items="${checkPointList}">
				<tr>
					<td>${checkPoint.dataPonto}</td>
					<td>${checkPoint.horaEntrada}</td>
					<td>${checkPoint.horaEntrada}</td>
					<td><a
						href="${pageContext.request.contextPath}/editUser/${checkPoint.id}">Edit</a></td>
					<td><a
						href="${pageContext.request.contextPath}/deleteUser/${checkPoint.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>


	</table>
</body>
</html>