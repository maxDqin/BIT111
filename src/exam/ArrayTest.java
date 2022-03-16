package exam;

public class ArrayTest {
	public static void main(String args[]) {
		// declare an int array with size of 5
		// initialize the the array with 5 numbers: 4, 8, 10, 7, 0
		int[] a = {4, 8, 10, 7, 0}; 
		
		// a temporal variable
		int temp;
		
		//sort
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		//print out the array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
