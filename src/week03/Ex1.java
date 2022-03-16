package week03;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		if(a>0) {
			System.out.println("a is a positive number");
		}else if(a==0) {
			System.out.println("a is o");
		}else {
			System.out.println("a is a negative numebr");
		}
		
		int sum = 0;
		for(int i=1;i<=99;i=i+2) {
			sum = sum+i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i=0;i<=100;i=i+2) {
			sum = sum+i;
		}
		System.out.println(sum);
	}

}
