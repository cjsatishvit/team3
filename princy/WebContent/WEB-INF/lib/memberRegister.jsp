<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta  http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Notice page</title>
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
		<h1>BANKRUPTCY Notice</h1>
		<div class="back">
			<a href="home.html" style="color: white">HOME</a> <a
				href="logout.html" style="color: white">Logout</a>
		</div>
	</header>
	<form action="Register" method="post">
		<table>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="customername"></td>
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
				<td><input type="number" name="amount"></td>
			</tr>
			<tr>
				<td>Bankruptcy Id</td>
				<td><input type="number" name="bankruptcyid"></td>
			</tr>
			<tr>
				<td>Aadharno</td>
				<td><input type="number" name="aadharno"></td>
			</tr>
			<tr>
				<td>Accountno</td>
				<td><input type="number" name="accountno"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="apply"></td>
			</tr>

		</table>
	</form>
</body>
</html>