package in_class_test;

public class TestMethod {
	public double calcRectPerimeter(double weight, double height)
	{
		double perimeter;//variable declaration
		perimeter = 2 * (weight + height);
		return perimeter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod ts = new TestMethod() ;
		System.out.println(ts.calcRectPerimeter(2, 4));
		System.out.println('c');
	}

}
