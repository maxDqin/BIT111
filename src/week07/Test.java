package week07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String[] wordList = new String[3];
		String[] numList = new String[3];
		Scanner inFile = new Scanner(new FileReader("./data.txt"));
		int index = 0;
		while(inFile.hasNext()) {
			wordList[0] = inFile.next();
			numList[index] = inFile.next();//"17" nextInt 17
			System.out.println("The name is "+ wordList[index] + "\nThe age is: " + numList[index]);
			
			//index = index+1;
		}
		Scanner console = new Scanner(System.in);
	}
	

}
