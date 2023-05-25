public class FavouriteNumber{

	public static void main(String[] args) {

	System.out.println("Welcome to a new program." + "you can call this the Beginning.");
	
	Scanner keyboardInput = new Scanner(System.in);
	
	System.out.print("Enter your favourite Number:  ");
	int favouriteNumber = keyboardInput.nextInt();
	
	System.out.println("Your favourite Number is  " + favouriteNumber );
	System.out.println(favouriteNumber + "  is my favourite Number too" );
	
	
	}
}
