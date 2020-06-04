<%-- 
    Document   : Second With Java
    Created on : 04-Jun-2020, 9:50:33 PM
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
String customerid=request.getParameter("customerid");
String name=request.getParameter("name");
String mobileno=request.getParameter("mobileno");
String bankid=request.getParameter("bankid");
String loan=request.getParameter("loan");
String amount=request.getParameter("amount");
String duemonth=request.getParameter("duemonth");
String doc=request.getParameter("doc");
String comment=request.getParameter("comment");
if(customerid.isEmpty()||name.isEmpty()||mobileno.isEmpty()||bankid.isEmpty()||loan.isEmpty()||amount.isEmpty()||doc.isEmpty()||duemonth.isEmpty()||comment.isEmpty())
{
try
{
Connection conn=null;
Statement st=null;
Class.forName("com.mysql.jdbc.Driver");
conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/kayal_sdd","root","");
st=conn.createStatement();
String qry="INSERT INTO table2(customerid,name,mobileno,loan,amount,duemonth,doc,comment)" + "VALUES('"+customerid+"','"+name+"','"+mobileno+"','"+loan+"','"+amount+"','"+duemonth+"','"+doc+"','"+comment+"')";
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
response.sendRedirect("End Page.jsp");
}
%>
</body>
</html>
