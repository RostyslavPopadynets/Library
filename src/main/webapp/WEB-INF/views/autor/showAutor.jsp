<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Autor info</title>
</head>
<body>

<h1>Autor info: </h1>
	<h2> Id:   ${ autorInfo.id }; </h2>
	<h2> First Name:   ${ autorInfo.firstName }; </h2>
	<h2> Last Name:   ${ autorInfo.lastName }; </h2>
	<h2> Email:   ${ autorInfo.email }; </h2>
	<h2> Age:   ${ autorInfo.age }; </h2>
	<a href="/autors/loockAllAutor"
		style="text-decoration: none; color: #0a0b0c; font-size: 25px; color: red">Back</a>
</body>
</html>