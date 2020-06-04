<%-- 
    Document   : First With Java
    Created on : 04-Jun-2020, 9:49:54 PM
    Author     : ELCOT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<title>JSP Page</title>
</head>
<body>
<%
String customername=request.getParameter("customername");
String mobileno=request.getParameter("mobileno");
String loan=request.getParameter("loan");
String id=request.getParameter("id");
String amount=request.getParameter("amount");
String duemonth=request.getParameter("duemonth");
String doc=request.getParameter("doc");
if(customername.isEmpty()||loan.isEmpty()||id.isEmpty()||amount.isEmpty()||duemonth.isEmpty()||doc.isEmpty())
{
try
{
Connection conn=null;
Statement st=null;
Class.forName("com.mysql.jdbc.Driver");
conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/kayal_sdd","root","");
st=conn.createStatement();
String qry="INSERT INTO table1(customername,mobileno,loan,id,amount,duemonth,doc)" + "VALUES('"+customername+"','"+mobileno+"','"+loan+"','"+id+"','"+amount+"','"+duemonth+"','"+doc+"')";
st.executeUpdate(qry);

out.print("data inserted successfuly");
}
catch(Exception ex)
{
out.print(ex.getMessage());
}
{
response.sendRedirect("Error.jsp");
}
}
else
{
response.sendRedirect("Call Page.jsp");
}
%>
</body>
</html>