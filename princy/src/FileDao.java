import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileDao 
{
   private String dburl="jdbc:mysql://localhost:3306/user";
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
		DriverManager.getConnection(dburl,dbuname,dbpassword);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return con;
	
   }
   public String insert(Leader leader)
   {
	   loadDriver(dbdriver);
	   Connection con=getConnection();
	   String result="Case filed successfully";
	   String sql="insert into user.leader values(?,?,?,?,?,?,?,?,?)";
	   try {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,leader.getCourtname());
		ps.setString(2,leader.getCourtid());
		ps.setString(3,leader.getCustomername());
		ps.setString(4,leader.getCustomerid());
		ps.setString(5,leader.getAttorneyname());
		ps.setString(6,leader.getAttorneyaddress());
		ps.setString(7,leader.getLoantype());
		ps.setString(8,leader.getLoanid());
		ps.setString(9,leader.getLoanamount());
		ps.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result="Case not filed";
	}
	   return result;
   }
}
