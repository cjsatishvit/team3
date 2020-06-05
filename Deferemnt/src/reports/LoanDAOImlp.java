package reports;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;  


public class LoanDAOImlp implements LoanDAO {
	static Connection conn;
	static PreparedStatement ps;
	
	
	//defining the insertLoan method of interface
	@Override
	public int insertLoan(Loan l) {
		int status = 0;
		try {
			conn = connector.getConn();//connection to the database
			
			//all values of the loan are inserted from a loan object into database
			ps = conn.prepareStatement("Insert into Loan values(?,?,?,?,?)");
			ps.setString(1, l.getLoanID());
			ps.setDouble(2, l.getAmount());
			ps.setFloat(3, l.getInterest());
			ps.setString(4, l.getDueDate());
			ps.setString(5, l.getStatus());
			status = ps.executeUpdate();
			conn.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}

	@Override
	public Loan getLoanUpdate(String LoanID) {
		Loan l = new Loan();
		try {
			conn = connector.getConn();
			//Loan object is created by checking loanId
			ps = conn.prepareStatement("select * from Loan where LoanID=?");
			ps.setString(1, LoanID);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				l.setLoanID(rs.getString(1));
				l.setAmount(rs.getDouble(2));
				l.setInterest(rs.getFloat(3));
				l.setDueDate(rs.getString(4));
				l.setStatus(rs.getString(5));
			}
			// Date handling
			Date due = SimpleDateFormat("dd/MM/yyyy").parse(l.getDueDate());
			Date updatedDue;
			DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
			
			//Deferment conditions
			switch(l.getStatus()) {
				
			case "Pending":
				l.setStatus("Deferment1");
				updateDue = due.add(Calendar.MONTH,2);
				l.setDueDate(format(updateDue));
				break;
		
			case "Deferment1":
				l.setStatus("Deferment2");
				updateDue = due.add(Calendar.MONTH,1);
				l.setDueDate(format(updateDue));
				break;
			
			case "Deferment 2":
				System.out.println("Not eligible for deferment");
				break;
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return l;
	}

	@Override
	public Loan getLoanManager() {
		//generating report for manager from database of all no paid loans
		try {
			String filenameManager = "/home/billi/Documents/Studies/Sem-6/SDD/Project/Manager";
			FileWriter f2 = new FileWriter(filenameManager);
				
				f2.append("LoanID");
				f2.append(',');
				f2.append("Amount");
				f2.append(',');
				f2.append("Interest");
				f2.append(',');
				f2.append("Due Date");
				f2.append(',');
				f2.append("Status");
				f2.append('\n');
			
			
			conn = connector.getConn();
			ps = conn.prepareStatement("select * from Loan");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				f2.append(rs.getString(1));
				f2.append(',');
				f2.append(Double.toString(rs.getDouble(2)));
				f2.append(',');
				f2.append(Float.toString(rs.getFloat(3)));
				f2.append(',');
				f2.append(rs.getString(4));
				f2.append(',');
				f2.append(rs.getString(5));
				f2.append('\n');
			}
			f2.flush();
			f2.close();

		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Loan getLoanCollector() {
		Loan l = new Loan();
		
		//generating report of all non paid loans for the collector
		try {
			String filenameCollector = "/home/billi/Documents/Studies/Sem-6/SDD/Project/Collector";
			FileWriter f1 = new FileWriter(filenameCollector);
			
			f1.append("LoanID");
			f1.append(',');
			f1.append("Amount");
			f1.append(',');
			f1.append("Interest");
			f1.append(',');
			f1.append("Due Date");
			f1.append(',');
			f1.append("Status");
			f1.append('\n');
			
			conn = connector.getConn();
			ps = conn.prepareStatement("select * from Loan where Status!=?");
			ps.setString(1, "Paid");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				f1.append(rs.getString(1));
				f1.append(',');
				f1.append(Double.toString(rs.getDouble(2)));
				f1.append(',');
				f1.append(Float.toString(rs.getFloat(3)));
				f1.append(',');
				f1.append(rs.getString(4));
				f1.append(',');
				f1.append(rs.getString(5));
				f1.append('\n');
				
				f1.flush();
				f1.close();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return l;
	}

}
