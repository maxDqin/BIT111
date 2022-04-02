package week05;

import java.util.Scanner;
import java.lang.Math;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double max = sc.nextDouble();
		for(int i=0;i<=9;i++) {
			double num = sc.nextDouble();
			max = Math.max(max, num);
		}
		System.out.println("The max one is: "+max);
	}

}
