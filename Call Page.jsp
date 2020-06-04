<%-- 
    Document   : Call Page
    Created on : 04-Jun-2020, 9:50:52 PM
    Author     : ELCOT
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<style>
body
    {
        background-color:lightskyblue;
    }
.header {
  padding: 190px;
  text-align: center;
  background:red;
  color: black;
  font-size: 50px;
}
</style>
<body>
    
<div class="header">
    <span style='font-size:100px;'>&#9742;</span>
    <h6><center>CALL TO THE CUSTOMER SUCCESSFULLY!!!</center></h6>
</div>
    <br>
<form action="Second.jsp" method="get">
<input type="submit" name="submit" value="NEXT PAGE" style="background-color: blue">
</form>
</body>
</html>