package week05;

import java.lang.Character;
import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(; ;) {//while(true)
			String s = sc.nextLine();
			char c = s.charAt(0);
			if(c=='#') {
				sc.close();
				break; 
//				System.exit(0);
			}
			char upcase = Character.toUpperCase(c);
			System.out.println(upcase);
		}
	}

}
