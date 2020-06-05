import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StatusDao
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
	   public String insert(Verify verify)
	   {
		   loadDriver(dbdriver);
		   Connection con=getConnection();
		   String result="Verified Successfully";
		   String sql="insert into user12.verify values(?,?,?,?,?,?,?)";
		   try {
			PreparedStatement ps = con.prepareStatement(sql);;
			ps.setString(1,verify.getCustomername());
			ps.setString(2,verify.getCustomerid());
			ps.setString(3,verify.getBankid());
			ps.setString(4,verify.getMeetingdays());
			ps.setString(5,verify.getLoantype());
			ps.setString(6,verify.getLoanamount());
			ps.setString(7,verify.getLoanid());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="Not verified";
		}
		   return result;
	   }
}
