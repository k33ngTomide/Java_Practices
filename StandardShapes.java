public class AngledTriangles{

	public static void main(String[] agrs){
		rightAngledTriangle();
		leftAngledTriangle();
	}
	
	public static void rightAngledTriangle(){
		for (int a = 1; a <  8; a++) {
			
			for (int b = 0; b < a; b++ ){
				System.out.print("*");
			} 
			
			System.out.println();
	
		}
	
	}
	
	public static void leftAngledTriangle(){
		for (int x = 1, y = 1; x  < 8 && y < 8; x++, y++){
		
			for (int z =0; z < x; z++){
				System.out.println(" ");
			}
			
			for (int z = 0; z < y; z++){
				System.out.print("*");
			}
		
		}
	
	}

}
