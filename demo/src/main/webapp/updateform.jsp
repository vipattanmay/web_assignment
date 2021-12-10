<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:  rgb(102, 69, 88)">
	<div align="center">
		<h2 style="color: red">User Update Form</h2>
		<h1 style="color: red">${msg}</h1>
		<form:form action="/saveupdate" modelAttribute="people">
			<table>
				<tr>
					<td>ID :</td>
					<td><form:input path="id" /></td>
				</tr>
				<tr>
					<td>User Name :</td>
					<td><form:input path="userName" /></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><form:password path="userPassword" /></td>
				</tr>
				<tr>
					<td>User Age :</td>
					<td><form:input path="userAge" /></td>
				</tr><tr>
					<td>Gender :</td>
					<td>Male<form:radiobutton path="gender" value="Male"/>  
           			Female<form:radiobutton path="gender" value="Female"/></td>
				</tr>
				<tr>
					<td>City :</td>
					<td><form:input path="userCity" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="Update User"></td>
					<td><input type="reset" value="Clear"></td>
				</tr>
			</table>
		</form:form>

		<a href="home">Home Page</a>
	</div>
</body>
</html>