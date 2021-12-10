<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:  rgb(160, 240, 11)">

<div align="center">
		<h2 style="color: red">Login Form</h2>
		
	<form:form action="validate" modelAttribute="people">
				<table>
				<tr>
					<td>User Name :</td>
					<td><form:input path="userName"/></td>
				</tr>

				<tr>
					<td>Password :</td>
					<td><form:password path="userPassword"/></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Login"></td>
					<td><input type="reset" value="Clear"></td>
				</tr>
			</table>
		</form:form>
		
		<a href="registeration">New User Register Here</a>
		
		<a href="getall">View All Users</a>
		
		<a href="getpeopleform">Get User</a>
	</div>
</body>
</html>