package week07;

public class Outofbounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// option 1
//		int[] my_array = {1, 2, 3, -5, 10};
//		System.out.println(my_array[4]);
		
		// option 2
//		int[] my_array = new int[5];
//		my_array[0]=1;
//		my_array[1]=2;
//		my_array[2]=3;
//		my_array[3]=-5;
//		my_array[4]=10;
//		
//		System.out.println(my_array[my_array.length-1]);
		
		int[] my_mum = {13, 12, 4, 7, 5, 8, 9, 11, 12, 13};
		int sum = 0;
		for(int index=0; index<my_mum.length; index ++) {
			sum = sum + my_mum[index];
		}
		System.out.println("The sum of all elements in the array is: "+ sum);
	}

}
