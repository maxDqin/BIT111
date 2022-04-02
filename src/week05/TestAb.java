package week05;

public class TestAb {
	
	public static double getAbs(double a) {
		if(a>=0) return a;
		else return -a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 9;
		System.out.println("The absolute value of "+a+" is: "+getAbs(a) );
		System.out.println("The absolute value of "+a+" is: "+Math.abs(a) );
		System.out.println("The max value of xx and xx is "+Math.max(1.2, 34) );
	}

}
