package week04;

public class TestMethod {
	
	public static double calcRectArea(double weight, double height)
	{
		double area;//variable declaration
		area = weight * height;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area;
		area = calcRectArea(2, 4);
		System.out.println(area);
		
	}


}
