import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao 
{
   private String dburl="jdbc:mysql://localhost:3306/userdb";
   private String dbuname="root";
   private String dbpassword="";
   private String dbdriver="com.mysql.jdbc.Driver";
   public void loadDriver(String dbDriver)
   {
	   try {
		Class.forName(dbDriver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public Connection getConnection()
   {
	   Connection con=null;
	   try {
		DriverManager.getConnection(dburl, dbuname, dbpassword);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	   return con;
   }
   public String insert(Member member)
   {
	   loadDriver(dbdriver);
	   Connection con=getConnection();
	   String result="Data entered successfully";
	   String sql="insert into userdb.member values(?,?,?,?,?,?,?)";
	   try {
		PreparedStatement ps = con.prepareStatement(sql);;
		ps.setString(1,member.getCustomername());
		ps.setString(2,member.getLoantype());
		ps.setString(3,member.getLoanid());
		ps.setString(4,member.getAmount());
		ps.setString(5,member.getBankruptcyid());
		ps.setString(6,member.getAadharno());
		ps.setString(7,member.getAccountno());
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result="Data not entered";
	}
	   return result;
   }
}
