<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add boock</title>
</head>
<body>
	<style>
	label {
		font-size: 25px;
	}
	</style>

	<form action="/boocks/add-boock" method="post">
		<label>Title: <br> <input type="text" name="title">
		</label> <br> <label>Description: <br> <textarea
				name="description" cols="40" rows="3"></textarea>
		</label> <br> <label>Boock number: <br> <input type="text"
			name="numberOfBoock">
		</label> <br> <label>Price: <br> <input type="text"
			name="price">
		</label> <br> <br> <input type="submit" value="Додати"> <input
			type="reset" value="Очистити">
	</form>

</body>
</html>