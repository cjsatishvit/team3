package Customer;

public class BiddingClass {
	private String VehicleID;
	private String BankID;
	private String Bid;
	
	
	public BiddingClass(String vehicleID, String bankID, String bid) {
		super();
		VehicleID = vehicleID;
		BankID = bankID;
		Bid = bid;
	}


	/**
	 * @return the vehicleID
	 */
	public String getVehicleID() {
		return VehicleID;
	}


	/**
	 * @param vehicleID the vehicleID to set
	 */
	public void setVehicleID(String vehicleID) {
		VehicleID = vehicleID;
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
	 * @return the bid
	 */
	public String getBid() {
		return Bid;
	}


	/**
	 * @param bid the bid to set
	 */
	public void setBid(String bid) {
		Bid = bid;
	}
		

}
