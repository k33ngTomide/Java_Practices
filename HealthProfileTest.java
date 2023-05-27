public class HealthProfileTest {

	public static void main(String[] args) {
	
		HealthProfile precious = new HealthProfile("Ochonogo", "Precious", "Female", "April", 10, 2001, 6.3, 59.7);
		HealthProfile alpha = new HealthProfile("Iniobong", "Akpan", "Male", "March", 3, 1999, 5.9, 61.5);
		HealthProfile siri = new HealthProfile("Alexa", "Siri", "Female", "September", 15, 2005, 5.5, 50.1);
	
		System.out.printf("Hi %s  %s!, you are %dyears old,%nYour Maximum Heart Rate is %.2f%nYour Targetted Heart Rate is %.2f%nYour height is %.1f%nYour weight is %.2f.%n", precious.getFirstName(), precious.getLastName(), precious.getAge(), precious.getMaximumHeartRate(), precious.getTargettedHeartRate(), precious.getHeight(), precious.getWeight());
	
		System.out.println("=========================================");
	
		System.out.printf("Hi %s  %s!, you are %dyears old,%nYour Maximum Heart Rate is %.2f.%nYour Targetted Heart Rate is %.2f%nYour height is %.1f%nYour weight is %.2f.%n", alpha.getFirstName(), alpha.getLastName(), alpha.getAge(), alpha.getMaximumHeartRate(), alpha.getTargettedHeartRate(), alpha.getHeight(), alpha.getWeight());
		
		System.out.println("=========================================");
		
		System.out.printf("Hi %s  %s!, you are %d years old.%nYour Maximum Heart Rate is %.2f.%nYour Targetted Heart Rate is %.2f%nYour height is %.1f%nYour weight is %.2f.%n", siri.getFirstName(), siri.getLastName(), siri.getAge(), siri.getMaximumHeartRate(), siri.getTargettedHeartRate(), siri.getHeight(), siri.getWeight());

	}
}
