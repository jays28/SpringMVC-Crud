<%@page import="org.jsp.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%User u=(User)session.getAttribute("user"); %>
	<h2>Your profile details are : </h2>
	<h2>Name : <%=u.getName() %></h2>
	<h2>Age : <%=u.getAge() %></h2>
	<h2>Phone number : <%=u.getPhone()%></h2>
	</body>
</html>