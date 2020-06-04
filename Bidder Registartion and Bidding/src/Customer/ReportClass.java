package Customer;

public class ReportClass {
	
	private String VehicleID;
	private String BankID;
	private String HighestBid;
	
	
	
	
	
	public ReportClass(String vehicleID) {
		super();
		VehicleID = vehicleID;
	}


	public ReportClass(String vehicleID, String bankID, String highestBid) {
		super();
		VehicleID = vehicleID;
		BankID = bankID;
		HighestBid = highestBid;
	}


	/**
	 * @return the vehicleID
	 */
	public  String getVehicleID() {
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
	 * @return the highestBid
	 */
	public String getHighestBid() {
		return HighestBid;
	}


	/**
	 * @param highestBid the highestBid to set
	 */
	public void setHighestBid(String highestBid) {
		HighestBid = highestBid;
	}
	
}
