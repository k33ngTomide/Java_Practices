public class TabularOutput {

	public static void main(String[] args){
	
		int value =1;
		
		System.out.println("N       NSquare       Ncube         NQuad");
		
		while (value <= 5) {
		
		System.out.println(value + "\t"  + ((int)Math.pow(value, 2)) + "\t\t"  +    ((int)Math.pow(value, 3)) + "\t      " + ((int)Math.pow(value, 4)));
		
		value++;
		
		}
	
	
	}

}
