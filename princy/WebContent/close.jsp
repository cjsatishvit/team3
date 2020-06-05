<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>closed status</title>
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
		<h1>DISCHARGE OF DEBTS</h1>
		<div class="back">
			<a href="home.html" style="color: white">HOME</a> <a
				href="logout.html" style="color: white">Logout</a>
		</div>
	</header>
<form action="Status" method="post">
	<table>
		<tr>
			<td>Customer Name</td>
			<td><input type="text" name="customername"></td>
		</tr>
		<tr>
			<td>Customer Id</td>
			<td><input type="number" name="customerid"></td>
		</tr>
		<tr>
			<td>Bank Id</td>
			<td><input type="number" name="bankid"></td>
		</tr>
		<tr>
			<td>Meeting Days</td>
			<td><input type="number" name="meetingdays"></td>
		</tr>
		<tr>
			<td>Type of loan</td>
			<td><input type="text" name="loantype"></td>
		</tr>
		<tr>
			<td>loan amount</td>
			<td><input type="number" name="loanamount"></td>
		</tr>
		<tr>
			<td>Loan Id</td>
			<td><input type="number" name="loanid"></td>
		</tr>
		<tr>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="discharge"></td>
			</tr>
		</table>
 </form>
 </body>
 </html>
		