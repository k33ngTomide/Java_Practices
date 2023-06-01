
import java.util.Scanner;

public class Extremes{

	public static void main(String[] args){
		getInput();
		
	}
	
	public static void getInput(){
		
		Scanner keyboardInput = new Scanner(System.in);
	
		System.out.print("How many values will you like to input?   ");
		int numberOfInputs = keyboardInput.nextInt();
		
		int counter = 2;
		System.out.print("Enter a value:  ");
		int valueEntered = keyboardInput.nextInt();
		
		int maximum = valueEntered;
		int minimum = valueEntered;
		
		while (counter <= numberOfInputs) {
			System.out.print("Enter a value:  ");
			valueEntered = keyboardInput.nextInt();
		
			
			if (valueEntered >= maximum) {
				maximum = valueEntered;
			}
			
			if (valueEntered <= minimum) {
				minimum = valueEntered;
			}
			
			 counter ++;
		}
		
		System.out.printf("The Maximum value: %d%n", maximum);
		System.out.printf("The Minimum value: %d%n", minimum);
		System.out.printf("The Addition of the Maximum and the Minimum number is: %d%n", (maximum+ minimum));
		

	}
	
}
