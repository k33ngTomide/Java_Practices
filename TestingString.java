public class TestingString{

	public static void main(String[] args){
	
	System.out.println("1" + 1);
	System.out.println('1' + 1);
	System.out.println("1" + 1 + 1);
	System.out.println("1" + (1 + 1));
	System.out.println('1' + 1 + 1);

	System.out.println("========================");

	System.out.println(1 + "Welcome " + 1 + 1);
 	System.out.println(1 + "Welcome " + (1 + 1));
 	System.out.println(1 + "Welcome " + ('\u0001' + 1));
 	System.out.println(1 + "Welcome " + 'a' + 1);
	
	System.out.println("========================");
	
	String s1 = "This is Sabo yaba";
	String s2 = "The community in this axis are seventy";
	String s3 = "The Sabo Yaba axis community are seventy";
	
	System.out.println(s1.isEqual(s2));
	
	
	}

}
