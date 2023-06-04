import java.util.Scanner;

public class  Palindromes{

	public static void main(String[] args){
		
		simplePalindrome();
	}
		
	public static void simplePalindrome(){	
		Scanner scanKeyboard = new Scanner(System.in);
		
		int counter = 0;
	
		while (counter < 5){
			System.out.print("Enter a FIVE digit number:   ");
			int numberEntered = scanKeyboard.nextInt();
	
			if(numberEntered > 9999 && numberEntered < 100000){
	
				int firstDigit = numberEntered % 10;
				int secondDigit = (numberEntered / 10) % 10;
				int thirdDigit = (numberEntered / 100) %10;
				int fourthDigit = (numberEntered / 1000) %10;
				int fifthDigit = (numberEntered / 10000) % 10;
	
				if (firstDigit == fifthDigit && secondDigit == fourthDigit){
					System.out.println("The number you entered is a Palindrome");
				} else {
					System.out.println("The number you entered is not a Palindrome");
				}
					break;	
			} else {
				System.out.println("Error!. The number you entered is incorrect, try again.");
				if (counter == 4){
					System.out.println("Error!. You entered a Wrong number 5 times.");
				}
				
			}
			counter ++;
		}
		
	}
	
}
