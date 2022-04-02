package week05;

public class Student {
	//variables
	String name;
	char gender;
	int age;
	
	//methods
	public void study() {
		System.out.println("Student is studying...");
	}
	
	public static void classMethod() {
		System.out.println("I am static, and you do not need to call me by an obj");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.classMethod();
		Student stu = new Student();
		stu.study();
	}

}
