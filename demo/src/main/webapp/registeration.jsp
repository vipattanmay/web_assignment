<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:  crimson">
	<div align="center">
		<h2 style="color: black">User Registration Form</h2>
		<h1 style="color: black">${msg}</h1>
	<form:form action="submitform" modelAttribute="people" enctype="multipart/form-data">
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
					<td>User Age :</td>
					<td><form:input path="userAge"/></td>
				</tr>
				<tr>
					<td>Gender :</td>
					<td>Male<form:radiobutton path="gender" value="Male"/>  
           			Female<form:radiobutton path="gender" value="Female"/></td>
				</tr>
				<tr>
					<td>City :</td>
					<td><form:select path="userCity">  
        <form:option value="Ghaziabad" label="Ghaziabad"/>  
        <form:option value="Modinagar" label="Modinagar"/>  
        <form:option value="Meerut" label="Meerut"/>  
        <form:option value="Amristar" label="Amristar"/>  
        </form:select></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Register User"></td>
					<td><input type="reset" value="Clear"></td>
				</tr>
			</table>
		</form:form>
		
		<a href="home">Home Page</a>
	</div>
</body>
</html>