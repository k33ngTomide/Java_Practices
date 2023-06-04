import java.util.Scanner;

public class EnforcePrivacy{

	public static void main(String[] args){
	
		encryptPin();
		decryptPin();
	
	}
	public static void encryptPin(){
		Scanner keyboardScan = new Scanner(System.in);
		
		System.out.print("Enter your pin:  ");
		int pin = keyboardScan.nextInt();
		
		if(pin > 999 && pin < 10000){
		
			int digit4 = pin % 10;
			int digit3 = pin / 10 % 10;
			int digit2= pin / 100 % 10;
			int digit1 = pin / 1000;
			
			int firstDigit = (digit1 + 7 )%10;
			int secondDigit = (digit2 + 7 )%10;
			int thirdDigit = (digit3 + 7 )%10;
			int fourthDigit = (digit4 + 7 )%10;
			
			int newFirstDigit = thirdDigit;
			int newSecondDigit = fourthDigit;
			int newThirdDigit = firstDigit;
			int newFourthDigit = secondDigit;
			
			System.out.printf("The Encrypted number  is: %d%d%d%d%n", newFirstDigit, newSecondDigit, newThirdDigit, newFourthDigit);
			System.out.println(" ");
		
		} else {
			System.out.println("Sorry!. This is not a pin and cannot be Encrypted");
			System.out.println(" ");
		}
	
	}
	
	public static void decryptPin(){
	
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("Enter the Encrypted Number:   ");
		int encryptedPin = keyboardInput.nextInt();
		
		if(encryptedPin > 999 && encryptedPin < 10000){
		//if(encryptedpin.isDigit(4)){
		
			int encryptedDigit4 = encryptedPin % 10;
			int encryptedDigit3 = encryptedPin / 10 % 10;
			int encryptedDigit2 = encryptedPin / 100 % 10;
			int encryptedDigit1 = encryptedPin / 1000;
			
			int formerFirstDigit = encryptedDigit3;
			int formerSecondDigit = encryptedDigit4;
			int formerThirdDigit = encryptedDigit1;
			int formerFourthDigit = encryptedDigit2;
			
			int pinNumber1 = formerFirstDigit + 10 - 7;
			int pinNumber2 = formerSecondDigit + 10 - 7; 
			int pinNumber3 = formerThirdDigit + 10 - 7;
			int pinNumber4 = formerFourthDigit + 10 - 7;
			
			System.out.printf("The Pin  is: %d%d%d%d%n", pinNumber1, pinNumber2, pinNumber3, pinNumber4);
			System.out.println(" ");
		
		} else {
			System.out.println("Sorry!. This is not an Encrypted pin");
			System.out.println(" ");
		}
	
	}
	
}
