package Customer;

public class CustomerApplication {
	
	private String BankID;
	private String AadharID;
	private String age;
	private String address;
	private String salary;
	
	
	public CustomerApplication(String bankID, String aadharID, String age, String address, String salary) {
		super();
		BankID = bankID;
		AadharID = aadharID;
		this.age = age;
		this.address = address;
		this.salary = salary;
	}

	
	public CustomerApplication(String bankID) {
		super();
		BankID = bankID;
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


	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
