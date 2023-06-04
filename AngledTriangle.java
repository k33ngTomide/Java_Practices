public class AngledTriangle{

	public static void main(String[] agrs){
		rightAngledTriangle();
		invertedTriangle();
		leftAngledTriangle();
		
		
	}
	
	public static void rightAngledTriangle(){
		for (int a = 1; a <  8; a++) {
			
			for (int b = 0; b < a; b++ ){
				System.out.print("*");
			} 
			
			System.out.println(" \n\n");
	
		}
	
	}
	
	public static void invertedTriangle(){
		for (int a = 8; a > 0; a--) {
			
			for (int b = 0; b < a; b++ ){
				System.out.print("*");
			} 
			
			System.out.println(" ");
	
		}
	
	}
	
	public static void leftAngledTriangle(){
		for (int x =8 , y = 1; x  > 0 && y < 8; x--, y++){
		
			for (int z =0; z < x; z++){
				System.out.print(" ");
			}
			
			for (int z = 0; z < y; z++){
				System.out.print("*");
			}
		System.out.println(" ");
		}
	
	}

}
