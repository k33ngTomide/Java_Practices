import java.util.Scanner;

public class HealthApplication{

	public static void main(String[] args) {
	
	Scanner paste = new Scanner(System.in);
		
		System.out.print("Enter your weight in pounds: ");
		double weight = paste.nextDouble();
		
		System.out.print("Enter your height in inches: ");
		double height = paste.nextDouble();
		
		
		double bodyMassIndex = weight*0.45359237 / ((height*0.0254) * (height*0.0254));
		
		System.out.printf("BMI is %.4f%n ", bodyMassIndex);
	
	}

}
