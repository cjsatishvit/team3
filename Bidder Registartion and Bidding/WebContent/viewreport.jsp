<!DOCTYPE html>
<html>
<head>
	<title>REPORT</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-customer-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>WELCOME TO REPORT PAGE!!</h2>
		</div>
	</div>
	<form action="BidderServlet" method="GET">
		<input type="hidden" name="command" value="VIEWREPORT"/>
		<br/><br/>
		<input type="submit" value="View Report">
	</form>
</body>
</html>