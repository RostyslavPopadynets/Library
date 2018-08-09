<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loock all autor</title>
</head>
<body>
	<table border="10" align="center" width="80%" cellspacing="0">
		<thead align="center">
			<tr>
				<th>Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Age</th>
				<th>Show</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody align="center">
			<c:forEach items="${ allAutor }" var="autor">
				<tr>
					<td>${ autor.id }</td>
					<td>${ autor.firstName }</td>
					<td>${ autor.lastName }</td>
					<td>${ autor.email }</td>
					<td>${ autor.age }</td>
					<td><a href="/autors/showAutor/${ autor.id }?email=${ autor.email }"
						style="text-decoration: none; color: #0a0b0c; font-size: 25px; color: blue">show</a></td>
					<td><a href="/autors/deleteAutor/${ autor.id }"
						style="text-decoration: none; color: #0a0b0c; font-size: 25px; color: blue">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>		
	</table>
	<br> <br>
	<a href="/" style="text-decoration: none;	color: #0a0b0c;	
	font-size: 25px; color: red">Home</a>
</body>
</html>