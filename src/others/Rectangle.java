package others;

public class Rectangle {
	
	public static double calcRectArea(double height, double width) {
		double 	area;
		area = height*width;
		return area;
	}

	public static void doSomething() {
		System.out.println("this is a void method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area;
		area = calcRectArea(12.0, 0);
//		System.out.println(area);
		doSomething();
	}

}
