package week07;

public class OutOfIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// the first way
//		int[] myArray = {1,2,3,10};
//		System.out.println(myArray[1]);
		
		// the second way
		int[] myArray = new int[4];
		myArray[0] = 1;
		myArray[1] = 2;
		myArray[2] = 3;
		myArray[4] = 10;
		System.out.println(myArray[1]);
		
		long[] passingCars = {50, 245, 189, 135, 315, 99, 100};
		System.out.println("before change "+passingCars[3]);
		passingCars[3]=201;
		System.out.println("after change "+passingCars[3]);
		System.out.println(passingCars.length);
	}

}
