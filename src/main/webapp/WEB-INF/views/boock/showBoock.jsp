<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Boock info</title>
</head>
<body>

	<h1>Boock info: </h1>
	<h2> Id:   ${ boockInfo.id }; </h2>
	<h2> Title:   ${ boockInfo.title }; </h2>
	<h2> Description:   ${ boockInfo.description }; </h2>
	<h2> Boock number:   ${ boockInfo.numberOfBoock }; </h2>
	<h2> Price:   ${ boockInfo.price }; </h2>
	<a href="/boocks/loockAllBoock"
		style="text-decoration: none; color: #0a0b0c; font-size: 25px; color: red">Back</a>
</body>
</html>