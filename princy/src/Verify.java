
public class Verify 
{
	private String customername,customerid,bankid,meetingdays,loantype,loanamount,loanid;

	public Verify() {
		super();
	}

	public Verify(String customername, String customerid, String bankid, String meetingdays, String loantype,
			String loanamount, String loanid) {
		super();
		this.customername = customername;
		this.customerid = customerid;
		this.bankid = bankid;
		this.meetingdays = meetingdays;
		this.loantype = loantype;
		this.loanamount = loanamount;
		this.loanid = loanid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getBankid() {
		return bankid;
	}

	public void setBankid(String bankid) {
		this.bankid = bankid;
	}

	public String getMeetingdays() {
		return meetingdays;
	}

	public void setMeetingdays(String meetingdays) {
		this.meetingdays = meetingdays;
	}

	public String getLoantype() {
		return loantype;
	}

	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}

	public String getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(String loanamount) {
		this.loanamount = loanamount;
	}

	public String getLoanid() {
		return loanid;
	}

	public void setLoanid(String loanid) {
		this.loanid = loanid;
	}
	
	
}


