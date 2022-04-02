package week04;

public class Test {

	public static double calcMin(double a, double b) {
		if (a>b) {
			return b;
		}else {
			return a;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c = 0;
		c = calcMin(5.6, -9.9); // call method
		System.out.println("The min value is: "+c);
	}

}
