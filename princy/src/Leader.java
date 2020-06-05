
public class Leader
{
	private String courtname,courtid,customername,customerid,attorneyname,attorneyaddress,loantype,loanid,loanamount;

	public Leader() {
		super();
	}

	public Leader(String courtname, String courtid, String customername, String customerid, String attorneyname,
			String attorneyaddress, String loantype, String loanid, String loanamount) {
		super();
		this.courtname = courtname;
		this.courtid = courtid;
		this.customername = customername;
		this.customerid = customerid;
		this.attorneyname = attorneyname;
		this.attorneyaddress = attorneyaddress;
		this.loantype = loantype;
		this.loanid = loanid;
		this.loanamount = loanamount;
	}

	public String getCourtname() {
		return courtname;
	}

	public void setCourtname(String courtname) {
		this.courtname = courtname;
	}

	public String getCourtid() {
		return courtid;
	}

	public void setCourtid(String courtid) {
		this.courtid = courtid;
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

	public String getAttorneyname() {
		return attorneyname;
	}

	public void setAttorneyname(String attorneyname) {
		this.attorneyname = attorneyname;
	}

	public String getAttorneyaddress() {
		return attorneyaddress;
	}

	public void setAttorneyaddress(String attorneyaddress) {
		this.attorneyaddress = attorneyaddress;
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

	public String getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(String loanamount) {
		this.loanamount = loanamount;
	}
	
	

}
