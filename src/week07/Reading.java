package week07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Reading {
	public static void main(String[] args) throws FileNotFoundException {
		String[] wordList = new String[30];
		int[] numList = new int[30];
		Scanner inFile = new Scanner(new FileReader("./data.txt"));
		int index = 0;
		while(inFile.hasNext()) {
			wordList[index] = inFile.next();
			numList[index] = inFile.nextInt();
			System.out.println("The name is "+ wordList[index] + "\nThe age is " + numList[index]);
			index++;
		}
		inFile.close();
	}
}
