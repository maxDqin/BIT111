package others;

public class TenNumber {
	public static void main(String args[]) {
		int a[] = {2,3,14,5,1,10,100,3,4,4};
		int max=a[0];
		for(int i=0;i<10;i++) {
			if (a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
