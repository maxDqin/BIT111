package week03;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a for loop to calculate the sum of 1+2+3+...+100.
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum = sum + i; // round 1: sum = 0 + 1
			               // round 2: sum = 0 + 1 + 2
						   // round 3: sum = 0 + 1 + 2 + 3
						   // ....
			               // round 100: sum = 0 + 1 + 2 + 3 + ... + 100
		}
		System.out.println("The sum of 1+2+3+...+100 = "+ sum);
		
		// extension: how to get the value of 1+3+5+...+99 ?
		sum = 0;
		for(int i=1;i<=99;i++,i++) {
			sum = sum + i;
		}
		System.out.println("The sum of 1+3+5+...+99 = "+ sum);
	}
	
}
