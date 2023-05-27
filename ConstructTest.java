public class ConstructTest {

	public static void main(String[] args) {
	
	Construct house1 = new Construct("Ijapo Estate, Sabo", 56);
	Construct house2 = new Construct("Kila Estate, IyanaIpaja", 12);
	
	System.out.printf("First Estate name is: %s with number %d%n", house1.getEstateName(), house1.getHouseNumber());
	System.out.printf("Second Estate name is: %s with house number %d%n%n%n", house2.getEstateName(), house2.getHouseNumber());
	
	house1.setEstateName("Divine Estate, Sabo");
	house2.setEstateName("Semicolon Estate, AbuleEgba");
	
	house1.setHouseNumber(45);
	house2.setHouseNumber(18);
	
	System.out.printf("First Estate name is: %s with number %d%n", house1.getEstateName(), house1.getHouseNumber());
	System.out.printf("Second Estate name is: %s with house number %d%n%n%n", house2.getEstateName(), house2.getHouseNumber());
	
	house1.setEstateName("Adelabu Estate, Mushin");
	house2.setEstateName("Ajewole Estate, Makoko");
	
	house1.setHouseNumber(78);
	house2.setHouseNumber(102);
	
	System.out.printf("First Estate name is: %s with number %d%n", house1.getEstateName(), house1.getHouseNumber());
	System.out.printf("Second Estate name is: %s with house number %d%n", house2.getEstateName(), house2.getHouseNumber());

	}

}
