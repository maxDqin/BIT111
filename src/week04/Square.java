package week04;

public class Square {
	// write a method to get the square of an integer
	// for example, the square of 3 is 3*3 = 9
	public static int getBiggest(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static int getBiggest(int x, int y, int z) {
		int temp;
		temp = getBiggest(x, y);
		int biggest;
		biggest = getBiggest(temp, z);
		return biggest;
	}
	
	public static void main(String args[]) {
		System.out.println(getBiggest(1, 200, 43));
	}
}
