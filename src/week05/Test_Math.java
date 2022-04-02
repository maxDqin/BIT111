package week05;
import static java.lang.Character.*;
import static java.lang.Math.*;

public class Test_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		double u;
		double v;
		
//		System.out.println("Line 1: Uppercase a is "+ toUpperCase('a')); //Line 1
		
		u = 4.2;
		v = 3.0;
		
//		System.out.printf("Line 4: %.1f to the power of %.2f = %.2f%n", u,v,Math.pow(u,v));//Line 4
//		System.out.printf("Line 5: 5 to the power of " + "4 = %.2f%n", Math.pow(5, 4));//Line 5
		
		u = u + Math.pow(3, 3);
//		System.out.printf("Line 7: u = %.1f", u);//Line 7
//		
		x = -15;
		System.out.printf("Line 9: The absolute value of %d = %d%n", x, abs(x));// Line 9
	}

}
