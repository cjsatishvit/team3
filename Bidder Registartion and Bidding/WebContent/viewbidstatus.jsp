<%@page import="Customer.BiddingClass"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%> 

<!DOCTYPE html>
<html>
<head>
	<title>VIEW BID STATUS</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>BIDDING STATUS</h2>
		</div>
	</div>
	<br/><br/>
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>BankID</th>
					<th>VehicleID</th>
					<th>BID</th>
				</tr>
				
				<%ArrayList<BiddingClass> bids =(ArrayList<BiddingClass>)request.getAttribute("BID-LIST");
						for(BiddingClass tempBids:bids){%>
						
						<tr>
							<td><%=tempBids.getBankID() %></td>
							<td><%=tempBids.getVehicleID() %></td>
							<td><%=tempBids.getBid() %></td>
							
						</tr>
				<%} %>
		
			</table>
		</div>
	</div>
	<br/><br/>
	<a href="bid.jsp">BID AGAIN?</a>
	<br/><br/>
	
</body>
</html>