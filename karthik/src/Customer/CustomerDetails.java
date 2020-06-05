package Customer;

public class CustomerDetails {
	private String firstName;
	private String lastName;
	private String email;
	private String DOB;
	private String password;
	private String BankID;
	private String AadharID;
	
	
	


	public CustomerDetails(String bankID,String password) {
		super();
		this.password = password;
		BankID = bankID;
	}




	public CustomerDetails(String firstName, String lastName, String email, String dOB, String password, String bankID,
			String aadharID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		DOB = dOB;
		this.password = password;
		BankID = bankID;
		AadharID = aadharID;
	}
	
	


	public CustomerDetails(String bankID) {
		super();
		BankID = bankID;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the dOB
	 */
	public String getDOB() {
		return DOB;
	}


	/**
	 * @param dOB the dOB to set
	 */
	public void setDOB(String dOB) {
		DOB = dOB;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the bankID
	 */
	public String getBankID() {
		return BankID;
	}


	/**
	 * @param bankID the bankID to set
	 */
	public void setBankID(String bankID) {
		BankID = bankID;
	}


	/**
	 * @return the aadharID
	 */
	public String getAadharID() {
		return AadharID;
	}


	/**
	 * @param aadharID the aadharID to set
	 */
	public void setAadharID(String aadharID) {
		AadharID = aadharID;
	}
	
	
	
	
	
	
	
	
	
	
}


