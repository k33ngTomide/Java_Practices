public class Petrol {

	public static void main(String[] args) {
	
		PetrolPurchase boughtPetrol = new PetrolPurchase("Sabo Filling Station", "Petrol for car", 60 , 270.85 , 4.10);
		
		System.out.printf("The location i bought the petrol was %s, %n", boughtPetrol.getStationLocation());
		System.out.printf("The type of Petrol bought is %s.  %n", boughtPetrol.getTypeOfPetrol());
		System.out.printf("The quantity of the Petrol bought is %d liters. %n", boughtPetrol.getQuantity());
		System.out.printf("The price of the petrol per Liter is %.2f, %n ", boughtPetrol.getPricePerLiter());
		System.out.printf("And the percantage discount is %.1f Percent. %n", boughtPetrol.getPercentageDiscount());
		System.out.printf("The Net price of the petrol is %.2f%n%n%n", boughtPetrol.getPurchaseAmount());
	
		System.out.println("=========================================");
		
		boughtPetrol.setStationLocation("Ebute Metta Filling Station");
		boughtPetrol.setTypeOfPetrol("Petrol for Generator");
		boughtPetrol.setQuantity(30);
		boughtPetrol.setPricePerLiter(240.73);
		boughtPetrol.setPercentageDiscount(4.55);
		
		System.out.printf("The location i bought the petrol was %s, %n", boughtPetrol.getStationLocation());
		System.out.printf("The type of Petrol bought is %s.  %n", boughtPetrol.getTypeOfPetrol());
		System.out.printf("The quantity of the Petrol bought is %d liters. %n", boughtPetrol.getQuantity());
		System.out.printf("The price of the petrol per Liter is %.2f,  %n", boughtPetrol.getPricePerLiter());
		System.out.printf("And the percantage discount is %.1f Percent. %n", boughtPetrol.getPercentageDiscount());
		System.out.printf("The Net price of the petrol is %.2f%n%n%n", boughtPetrol.getPurchaseAmount());
		
		System.out.println("=========================================");
	
		
	
	}

		
}
