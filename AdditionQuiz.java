import java.util.Scanner;
public class AdditionQuiz{

	public static void main(String[] args){
	
		Scanner userInput = new Scanner (System.in);
		int counter = 0;
		int correctAnswer = 0;
		int wrongAnswer = 0;
		
		while (counter < 10){
		
			int firstNumber = (int) (Math.random()*10);
			int secondNumber = (int) (Math.random() *10);
			int thirdNumber = (int) (Math.random()*10);
		
			int sum = firstNumber + secondNumber + thirdNumber;
		
			System.out.printf("%d + %d + %d =  " , firstNumber, secondNumber, thirdNumber);
			int userAnswer = userInput.nextInt();
		
			if (sum == userAnswer){
				System.out.println("Congratulations!!!  Your answer is Correct.");
			} else {
				System.out.println("Oops!! that is wrong. Try again.");
			}
		 	
		 	if (sum == userAnswer){
		 		correctAnswer +=1;
		 	} else {
		 		wrongAnswer +=1;
		 	}
		 	counter++;
		 	
		}
		System.out.println(" ");
		System.out.println("You got " + correctAnswer + " questions correctly");
		System.out.println(" ");
		System.out.println("You missed " + wrongAnswer + ". Out of " + counter );
	
	}
	
}
