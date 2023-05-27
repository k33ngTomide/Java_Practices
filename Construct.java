public class Construct {

	private String estateName;
	private int houseNumber;
	
	// constructors
	public Construct (String estateName, int houseNumber) {
		this.estateName = estateName;
		this.houseNumber = houseNumber;
	}
	
	
	public void setEstateName(String estateName){
		this.estateName = estateName;
	}
	
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public String getEstateName() {
		return estateName;
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}


}


