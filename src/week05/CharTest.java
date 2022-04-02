package week05;
import java.util.Scanner;
//import static java.lang.Character.toLowerCase;
public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please input the char: ");
			String s = sc.nextLine();
			if(s.equals("End")) {
				System.out.println("Good bye");
				break;
			}
			char ch = s.charAt(0);
			System.out.println(Character.toUpperCase(ch));
		}
	}

}
