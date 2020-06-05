package Customer;

public class RepossessedCars {
	private String VehicleID;
	private String VehicleName;
	private String VehicleColor;
	private int BasePrice;
	private String VehicleCompany;
	private int Tenure;
	
	
	public RepossessedCars(String vehicleID, String vehicleName, String vehicleColor, int basePrice,
			String vehicleCompany, int tenure) {
		super();
		VehicleID = vehicleID;
		VehicleName = vehicleName;
		VehicleColor = vehicleColor;
		BasePrice = basePrice;
		VehicleCompany = vehicleCompany;
		Tenure = tenure;
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
	 * @return the vehicleName
	 */
	public String getVehicleName() {
		return VehicleName;
	}


	/**
	 * @param vehicleName the vehicleName to set
	 */
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}


	/**
	 * @return the vehicleColor
	 */
	public String getVehicleColor() {
		return VehicleColor;
	}


	/**
	 * @param vehicleColor the vehicleColor to set
	 */
	public void setVehicleColor(String vehicleColor) {
		VehicleColor = vehicleColor;
	}


	/**
	 * @return the basePrice
	 */
	public int getBasePrice() {
		return BasePrice;
	}


	/**
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(int basePrice) {
		BasePrice = basePrice;
	}


	/**
	 * @return the vehicleCompany
	 */
	public String getVehicleCompany() {
		return VehicleCompany;
	}


	/**
	 * @param vehicleCompany the vehicleCompany to set
	 */
	public void setVehicleCompany(String vehicleCompany) {
		VehicleCompany = vehicleCompany;
	}


	/**
	 * @return the tenure
	 */
	public int getTenure() {
		return Tenure;
	}


	/**
	 * @param tenure the tenure to set
	 */
	public void setTenure(int tenure) {
		Tenure = tenure;
	}
	
	
	
	
}
