package repossessions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import repossession_notices.DB_Connection2;
import repossession_notices.User_Bean;

public class Property {
	public static void main(String[] args) {
		Property obj_Property=new Property();
		
		obj_Property.get_values();
	}
	
	
	public List<User_Bean> get_values(){
		DB_Connection2 obj_DB_Connection2=new DB_Connection2();
		Connection connection=obj_DB_Connection2.get_connection();
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		 List<User_Bean> list=new ArrayList<User_Bean>();
		
		try {
			String querry="select * from propertiess";
			ps=connection.prepareStatement(querry);		
			rs=ps.executeQuery();
			
			
			while(rs.next()){
				
				User_Bean obj_User_Bean=new User_Bean();
				System.out.println(rs.getString("BaseValue"));
				System.out.println(rs.getString("AuctionId"));
				System.out.println(rs.getString("Address"));
				
				
				
				obj_User_Bean.setFirstName(rs.getString("BaseValue"));
				obj_User_Bean.setLastName(rs.getString("AuctionId"));
				obj_User_Bean.setLoanId(rs.getString("Address"));
				
				
				list.add(obj_User_Bean);
				
			}
			
			
			
		} catch (Exception e) {
				System.out.println(e);
		}
		return list;
		
		
		
	}
}