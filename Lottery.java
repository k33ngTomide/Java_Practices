import java.util.Scanner;

public class Lottery {

	public static void main(String... args){
	
	Scanner keyboardInput = new Scanner(System.in);
	
	System.out.print("Enter a number between 100 and 999 :   ");
	int Number = keyboardInput.nextInt();
	
	int firstDigit = Number % 10;
	int secondDigit = (Number / 10) % 10;
	int thirdDigit = (Number / 100) %10;
	
	int randomNumberOne = (int) (Math.random() * 10);
	int randomNumberTwo = (int) (Math.random() * 10);
	int randomNumberThree = (int) (Math.random() * 10);
	
	System.out.println(" First random Number =  " + randomNumberOne );
	System.out.println(" Second random Number =  " + randomNumberTwo );
	System.out.println(" Third random Number =  " + randomNumberThree );
	
	if (firstDigit == randomNumberOne && secondDigit == randomNumberTwo && thirdDigit == randomNumberThree){
		System.out.println("You are a lucky WINNER!!!. You just won $10,000");
	} 
	
	if (firstDigit == randomNumberOne || firstDigit == randomNumberTwo || firstDigit == randomNumberThree) {
		if (secondDigit == randomNumberOne || secondDigit == randomNumberTwo || secondDigit == randomNumberThree){
			if (thirdDigit == randomNumberOne || thirdDigit == randomNumberTwo || thirdDigit == randomNumberThree) {
				System.out.println("JACKPOT!!!,  you just won $3000.");
			}
		}
		
	}
	
	if (firstDigit == randomNumberOne || firstDigit == randomNumberTwo || firstDigit == randomNumberThree || secondDigit == randomNumberOne || secondDigit == randomNumberTwo || secondDigit == randomNumberThree || thirdDigit == randomNumberOne || thirdDigit == randomNumberTwo || thirdDigit == randomNumberThree){
	System.out.println("You are a great predictor, you just won $1000");
	}
	
	if (firstDigit != randomNumberOne && firstDigit != randomNumberTwo && firstDigit != randomNumberThree && secondDigit != randomNumberOne && secondDigit != randomNumberTwo && secondDigit != randomNumberThree && thirdDigit != randomNumberOne && thirdDigit != randomNumberTwo &&thirdDigit != randomNumberThree){
	System.out.print("Opps!!!, you almost got it, try again later");
	}
	
	}
	
}
