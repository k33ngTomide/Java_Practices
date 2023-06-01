import java.util.Scanner;

public class TaxCalculator{

	public static void main(String... args){
	
	Scanner keyboardScan = new Scanner(System.in);
	
	
	int counter = 1;
	while (counter <=3 ){
		System.out.print("Enter the earning: $");
		int earning = keyboardScan.nextInt();
		
		if (earning <= 30000){
			double tax = earning * 0.15;
			System.out.printf("The Tax is: $%.2f%n",  tax);
		}
		
		if (earning > 30000 ){
			double tax = earning * 0.2;
			System.out.printf("The Tax is: $%.2f%n" , tax);
		}
			
			counter++;
	}
		
		
		} 
	
}
