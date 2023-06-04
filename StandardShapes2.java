
public class StandardShapes2{

	public static void main(String[] agrs){
		triangle();
	
	}
	
	public static void triangle(){	
		for (int i = 10, k = 0; i > 0 && k < 10; i--, k++) {
   		
   			 for (int j = 0; j < i; j++) {
        			System.out.print(" ");
   			 }
    			
    			for (int j = 0; j < k; j++) {
        			System.out.print("*");
 			}
    			for (int j = 1; j < k; j++) {
        			System.out.print("*");
    			}
    			
    			System.out.println();
		}
		
		for (int i = 0, k = 10; i < 10 && k > 0; i++, k--) {
   		
   			 for (int j = 0; j < i; j++) {
        			System.out.print(" ");
   			 }
    			
    			for (int j = 0; j < k; j++) {
        			System.out.print("*");
 			}
    			for (int j = 1; j < k; j++) {
        			System.out.print("*");
    			}
    			
    			System.out.println();
		}
	}
	
}
	

