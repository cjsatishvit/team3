<!DOCTYPE html>
<html>
<head>
	<title>APPLICATION FORM</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-customer-style.css">
</head>

<body>
	<div id="wrapper">
		<div id="header">
		
			<h2>Welcome to Application Page</h2>
		
		</div>
	
	
	</div>
	<br/>
	<div id="container">
		<h4>Enter Your Details Here: </h4>
		
		<form action="BidderServlet" method="GET">
			
				<input type="hidden" name="command" value="VALIDITY"/>
				
				<table>
					<tbody>
						<tr>
							<td><label>BankID:</label></td>
							<td><input type="text" name="BankId"/></td>
						</tr>
						
						<tr>
							<td><label>AadharID:</label></td>
							<td><input type="text" name="AadharId"/></td>
						</tr>
						
						<tr>
							<td><label>Age:</label></td>
							<td><input type="text" name="age"/></td>
						</tr>
						
						<tr>
							<td><label>Address:</label></td>
							<td><input type="text" name="address"/></td>
						</tr>
						
						<tr>
							<td><label>Salary:</label></td>
							<td><input type="text" name="salary"/></td>
						</tr>
						
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save"/></td>
						</tr>
					
					</tbody>
				</table>
			</form>
		</div>
	



</body>

</html>