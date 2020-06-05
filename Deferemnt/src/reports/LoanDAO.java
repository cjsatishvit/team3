package reports;

public interface LoanDAO {
	
	//declaring interface methods
	public int insertLoan(Loan l);

	public Loan getLoanUpdate(String LoanID);
	
	public Loan getLoanManager();
	
	public Loan getLoanCollector(); 
}
