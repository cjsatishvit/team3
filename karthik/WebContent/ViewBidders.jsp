<!DOCTYPE html>
<html>
<head>
	<title>View Bidder</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-customer-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
		
			<h2>Click the below button to view Bidder's List</h2>
		
		</div>
	
	
	</div>
	<form action="BidderServlet" method="GET">
		<input type="hidden" name="command" value="VIEW"/>
		<input type="submit" value="View List of Bidders"/>
	</form>
</body>
</html>