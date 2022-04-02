package week05;

import java.lang.Math.*;

public class AbsValue {
	
	public static int makeAbsolute(int value) {
		int abs;
		if(value<0) {
			abs = value * (-1);
		}else {
			abs = value;
		}
		return abs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -9;
		System.out.println(makeAbsolute(a));
		System.out.println(Math.abs(a));
	}

}
