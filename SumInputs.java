import java.util.Scanner;
public class SumInputs{

	public static void main(String[] args){
	
		Scanner keyboardInput = new Scanner(System.in);
		
		int sum = 0;
		do {
		System.out.print("Enter a number:  ");
		int number = keyboardInput.nextInt();
			sum += number;  
		} while ( sum < 100 );
		
		if (sum >= 100)
			System.out.println("Done. The total of the number is:   " + sum);
	
	}
}
