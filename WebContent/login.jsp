<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="CSS/bootstrap.css"/>
</head>
<body>
<div class="container">
	<h1>Login Page</h1>

	<form action="/CrowdFunding/LoginAction" method="post">
		<div class="errorMessage">${errorMessage}</div>
		Username:
		<input type="text" name="username" class="form-control"/>
		Password:
		<input type="password" name="password" class="form-control"/>
		<button class="btn btn-primary btn-block">Submit</button>
	</form>
</div>
</body>
</html>