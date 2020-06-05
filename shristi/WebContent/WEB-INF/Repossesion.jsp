<%@page import="java.util.Iterator"%>
<%@page import="repossession_notices.User_Bean"%>
<%@page import="java.util.List"%>
<%@page import="repossessions.noticegeneration"%>
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
        <h3>foreclosure</h3>
        <div align ="center" style="width:450px; height:300px; background: mistyrose;border-radius: 40px;">

        <form action="controller1/insert_notice.jsp" method="post">
        <pre><br><br><br>
FirstName : <input type="text" name="FirstName"><br>
LastName:   <input type="text" name="LastName"><br>
LoanId:     <input type="text" name="LoanId"><br>
DefaulterId: <input type="text" name="DefaulterId"><br>



<input type="submit" value="Generate Notice">
</pre>
</form>
</div>

<hr>


<%
noticegeneration obj_noticegeneration=new noticegeneration();
List<User_Bean> list=obj_noticegeneration.get_values(); 
Iterator<User_Bean> it_list=list.iterator();
%>
<table border="1">
<%
while(it_list.hasNext()){
	User_Bean obj_User_Bean=new User_Bean();
	obj_User_Bean=it_list.next();
	
	
%>
			<tr>	
					<td><%=obj_User_Bean.getFirstName() %></td>
					<td><%=obj_User_Bean.getLastName() %></td>
					<td><%=obj_User_Bean.getLoanId() %></td>
					<td><%=obj_User_Bean.getDefaulterId() %></td>	


			</tr>
<%	 
}
%>
</table>



        <a href ="collector.jsp"><button type="button" style="background-color: mintcream; border-radius: 10px;width: 100px;height:30px;">Back</button></a><br><br>
</body>
</html> 