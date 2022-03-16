package week04;

public class MaxTest {
	
	public static int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static int max(int a, int b, int c) {
		int m ;
		if(a>b) {
			m = max(a, c);
		}else {
			m = max(b, c);
		}
		return m;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=9;
		int c=10;
		System.out.println(max(a,b));
		System.out.println(max(a,b,c));
	}

}
