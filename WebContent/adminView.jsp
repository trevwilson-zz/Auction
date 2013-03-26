<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Control Panel</title>
</head>
<body>
	<h1>Welcome to the Admin Control Panel</h1>
	<h3>Current items and highest bids</h3>
	<table border="1">
		<tr><td>Item1</td><td>100</td></tr>
		<tr><td>Item2</td><td>200</td></tr>
	</table>
	<h3>Enter a new item:</h3>
	<form>
		<div>Item Name</div>
		<input type="text" name="newItemName"/>
		<br>
		<div>Minimum Bid</div>
		<input type="text" name="newItemMinimum"/>
		<br>
		<input type="Submit" value="Submit"/>
	</form>

</body>
</html>