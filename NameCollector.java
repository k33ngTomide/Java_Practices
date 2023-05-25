
import java.util.Scanner;

public class NameCollector {

	public static void main( String[] args ) {
	
	System.out.println("Hello");
	System.out.println("Welcome to my Program");
	
		
		Scanner entry = new Scanner(System.in);
		System.out.println("What is your First name?");
		String firstname = entry.next();
		
		System.out.println("What is your Surname?");
		String surname = entry.next();
		
		System.out.println("Hi  " + surname + firstname );
		
	}
}
