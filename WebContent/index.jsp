<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CrowdFunding</title>
<link rel="stylesheet" href="CSS/bootstrap.css"/>
</head>
<body>
	<nav class="navbar navbar-inverse" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="/CrowdFunding/index.jsp">CrowdFunding</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="#">Project</a></li>
				<li><a href="#">Investor</a></li>
			</ul>
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="search">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/CrowdFunding/login.jsp">Sign in</a></li>
				<li><a href="#">Join</a>
			</ul>
		</div>
	</nav>
</body>
</html>