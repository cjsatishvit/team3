package Customer;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class CustomerDbUtil {
	int ret=-1;
	private DataSource dataSource;
	public CustomerDbUtil(DataSource theDataSource) {
		dataSource=theDataSource;
	}
	
	public void addBidder(CustomerDetails theCustomer) throws Exception {
		
		Connection myConn=null;
		PreparedStatement myStmt=null;
		ResultSet myRs=null;
		
		
			
			//Connect with Db
			myConn=dataSource.getConnection();
			//create sql Statement
			String sql="insert into bidderinfo "
					  +"(firstName, lastName, email, DOB, password, BankID, AadharID) "
					  +"values (?, ?, ?, ?, ?, ?, ?)";
			
			myStmt=myConn.prepareStatement(sql);
			//set param values
			myStmt.setString(1, theCustomer.getFirstName());
			myStmt.setString(2, theCustomer.getLastName());
			myStmt.setString(3, theCustomer.getEmail());
			myStmt.setString(4, theCustomer.getDOB());
			myStmt.setString(5, theCustomer.getPassword());
			myStmt.setString(6, theCustomer.getBankID());
			myStmt.setString(7, theCustomer.getAadharID());
			
			//execute the query
			myStmt.execute();
			
			//clear the JDBC objects
			close(myConn,myStmt,null);
		
		
}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
			try {
				if (myRs != null) {
					myRs.close();
				}
				
				if (myStmt != null) {
					myStmt.close();
				}
				
				if (myConn != null) {
					myConn.close();   // doesn't really close it ... just puts back in connection pool
				}
			}
			catch (Exception exc) {
				exc.printStackTrace();
			
		}
	}

	

	public void addApplication(CustomerApplication theCustomer) throws Exception {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs=null;
		
		try {
			// get db connection
			myConn = dataSource.getConnection();
			
			// create sql for insert
			String sql = "insert into customerformdetails "
					   + "(BankID, AadharID, Age, Address, Salary) "
					   + "values (?, ?, ?, ?, ?)";
			
			myStmt = myConn.prepareStatement(sql);
			
			// set the param values for the student
			myStmt.setString(1, theCustomer.getBankID());
			myStmt.setString(2, theCustomer.getAadharID());
			myStmt.setString(3, theCustomer.getAge());
			myStmt.setString(4, theCustomer.getAddress());
			myStmt.setString(5, theCustomer.getSalary());
			
			
			// execute sql insert
			myStmt.execute();
		}
		finally {
			// clean up JDBC objects
			close(myConn, myStmt, myRs);
		}
		
	}

	public List<CustomerApplication> getCustomer() throws SQLException{
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
			List<CustomerApplication> customers= new ArrayList<>();
			
			myConn = dataSource.getConnection();
			String sql = "select * from customerformdetails order by BankID";
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery(sql);
			
			while(myRs.next()) {
				
				String BankID=myRs.getString("BankID");
				String AadharID=myRs.getString("AadharID");
				String Age=myRs.getString("Age");
				String Address=myRs.getString("Address");
				String Salary=myRs.getString("Salary");
				
				CustomerApplication cnt=new CustomerApplication(BankID,AadharID,Age,Address,Salary);
				
				customers.add(cnt);
			}
		close(myConn,myStmt,myRs);
		return customers;
	}

	public void deleteCustomer(CustomerApplication theCustomer) throws SQLException {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		myConn = dataSource.getConnection();
		String id=theCustomer.getBankID();
		String sql="delete from customerformdetails where BankID="+'"'+id+'"';
		//String sql1="delete from bidderinfo where BankID="+'"'+id+'"';
		myStmt = myConn.prepareStatement(sql);
		//myStmt = myConn.prepareStatement(sql1);
		myStmt.execute();
		close(myConn, myStmt, myRs);
		
	}

	public int checkcustomer(CustomerDetails theCustomer) throws SQLException{
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		myConn=dataSource.getConnection();
		String Bid=theCustomer.getBankID();
		String sql="select * from bidderinfo where BankID="+'"'+Bid+'"';
		myStmt=myConn.prepareStatement(sql);
		myRs=myStmt.executeQuery();
		while(myRs.next()) {
			String password=myRs.getString("password");
			
			if(password.equals(theCustomer.getPassword())) {
				ret=1;
			}
			else {
				ret=0;
			}
		}
		close(myConn,myStmt,myRs);
		return ret;
	}

	public List<RepossessedCars> getRepossessedCars() throws SQLException{
		
		List<RepossessedCars> cars= new ArrayList<>();
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn=dataSource.getConnection();
			String sql="select * from repossesedvehicles";
			myStmt=myConn.createStatement();
			myRs=myStmt.executeQuery(sql);
			while(myRs.next()) {
				
				String id=myRs.getString("VehicleID");
				String name=myRs.getString("VehicleName");
				String color=myRs.getString("VehicleColor");
				int bp=myRs.getInt("BasePrice");
				String company=myRs.getString("VehicleCompany");
				int t=myRs.getInt("TenureUsed");
				
				RepossessedCars tempVehicle=new RepossessedCars(id,name,color,bp,company,t);
				
				cars.add(tempVehicle);
				
			}
			return cars;
		}
		finally {
			close(myConn,myStmt,myRs);
		}
		
	}

	public void addBid(BiddingClass theBid) throws SQLException{
		
		Connection myConn=null;
		PreparedStatement myStmt=null;
		ResultSet myRs=null;
		
		
			
			//Connect with Db
			myConn=dataSource.getConnection();
			//create sql Statement
			String sql="insert into biddingtable "
					  +"(BankID,VehicleID,Bid) "
					  +"values (?, ?, ?)";
			
			myStmt=myConn.prepareStatement(sql);
			//set param values
			myStmt.setString(1, theBid.getVehicleID());
			myStmt.setString(2, theBid.getBankID());
			myStmt.setString(3, theBid.getBid());
			
			//execute the query
			myStmt.execute();
			
			//clear the JDBC objects
			close(myConn,myStmt,null);
		
	}

	public List<BiddingClass> getBiddingClass() throws SQLException{
		
		List<BiddingClass> bids= new ArrayList<>();
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn=dataSource.getConnection();
			String sql="select * from biddingtable";
			myStmt=myConn.createStatement();
			myRs=myStmt.executeQuery(sql);
			while(myRs.next()) {
				
				String id=myRs.getString("VehicleID");
				String Baid=myRs.getString("BankID");
				String bid=myRs.getString("Bid");
				
				BiddingClass tempBid=new BiddingClass(id,Baid,bid);
				
				bids.add(tempBid);
				
			}
			return bids;
		}
		finally {
			close(myConn,myStmt,myRs);
		}
		
		
	}

	public void addReport(ReportClass theReport) throws SQLException{
		
		Connection myConn = null;
		Statement myStmt = null;
		PreparedStatement myStmt1=null;
		ResultSet myRs = null;
		myConn=dataSource.getConnection();
		String id=theReport.getVehicleID();
		String sql="select * from biddingtable where VehicleID="+"'"+id+"'"+" order by ABS(Bid)";
		myStmt=myConn.createStatement();
		myRs=myStmt.executeQuery(sql);
		String BankID="";
		String HighestBid="";
		
		while(myRs.next()) {
			
			BankID=myRs.getString("BankID");
			HighestBid=myRs.getString("Bid");
		}
		
		
		//Insert into table 
		String sql1="insert into reporttable "
				   +"(VehicleID,BankID,HighestBid) "
				   +"values(?, ?, ?)";
		
		myStmt1=myConn.prepareStatement(sql1);
		
		//setting param values
		myStmt1.setString(1,id);
		myStmt1.setString(2,BankID);
		myStmt1.setString(3,HighestBid);
		
		//execute the query
		myStmt1.execute();
		
		close(myConn,myStmt1,myRs);
		close(myConn,myStmt,null);
		
		
	}

	public List<ReportClass> getReportClass() throws SQLException {
		
		List<ReportClass> reports= new ArrayList<>();
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn=dataSource.getConnection();
			String sql="select * from reporttable";
			myStmt=myConn.createStatement();
			myRs=myStmt.executeQuery(sql);
			while(myRs.next()) {
				
				String Vid=myRs.getString("VehicleID");
				String Banid=myRs.getString("BankID");
				String bid=myRs.getString("HighestBid");
				
				ReportClass tempReport=new ReportClass(Vid,Banid,bid);
				
				reports.add(tempReport);
				
			}
			return reports;
		}
		finally {
			close(myConn,myStmt,myRs);
		}
	}

	
	
}
