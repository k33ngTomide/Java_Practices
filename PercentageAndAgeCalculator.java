
import java.util.Scanner;
public class PercentageAndAgeCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("input the number you want know the % of...  ");
		double number = scan.nextDouble();
		
		System.out.print("Enter the percentage (%)...  ");
		double percentage = scan.nextDouble();
	
			double convertedPercentage = num2 / 100;
			System.out.println(convertedPercentage + "  is the decimal of  " + percentage + "%");
	
			System.out.println("The " + percentage + "% of " + number + "  is =  " + convertedPercentage * number);
		
	

	System.out.println("Will you like to test our Age Calculator? ");
	System.out.print("If yes, Enter Your Year of Birth... ");
		int yearOfBirth = scan.nextInt();
		int thisYear = 2023;
	
		System.out.println("From your year of birth, You are " + (thisYear - yearOfBirth) + "years Old.");
	
	if ((thisYear - yearOfBirth) >= 18) {
		System.out.println(" you are welcome to a new world");
	}
	
	if ((thisYear - yearOfBirth) < 18) {
		System.out.println(" you are not allowed to use this application");
	}
	
	}

}
