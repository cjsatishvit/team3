<%@page import="java.sql.*"%>
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
 <h3 style="background-color:mistyrose;">VIT BANK</h3>

   <div align ="center" style="width:450px; height:300px; background: mistyrose;border-radius: 40px;">
    <%
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/applicants","root","");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from applicants;");
    %><table border=1 align=center style="text-align:center">
      <thead>
          <tr>
             <th>FirstName</th>
             <th>LastNAME</th>
             <th>LoanId</th>

          </tr>
      </thead>
      <tbody>
        <%while(rs.next())
        {
            %>
            <tr>
                <td><%=rs.getString("FirstName") %></td>
                <td><%=rs.getString("LastName") %></td>
                <td><%=rs.getString("LoanId") %></td>

            </tr>
            <%}%>
           </tbody>
        </table><br>
    <%}
    catch(Exception e){
        out.print(e.getMessage());%><br><%
    }
   
    %>
    <a href=  "collector.jsp"><button type="button" style="background-color: mintcream; border-radius: 10px;width: 100px;height:30px;">BACK</button></a>
    </div>
    </center>
</body>
</html> 