package others;

public class Example {
	public static int maxNumber(int a, int b) {
		int max;
		if(a>b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	
	public static int maxNumber(int a, int b, int c) {
		int max;
		int temp = maxNumber(a,b);
		max = maxNumber(temp, c);
		return max;
	}
}
