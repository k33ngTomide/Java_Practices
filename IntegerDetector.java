//Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;
public class IntegerDetector{

	public static void main(String... args){
	
		Scanner keyboardScan = new Scanner (System.in);
		
			System.out.print("Enter a number:  ");
			double number = keyboardScan.nextDouble();
		
		if (number >= 1){
			System.out.println("Number is positive");
		} 
		if (number <= -1){
			System.out.println("Number is Negative");
		} 
		if (number == 0){
			System.out.println("Number is neither positive nor negative");
		}
	
	}
	
}
