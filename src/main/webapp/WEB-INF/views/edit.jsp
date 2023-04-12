<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="myuser" action="up" method="post">
		<form:label path="name">Name</form:label>
		<form:input path="name"/> <br> <br>
		
		<form:label path="age">Age</form:label>
		<form:input path="age"/> <br> <br>
		
		<form:label path="phone">Phone</form:label>
		<form:input path="phone"/> <br> <br>
		
		<form:label path="password">Password</form:label>
		<form:input path="password"/> <br> <br>
		
		<form:button>Update</form:button>
	</form:form>
	
</body>
</html>