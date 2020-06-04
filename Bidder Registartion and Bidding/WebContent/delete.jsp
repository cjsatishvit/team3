<!DOCTYPE html>
<html>
<head>
	<title>REJECTION OF APPLICATION</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-customer-style.css">
</head>

<body>

	<h1>REJECT AN APPLICATION</h1>
	<form action="BidderServlet" method="GET">
	
		<input type="hidden" name="command" value="DELETE"/>
		
		<p>Enter the BankID of the Application you Want To Delete</p>
		<br/><br/>
		BankID:<input type="text" name="BankId"/>
		
		<br/><br/>
		<input type="Submit" value="Delete" class="save"/>
	
	
	</form>


</body>
	



</html>