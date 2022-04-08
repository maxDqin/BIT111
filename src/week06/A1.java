package week06;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a string:");
		String s = sc.nextLine();
		
		String output;
		if(s.length()%2==0) {
			output = ""+s.charAt(s.length()/2-1)+s.charAt(s.length()/2);
		}else {
			output = ""+s.charAt(s.length()/2);
		}
		System.out.println(output);
	}

}
