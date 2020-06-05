<%@page import="Customer.CustomerApplication"%> 
<%@page import="java.util.ArrayList"%> 
<%@page import="java.util.List"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Customer-List</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>List of Registered Bidders</h2>
		</div>
	</div>
	<div id="conatiner">
		<div id="content">
			<table >
			
				<tr>
				
					<th>BankID</th>
					<th>AadharID</th>
					<th>Age</th>
					<th>Address</th>
					<th>Salary</th>
				</tr>
				
				<%ArrayList<CustomerApplication> customers =(ArrayList<CustomerApplication>)request.getAttribute("CUSTOMER-LIST");
						for(CustomerApplication tempCustomer:customers){%>
						
						<tr>
							<td><%=tempCustomer.getBankID() %></td>
							<td><%=tempCustomer.getAadharID() %></td>
							<td><%=tempCustomer.getAge() %></td>
							<td><%=tempCustomer.getAddress() %></td>
							<td><%=tempCustomer.getSalary() %></td>
							
						</tr>
				<%} %>
			</table>
		</div>
	</div>
	<br/>
	<br/>
	
	<a href="delete.jsp">Delete Customer</a>


</body>
</html>

    