

import java.util.Scanner;
public class AccountTest {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	Account myAccount = new Account();

System.out.printf("Initial name is: %s%n", myAccount.getName());
System.out.printf("Initial age is: %d%n", myAccount.getAge());
System.out.printf("Initial Contact is %d%n", myAccount.getContact());
System.out.printf("Initial father name is %s%n", myAccount.getFatherName());

	System.out.print("Please enter the name: ... ");
		String theName = scan.nextLine();
		myAccount.setName(theName);
		System.out.println();
		
	System.out.print("please enter the age: ... ");
		int theAge = scan.nextInt();
		myAccount.setAge(theAge);
		System.out.println();
			
	System.out.print("Please enter your Contact number: ... ");
		long theContact = scan.nextLong();
		myAccount.setContact(theContact);
		System.out.println();
		
	System.out.print("Please enter your father's name");
		String theFatherName = scan.nextLine();
		myAccount.setFatherName(theFatherName);
		System.out.println();
	
		System.out.printf("Name in object myAccount is: %s%n", myAccount.getName());
		System.out.printf("The Age in object myAccount is: %d%n", myAccount.getAge());
		System.out.printf("The Contact in object myAccount is: %d%n", myAccount.getContact());
		System.out.printf("The father's name is: %s%n", myAccount.getFatherName());

	}
	

}
