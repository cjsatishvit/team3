<!DOCTYPE html>
<html>
<head>
	<title>GOTO PAGE</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-customer-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
		
			<h2>The Bid is Successfully Submitted</h2>
		
		</div>
	</div>
	<form action="BidderServlet" method="GET">
		<input type="hidden" name="command" value="STATUS"/>
		<input type="submit" value="VIEW STATUS"/>
	</form>
</body>
</html>