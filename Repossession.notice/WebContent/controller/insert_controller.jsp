<%@page import="repossessions.Insert_Values"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String FirstName=request.getParameter("FirstName");
String LastName=request.getParameter("LastName");
String LoanId=request.getParameter("LoanId");
String DefaulterId =request.getParameter("DefaulterId");
 
Insert_Values obj_Insert_Values=new Insert_Values();
obj_Insert_Values.insert_values(FirstName, LastName, LoanId, DefaulterId);
%>
SUCCESS


</script>
</body>
</html> 