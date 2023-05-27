public class HeartRateTest {

	public static void main(String[] args) {
	
		HeartRate precious = new HeartRate("Ochonogo", "Precious", "April", 10, 2001);
		HeartRate  alpha = new HeartRate ("Iniobong", "Akpan", "March", 3, 1999);
		HeartRate siri = new HeartRate("Alexa", "Siri", "September", 15, 2005);
	
		System.out.printf("Hi %s  %s!, you are %dyears old, Your Maximum Heart Rate is %d and your Targetted Heart Rate is %.2f.%n", precious.getFirstName(), precious.getLastName(), precious.getAge(), precious.getMaximumHeartRate(), precious.getTargettedHeartRate());
	
		System.out.printf("Hi %s  %s!, you are %dyears old, Your Maximum Heart Rate is %d and your Targetted Heart Rate is %.2f.%n", alpha.getFirstName(), alpha.getLastName(), alpha.getAge(), alpha.getMaximumHeartRate(), alpha.getTargettedHeartRate());
		
		System.out.printf("Hi %s  %s, you are %d years old, Your Maximum Heart Rate is %d and your Targetted Heart Rate is %.2f.%n", siri.getFirstName(), siri.getLastName(), siri.getAge(), siri.getMaximumHeartRate(), siri.getTargettedHeartRate());

		
	}
}
