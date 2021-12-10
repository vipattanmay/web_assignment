<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:  rgb(238, 164, 164)">
	<div align="center">
		<h2 style="color: green">${msg}</h2>
		<table border="1">
			<tr>
				<td>ID</td>
				<td>User Name</td>
				<td>Age</td>
				<td>Gender</td>
				<td>City</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>



			<c:forEach items="${people}" var="u">
				<tr>
					<td>${u.id}</td>
					<td>${u.userName}</td>
					<td>${u.userAge}</td>
					<td>${u.gender}</td>
					<td>${u.userCity}</td>
					
					<td><a href="updatepeople/${u.id}">Edit</a></td>
					<td><a href="deletepeople/${u.id}">Delete</a></td>
				</tr>
			</c:forEach>



		</table>
		<a href="home">Home Page</a>
	</div>
</body>
</html>