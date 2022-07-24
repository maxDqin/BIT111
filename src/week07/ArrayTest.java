package week07;

import java.util.*;
public class ArrayTest {
	static Scanner getValue = new Scanner(System.in);

	public ArrayTest() {
		double[] depth = new double[10];  // A primitive type 
		// A reference type (initialized)
		String[] myList = {"Haddock","Pike","Salmon","Tuna","Shark"};
		for(int count=0; count < myList.length;count++) {
			System.out.println("At what depth do you fish for " + myList[count] + "?\n");
			depth[count] = getValue.nextDouble();
		}
		for(int count=0; count < myList.length;count++) {
			System.out.println(myList[count] + " are caught at " + depth[count] + " meters");			
		}
	}
	public static void main(String[] args) {
		new ArrayTest();
	}
}
