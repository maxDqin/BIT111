package week04;

public class Test1 {
	public static double sumTwoNumbers(double x, double y) {
		double sum;
		sum = x+y;
		return sum;
	}
	
	public static void main(String args[]) {
		double sum; 
		double num1, num2;
		num1 = Double.parseDouble(args[0]);
		//System.out.println(num1);
		num2 = Double.parseDouble(args[1]);
		sum = sumTwoNumbers(num1, num2);
		System.out.println(sum);
	}

}
