package week03;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input a number: ");
		int score = sc.nextInt();
		switch(score) {
		case 10:
		case 9:
			System.out.println("Excellent");
			break;
		case 8:
		case 7:
			System.out.println("Very good");
			break;
		case 6:
			System.out.println("Good");
			break;
		case 5:
			System.out.println("bad");
			break;
		case 4: // if score equals to 4
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("very bad");
			break;
		default:
			System.out.println("Wrong input");
		}
		sc.close();
	}

}
