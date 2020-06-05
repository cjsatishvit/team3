package reports;

public class Loan {
		
		//Defining class attributes
		private String LoanID;
		private Double Amount;
		private float Interest;
		private String DueDate;
		private String Stat = "Pending";
		
		//Defining constructor
		public void database(String LoanID, Double Amount, float Interest, String DueDate) {
			this.LoanID = LoanID;
			this.Amount = Amount;
			this.Interest = Interest;
//			this.Type = Type;
			this.DueDate = DueDate;
		}
//		Get Functions definition
		public String getLoanID() {
			return LoanID;
		}
		public String getDueDate() {
			return DueDate;
		}
		public float getInterest() {
			return Interest;
		}
		public Double getAmount() {
			return Amount;
		}
		public String getStatus() {
			return Stat;
		}
		
//		Set Functions Definition
		public void setLoanID(String LoanID) {
			this.LoanID = LoanID;
		}
		public void setAmount(double Amount) {
			this.Amount = Amount;
		}
		public void setInterest(float Interest) {
			this.Interest = Interest;
		}
		public void setStatus(String Stat) {
			this.Stat = Stat;
		}
		public void setDueDate(String DueDate) {
			this.DueDate = DueDate;
		}
		
	}
