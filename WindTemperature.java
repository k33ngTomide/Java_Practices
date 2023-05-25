
import java.util.Scanner;
import java.lang.Math;

public class WindTemperature{

	public static void main(String... args){
	
		Scanner keyboardInput = new Scanner (System.in);
		
		System.out.print("Enter temperature in Fahrenheit between -58F and 41F:  ");
		double temperature = keyboardInput.nextDouble();
		
		System.out.print("Enter the wind speed (>=2) in miles per hours:   ");
		double windSpeed = keyboardInput.nextDouble();
		
		double windChillIndex;
		windChillIndex = 35.74 + (0.6215*temperature) - (35.75* (Math.pow(windSpeed , 0.16))) + (0.4275*temperature*(Math.pow(windSpeed, 0.16)));
		
		System.out.printf("The wind chill Index: %.5f %n", windChillIndex);
		
	}

}
