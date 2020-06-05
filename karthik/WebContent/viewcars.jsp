<%@page import="Customer.RepossessedCars"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.ArrayList"%> 

<!DOCTYPE html>
<html>
<head>
	<title>CARS VIEW LIST</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Repossessed Vehicle List</h2>
		</div>
	</div>
	<br/><br/>
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>VehicleID</th>
					<th>VehicleName</th>
					<th>VehicleColor</th>
					<th>BasePrice</th>
					<th>VehicleCompany</th>
					<th>Tenure</th>
				</tr>
				<%ArrayList<RepossessedCars> cars =(ArrayList<RepossessedCars>)request.getAttribute("CARS_LIST");
						for(RepossessedCars tempVehicle:cars){%>
						
						<tr>
							<td><%=tempVehicle.getVehicleID() %></td>
							<td><%=tempVehicle.getVehicleName() %></td>
							<td><%=tempVehicle.getVehicleColor() %></td>
							<td><%=tempVehicle.getBasePrice() %></td>
							<td><%=tempVehicle.getVehicleCompany() %></td>
							<td><%=tempVehicle.getTenure() %></td>
							
						</tr>
				<%} %>
			</table>
		</div>
	</div>
	<br/><br/>
	<a href="bid.jsp">Go For Bidding</a>


</body>
</html>