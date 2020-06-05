<%@page import="java.sql.*"%>
<%@page import="repossessions.Property"%>
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
 <h3 style="background-color:mistyrose;">VIT BANK</h3>

   <div align ="center" style="width:450px; height:300px; background: mistyrose;border-radius: 40px;">
    <%
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Property","root","");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from propertiess;");
    %><table border=1 align=center style="text-align:center">
      <thead>
          <tr>
             <th>BaseValue</th>
             <th>AuctionId</th>
             <th>Address</th>

          </tr>
      </thead>
      <tbody>
        <%while(rs.next())
        {
            %>
            <tr>
                <td><%=rs.getString("BaseValue") %></td>
                <td><%=rs.getString("AuctionId") %></td>
                <td><%=rs.getString("Address") %></td>
                <td><a href=  "Success.jsp"><button type="button" style="background-color: mintcream; border-radius: 10px;width: 100px;height:30px;">APPLY</button></a></td>
            </tr>
            <%}%>
           </tbody>
        </table><br>
        <a href=  "Success.jsp"><button type="button" style="background-color: mintcream; border-radius: 10px;width: 100px;height:30px;">APPLY</button></a>
    <%}
    catch(Exception e){
        out.print(e.getMessage());%><br><%
    }
   
    %>

    </div>
    </center>
</body>
</html> 