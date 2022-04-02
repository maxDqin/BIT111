package week05;

import java.util.Scanner;
import java.lang.Math;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Firstly, I accept the first number as the max one. (Assumption)
		double max = sc.nextDouble();
		
		// After that, I accept the remaining 9 numbers to compare.
		for(int i=0;i<9;i++) {
			double num = sc.nextDouble(); // num is the input from console
			max = Math.max(max, num);
		}
		
		sc.close();
		
		System.out.println("The max one is: "+max);
	}

}
