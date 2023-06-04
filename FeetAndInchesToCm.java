public class FeetAndInchesToCm{

	public static void main(String[] args){
		calcFeetAndInchesToCentimeters(6, 8);
		System.out.print(" \n");
		calcFeetAndInchesToCentimeters(150);
	
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches){
		if (feet >= 0 || (inches >= 0 && inches <= 12) ){
			
			double feetInCm = feet * 12;
			double inchesInCm = inches *  2.54;
			double conversion = feetInCm + inchesInCm;
			
			System.out.println("The conversion of " + feet + "fts " + inches + "inches =  " + conversion + "cm");
			return conversion;
		} else {
			return -1;
		}
	
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches){
		if (inches >= 0 ){
			
			double feet = (int) inches / 12;
			double remainingInches = (int) inches % 12;
			
			System.out.println(inches + "inches is equal to " + feet + "fts " + remainingInches + " inches" );
			return  calcFeetAndInchesToCentimeters(feet, remainingInches);
			
		} else {
			return -1;
		}
		
	}
	
}
