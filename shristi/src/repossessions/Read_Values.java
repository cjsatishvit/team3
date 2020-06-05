package repossessions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import repossession_notices.DB_Connection2;
import repossession_notices.User_Bean;
import repossessions.Read_Values;

public class Read_Values {
	public static void main(String[] args) {
		Read_Values obj_Read_Values=new Read_Values();
		
		obj_Read_Values.get_values();
	}
	
	
	public List<User_Bean> get_values(){
		DB_Connection2 obj_DB_Connection2=new DB_Connection2();
		Connection connection=obj_DB_Connection2.get_connection();
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		 List<User_Bean> list=new ArrayList<User_Bean>();
		
		try {
			String querry="select * from defaulters.DEFAULTERLIST";
			ps=connection.prepareStatement(querry);		
			rs=ps.executeQuery();
			
			
			while(rs.next()){
				
				User_Bean obj_User_Bean=new User_Bean();
				System.out.println(rs.getString("FirstName"));
				System.out.println(rs.getString("LastName"));
				System.out.println(rs.getString("LoanId"));
				System.out.println(rs.getString("DefaulterId"));
				
				
				obj_User_Bean.setFirstName(rs.getString("FirstName"));
				obj_User_Bean.setLastName(rs.getString("LastName"));
				obj_User_Bean.setLoanId(rs.getString("LoanId"));
				obj_User_Bean.setDefaulterId(rs.getString("DefaulterId"));
				
				list.add(obj_User_Bean);
				
			}
			
			
			
		} catch (Exception e) {
				System.out.println(e);
		}
		return list;
		
		
		
	}
}