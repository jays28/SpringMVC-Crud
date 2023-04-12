
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Login successful, welcome mr :${user.getName()}</h2>
	<h2><a href="profile">Profile</a></h2> 
	<h2><a href="edit">Edit</a></h2> 
	<h2><a href="delete" onclick="return fun1()">Delete Account</a></h2>
	<h2><a href="logout" onclick="return fun2()">Logout</a></h2> 
	
	<script type="text/javascript">
		function fun1()
		{
			var res=confirm("Are you sure you want to delete account ?");
			return res;
		}
		
		function fun2()
		{
			var r=confirm("Are you sure you want to Logout ?");
			return r;
		}
	</script>
</body>
</html>