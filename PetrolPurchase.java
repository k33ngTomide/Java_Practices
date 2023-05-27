public class PetrolPurchase {

	private String stationLocation;
	private String typeOfPetrol;
	private int quantity;
	private double pricePerLiter;
	private double percentageDiscount;
	
	public PetrolPurchase (String stationLocation, String typeOfPetrol, int quantity, double pricePerLiter, double percentageDiscount) {
		this.stationLocation = stationLocation;
		this.typeOfPetrol = typeOfPetrol;
		this.quantity = quantity;
		this.pricePerLiter = pricePerLiter;
		this.percentageDiscount = percentageDiscount;
	}
	
	public void setStationLocation(String stationLocation){
		this.stationLocation = stationLocation;
	}
	
	public void setTypeOfPetrol(String typeOfPetrol){
		this.typeOfPetrol = typeOfPetrol;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPricePerLiter(double pricePerLiter){
		this.pricePerLiter = pricePerLiter;
	}
	
	public void setPercentageDiscount(double percantageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}
	
	public String getStationLocation() {
		return stationLocation;
	}
	
	public String getTypeOfPetrol() {
		return typeOfPetrol;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPricePerLiter(){
		return pricePerLiter;
	}
	
	public double getPercentageDiscount(){
		return percentageDiscount;
	}
	
	public double getPurchaseAmount(){
		double netPurchaseAmount;
		netPurchaseAmount = (double) (quantity * pricePerLiter);
		return netPurchaseAmount;
	}
	
}
