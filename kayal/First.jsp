<%-- 
    Document   : First
    Created on : 04-Jun-2020, 9:49:35 PM
    Author     : ELCOT
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Auto loan Page</title>
<style>
body
    {
        background-color:lightskyblue;
    }
.header {
  padding: 30px;
  text-align: center;
  background: red;
  color: black;
  font-size: 20px;
}
</style>
<div class="header">
    <h3><center>AUTO LOAN COLLECTION FOR 3/6 MONTHS</center></h3>
</div>
<center>
<form action="First With Java.jsp" method="POST">
<table>
<tr>
<td><label>CUSTOMER NAME</label></td>
<td><input type="text" name="customername"></td>
</tr>
<tr>
<td><label for="phone">CUSTOMER MOBILE NO</label></td>
<td> <input type="tel" id="phone" name="mobileno" pattern="[0-9]{10}" required="required"></td>
</tr>
<tr>
<td><label>TYPE OF LOAN</label></td>
<td><input type="text" name="loan" required="required"></td>
</tr>
<tr>
<td><label>LOAN ID</label></td>
<td><input type="number" name="id" required="required"></td>
</tr>
<tr>
<td><label>LOAN AMOUNT</label></td>
<td><input type="number" name="amount" required="required"></td>
</tr>
<tr>
<td><label>DUE MONTH</label></td>
<td><input type="radio" name="duemonth" value="month">3 Months
<input type="radio" name="duemonth" value="month">6 Months<br>
</tr>
<tr>
<td><label>NEEDED DOCUMENTS:</label></td>
<br>
</tr>
<tr>
<td></td>
<td><input type="checkbox" name="doc" value="Aadhar">AADHAR CARD<br>
<input type="checkbox" name="doc" value="Passbook">BANK PASSBOOK<br>
<input type="checkbox" name="doc" value="Voter">VOTER ID<br>
<input type="checkbox" name="doc" value="Loan">LOAN DETAILS<br></td>
</tr>
<tr>   
    <td><center><input type="submit" name="submit" value="CALL" style="background-color: blue"></center></td>
</tr>
</table>
</center>
</html>
