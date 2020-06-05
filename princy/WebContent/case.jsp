<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
<title>case filed</title>
<style>
.back {
	text-align: right;
	color: white;
	padding: 30px:
}

h1 {
	color: white;
}
</style>
</head>
<body>
	<header style="background-color: black">
		<h1>BANKRUPTCY CASE FILED</h1>
		<div class="back">
			<a href="home.html" style="color: white">HOME</a> <a
				href="logout.html" style="color: white">Logout</a>
		</div>
	</header>
	<form action="File" method="post">
		<table>
			<tr>
				<td>Court Name</td>
				<td><input type="text" name="courtname"></td>
			</tr>
			<tr>
				<td>Court Id</td>
				<td><input type="number" name="courtid"></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="customername"></td>
			</tr>
			<tr>
				<td>Customer Id</td>
				<td><input type="number" name="customerid"></td>
			</tr>
			<tr>
				<td>Attorney Name</td>
				<td><input type="text" name="attorneyname"></td>
			</tr>
			<tr>
				<td>Attorney Address</td>
				<td><input type="text" name="attorneyaddress"></td>
			</tr>
			<tr>
				<td>Type of Loan</td>
				<td><input type="text" name="loantype"></td>
			</tr>
			<tr>
				<td>Loan Id</td>
				<td><input type="number" name="loanid"></td>
			</tr>
			<tr>
				<td>Loan Amount</td>
				<td><input type="text" name="loanamount"></td>
			</tr>
			<tr>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
 </form>
</body>
</html>