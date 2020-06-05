<%@page import="java.util.Iterator"%>
<%@page import="repossession_notices.User_Bean"%>
<%@page import="java.util.List"%>
<%@page import="repossessions.Read_Values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
 <h3 style="background-color:mistyrose;"> VIT BANK</h3>
        <hr><br>
        </center>
<center>
<h1>Insert Values</h1>
<div align ="center" style="width:450px; height:300px; background: mistyrose;border-radius: 40px;">

<form action="controller/insert_controller.jsp">

<table border="1">
 <pre><br><br><br>
FirstName :  <input type="text" name="FirstName"><br>
LastName:    <input type="text" name="LastName"><br>
LoanId:      <input type="text" name="LoanId"><br>
DefaulterId: <input type="text" name="DefaulterId"><br>



 <input type="submit" value="Insert"> 
</pre>

</form>
</div>
</table>

<a href ="collector.jsp"><button type="button" style="background-color: mintcream; border-radius: 10px;width: 100px;height:30px;">Back</button></a><br><br>

</center>
</body>
</html> 