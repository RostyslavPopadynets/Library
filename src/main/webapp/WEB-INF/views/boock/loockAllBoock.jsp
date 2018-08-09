<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loock all boock</title>
</head>
<body>
	<table border="10" align="center" width="80%" cellspacing="0">
		<thead align="center">
			<tr>
				<th>Id</th>
				<th>Title</th>
				<th>Description</th>
				<th>Boock number</th>
				<th>Price</th>
				<th>Show</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody align="center">
			<c:forEach items="${ allBoock }" var="boock">
				<tr>
					<td>${ boock.id }</td>
					<td>${ boock.title }</td>
					<td>${ boock.description }</td>
					<td>${ boock.numberOfBoock }</td>
					<td>${ boock.price }</td>
					<td><a href="/boocks/showBoock/${ boock.id }?title=${ boock.title }"
						style="text-decoration: none; color: #0a0b0c; font-size: 25px; color: blue">show</a></td>
					<td><a href="/boocks/deleteBoock/${ boock.id }"
						style="text-decoration: none; color: #0a0b0c; font-size: 25px; color: blue">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<br>
	<a href="/"
		style="text-decoration: none; color: #0a0b0c; font-size: 25px; color: red">Home</a>
</body>
</html>