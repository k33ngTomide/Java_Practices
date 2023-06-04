public class AreaOfTriangle{

	public static void main(){
	
	Point A = new Point(13, 34);
	Point B = new Point(22, 21);
	Point C = new Point(11, 19);
	
	System.out.printf("Area of a triangle using coordiinates is:  %d%n", Triangle.area(A, B, C) );
	System.out.printf("Area of a triangle using base and height is: %d%n", Triangle.areaBH(3, 5));
	
	}
}

public class Point{
	
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}

}

public class Triangle{

	public static double area(Point A, Point B, Point C){
	
		double area = (A.x * (B.y * C.y) + B.x * (C.y * A.y ) + C.x * (A.y * B.y ) ) / 2;
	
		return Math.abs(area);
	}
	
	public static double areaBH(int base, int height){
		return ((base * height) / 2);
	}

}
