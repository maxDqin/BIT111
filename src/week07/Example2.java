package week07;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {13,12,4,7,5,8,9,11,12,13};
		int sum = 0;
		for(int i=0;i<myArray.length;i++) {
			sum = sum + myArray[i];
		}
		System.out.println("The sum of the array is: "+ sum);
	}

}
