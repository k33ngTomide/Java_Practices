import java.util.Scanner;

public class MaximumFinder{

	public static void main(String[] args){
	
		Scanner scanKeyboard = new Scanner(System.in);
		
		System.out.print("Enter 3 numbers: ");
		double firstNumber = scanKeyboard.nextDouble();
		double secondNumber = scanKeyboard.nextDouble();
		double thirdNumber = scanKeyboard.nextDouble();
		
		double result = maximum(firstNumber, secondNumber, thirdNumber);
		
		System.out.println("The maximum number is" + result);
	}
	
	public static double maximum(double number1, double number2, double number3){
	
		double maximumValue = number1;
		if (number2 > maximumValue){
			maximumValue = number2;
		}
		if (number3 > maximumValue){
			maximumValue = number3;
		
		}
		
		return maximumValue;
	}

}
