package week07;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] my_array = new int[5];
//		my_array[0] = 1;
//		my_array[1] = 2;
//		my_array[2] = 3;
//		my_array[3] = -5;
//		my_array[4] = 10;
//		System.out.println(my_array[4]);
//		System.out.println(my_array.length);
		int[] my_array = {13, 12, 4, 7, 5, 8, 9, 11, 12, 13};
		int sum = 0;
		for(int index=0; index<my_array.length; index++) {
			sum  +=  my_array[index];
			//sum = sum + my_array[index];
		}
		System.out.println("The sum of the given array is: "+ sum);
	}

}
