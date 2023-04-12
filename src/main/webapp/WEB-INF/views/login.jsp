<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<html>
<head>
	<style>
		#main{
			width:50%;
			margin:auto;
			margin-top:40px;
			}
		form
		{
			display:block;
			width:50%;
			margin:auto;
			margin-top:40px;
		}	
		
		input
		{
			display:block;
			width:78%;
			border-radius:5px;
			color:green;
			margin:auto;
		}
		
		
		a{
			text-decoration: none;
		}
			
	</style>
</head>
<body>
<c:if test="${message!=null}">
		<h2 style="text-align: center;color:red;">${message}</h2>
	</c:if>
	
	
	<div id="main">
		<form action="login">
		<fieldset>
		<legend style="color: green;">Login</legend>
			<input type="tel" placeholder="Enter Your phone number" name="phone" /> <br> <br>
			<input type="password" placeholder="Enter your password" name="password" /> <br> <br>
			<input type="submit" value="Login">
			
			<h4><a href="load">Click Here To Register</a></h4>
					
		</fieldset>		
		</form>
	</div>
</body>
</html>
