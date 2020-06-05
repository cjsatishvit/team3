
public class Member 
{
	private String customername,loantype,loanid,amount,bankruptcyid,aadharno,accountno;
	

	public Member() {
		super();
	}


	public Member(String customername, String loantype, String loanid, String amount, String bankruptcyid,
			String aadharno, String accountno) {
		super();
		this.customername = customername;
		this.loantype = loantype;
		this.loanid = loanid;
		this.amount = amount;
		this.bankruptcyid = bankruptcyid;
		this.aadharno = aadharno;
		this.accountno = accountno;
	}


	public String getCustomername() {
		return customername;
	}


	public void setCustomername(String customername) {
		this.customername = customername;
	}


	public String getLoantype() {
		return loantype;
	}


	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}


	public String getLoanid() {
		return loanid;
	}


	public void setLoanid(String loanid) {
		this.loanid = loanid;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getBankruptcyid() {
		return bankruptcyid;
	}


	public void setBankruptcyid(String bankruptcyid) {
		this.bankruptcyid = bankruptcyid;
	}


	public String getAadharno() {
		return aadharno;
	}


	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}


	public String getAccountno() {
		return accountno;
	}


	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
}
	
	
   