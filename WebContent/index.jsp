<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Auction - Welcome</title>
</head>
<body>
	<h1>Welcome to the Auction</h1>
	<h3>Admin Login</h3>
	<form action="./Control" method="post">
		<p>Username:</p>
		<input type="text" name="username"/>
		<p>Password:</p>
		<input type="password" name="password"/>
		<input type="submit" value="Log In">
	</form>
	<br>
	<br>
	<a href="./Control?userId=guest">Proceed as guest</a>
</body>
</html>