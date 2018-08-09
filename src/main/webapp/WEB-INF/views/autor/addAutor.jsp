<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add autor</title>
</head>
<body>
<style>
	label {
		font-size: 25px;
	}
	</style>

	<form action="/autors/add-autor" method="post">
		<label>First Name: <br> <input type="text" name="firstName">
		</label> <br> <label>Last Name: <br> <input type="text" name="lastName">
		</label> <br> <label>Email: <br> <input type="text"
			name="email">
		</label> <br> <label>Age: <br> <input type="text"
			name="age">
		</label> <br> <br> <input type="submit" value="Додати"> <input
			type="reset" value="Очистити">
	</form>
</body>
</html>