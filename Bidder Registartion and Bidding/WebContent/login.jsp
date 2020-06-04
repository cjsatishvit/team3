<!DOCTYPE html>

<html>
<head>
	<title>LOGIN PAGE</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-customer-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
		
			<h2>WELCOME TO THE LOGIN PAGE</h2>
		
		</div>
	</div>
	<div id="container">
		<form action="BidderServlet" method="GET">
			<input type="hidden" name="command" value="LOGIN"/>
			<table>
				<tbody>
						<tr>
							<td><label>BankID:</label></td>
							<td><input type="text" name="BankId"/></td>
						</tr>
						
						<tr>
							<td><label>Password:</label></td>
							<td><input type="password" name="password"/></td>
						</tr>
						
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="LOGIN" class="save"/></td>
						</tr>
					
					</tbody>
			</table>
		</form>
	</div>
</body>
</html>