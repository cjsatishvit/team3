<!DOCTYPE html>
<html>
<head>
	<title>Bidding Page</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-customer-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
		
			<h2>Bidding Page</h2>
		
		</div>
	
	
	</div>
	<br/><br/>
	<div id="conatiner">
	<form action="BidderServlet" method="GET">
		<input type="hidden" name="command" value="BID"/>
		<table>
			<tbody>
			<tr>
				<td><label>BankID:</label></td>
				<td><input type="text" name="BankId"/></td>
			</tr>
			<tr>
				<td><label>VehicleID:</label></td>
				<td><input type="text" name="VehicleId"/></td>
			</tr>
			<tr>
				<td><label>BID:</label></td>
				<td><input type="text" name="bid"/></td>
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