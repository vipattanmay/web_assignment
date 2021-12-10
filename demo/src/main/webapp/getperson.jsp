<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body  style="background-color:  rgb(203, 248, 3)">

<div>
	<h3>${msg}</h3>
	<form action="getbyid" method="post">
		User ID : <input type="text" name="id">
		<input type="submit" value="Get User">
	</form>
</div>

</body>
</html>