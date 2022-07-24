package week07;
import java.util.Scanner;
import java.util.Arrays;
public class Activity2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int i;
		System.out.print("Enter the size of Array: ");
		n = sc.nextInt();
		System.out.println();
		int[] val = new int[n];
		for (i=0; i < val.length; i++) {
		 val[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(val));
	
		
	}

}