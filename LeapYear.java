import java.util.Scanner;
public class LeapYear{

	public static void main (String[] args){
	
		Scanner entry = new Scanner (System.in);
	
		System.out.print("Enter the year:   ");
		int yearEntered = entry.nextInt();
		
		if (yearEntered % 4 == 0 && yearEntered % 100 != 0 ) {
			System.out.printf("%d is a leap year.%n", yearEntered);
		} else {
			System.out.printf("%d is not a leap year.%n", yearEntered);
		}
		
	}
	
}
