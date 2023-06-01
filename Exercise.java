import java.util.Scanner;
public class Exercise{

	public static void main(String... args){
		Scanner keyboardInput = new Scanner (System.in);
		
		System.out.print("Enter true if the game is over, enter false if the game is still on:  ");
		boolean gameOver = keyboardInput.nextBoolean();
		
		System.out.print("Enter your score:  ");
		int score = keyboardInput.nextInt();
		
		System.out.print("Enter the number of level completed:  ");
		int levelCompleted = keyboardInput.nextInt();
		
		if (score > 1000 && levelCompleted >= 50 ){
			System.out.println("You are a LEGEND in the Game. You had a great score");
		} else if (score <= 1000 && levelCompleted >=50 ){
			System.out.println("You tried in the game but your score is not encouraging");
		} else {
			System.out.println("Try AGAIN later.");
		}
		
		if (gameOver = true){
		System.out.println("GameOver!!! click on Play to try again");
		} else {
			System.out.println("click on Continue playing to complete the name");
		}
		
	}

}
