package week03;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double cost = 0;
		System.out.println("Please input size:");
		double size = sc.nextDouble();
		System.out.println("Please input weight:");
		double weight = sc.nextDouble();
		System.out.println("Please input 1 for national parcel, otherwise international");
		int isNational = sc.nextInt();
		Boolean national;
		if(isNational == 1) {
			national = true;
		}else {
			national = false;
		}
		
		if(size>1 || weight>23) {
			System.out.println("Your parcel is refused!");
		}else {
			if(national==true) {// calculate national parcels
				System.out.println("Your parcel is national");
				cost = 1.85 + weight*3.5;
			}else {// calculate international parcels
				System.out.println("Your parcel is international");
				if(size<=0.125) {
					cost = 1.85 + weight*5.5; //small parcels
				}else {// for large parcels
					cost = 1.85 + weight*5.5 + 7.5;
				}
			}
		}
		
		System.out.println("Your parcel's weight is "+ weight + ", size is " + size +", and the cost is "+cost);
		sc.close();
	}

}
