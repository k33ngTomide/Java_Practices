/*write a program that reads positive numbers from the user stop the reading when the user enters a negative  value, and display the maximum and the minimum of the number entered by the user.*/

import java.util.Scanner;

public class PositiveInteger{
	
	public static void main(String... args){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter a number:  ");
	int number = scan.nextInt();

		int maximum = number;
		int minimum = number;
		
	while (number >= 0) {
		System.out.print("Enter a number:  ");
		number = scan.nextInt();
		
		if ( number < 0)
			break;
		
		if (number > maximum)
			maximum = number;
		
		if (number < minimum)
			minimum = number;
		 	
	} 
	System.out.println("min: " + minimum + "\nmax: " + maximum);
		
	if (number < 0)
		System.out.println(number + "    you entered is invalid");
	}
}
