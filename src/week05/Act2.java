package week05;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,30,4,5,6,7,8,9, 10}; 
		int max=nums[0];   
		
		for(int i = 0 ; i < 10 ; i++){       
			max =  Math.max(max, nums[i]);
		} 
		System.out.println(max);
	}
}