package week03;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cost = 0;
		double size = 0.5;
		double weight = 3.5;
		boolean national = true;
		
		if (size>1 || weight >23) {
			System.out.println("parcel is refused!");
		}else {
			if(national) {
				cost = 1.85 + 3.5*weight;
			}else {
				if(size<=0.125) {
					cost = 1.85 + 5.5*weight;
				}else {
					cost = 1.85 + 5.5*weight + 7.5 ;
				}
			}
		}
		System.out.println(cost);
	}

}
