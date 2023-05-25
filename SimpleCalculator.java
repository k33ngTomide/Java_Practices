
import java.util.Scanner; 

public class SimpleCalculator {
	public static void main ( String[] args) {
	
	System.out.println("Simple calculator ");	
	
	System.out.print("input the first number...  ");
	Scanner Scan = new Scanner(System.in);
	int num1 = Scan.nextInt();
	System.out.println("First number was  inputted as  "+ num1);
	
	System.out.print("input the second number...  ");
	int num2 = Scan.nextInt();
	System.out.println("Second number was inputed as  " + num2);
	
	System.out.println("The result of this two numbers are below");
	
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		double num5 = num1 / num2;
		int num6 = num1 * num2;
		
	System.out.println("Addition =  " + num3);
	System.out.println("Substraction =  " + num4);
	System.out.printf("Division = %.4f%n ", num5);
	System.out.println("Multiplication =  " + num6);
	System.out.print("");
	
	}

}
