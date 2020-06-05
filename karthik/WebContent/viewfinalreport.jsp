<%@page import="Customer.ReportClass"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%> 

<!DOCTYPE html>
<html>
<head>
	<title>FINAL REPORT</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>FINAL REPORT</h2>
		</div>
	</div>
	<br/><br/>
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>VehicleID</th>
					<th>BankID</th>
					<th>HIGHEST BID</th>
				</tr>
				
				<%ArrayList<ReportClass> reports =(ArrayList<ReportClass>)request.getAttribute("REPORT-LIST");
						for(ReportClass tempReports:reports){%>
						
						<tr>
							<td><%=tempReports.getVehicleID() %></td>
							<td><%=tempReports.getBankID() %></td>
							<td><%=tempReports.getHighestBid() %></td>
							
						</tr>
				<%} %>
		
			</table>
		</div>
	</div>
	
</body>
</html>