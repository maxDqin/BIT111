package week04;

public class SumThree {
	
	public static int max(int a, int b) {
		// return the max number of a and b
		if(a>b) return a;
		else return b;
	}
	
	public static void main(String args[]) {
		int n1 = 2;
		int n2 = 3;
		int n3 = 100;
		int n4 = 99;
		int max_2 = max(n1, n2);
		int max_3 = max(max_2, n3);
		int max_4 = max(max_3, n4);
		System.out.println("The max num of three ones is: "+ max_4);
		
		int i,a,b,c;
		int sum=0;
		
		for (i=100;i<=199;i++){
			
			c=i%10;
			b=i/10%10;
			a=1/100%10;
			sum=a*a*a+b*b*b+c*c*c;
			if (i==sum){
				System.out.println("hi");
			}
		}
	}

}
