package week05;

public class AbsValue {
	
	public static int abs(int a) {
		int absVal;
		if(a<0) { // means a is less than 0, such as -9, -8,...
			absVal = (-1) * a; 
		}else if (a>0) { //means a is bigger than 0, such as 1,3...
			absVal = a;
		}else { //means a is 0
			absVal = 0;
		}
		return absVal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -9;
		System.out.println(abs(a));
	}

}
