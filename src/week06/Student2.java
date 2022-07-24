package week06;

public class Student2 {
	String name;
	String address;
	String birthDate;
	static long noOfStudents = 0;
	
	public Student2() {
		noOfStudents = noOfStudents + 1;
		System.out.println("An object is created!");
	}
	
	public void setName(String new_name) {
		name = new_name;
	}
	
	public void setAddress(String new_address) {
		address = new_address;
	}
	
	public void setDateOfBirth(String dob) {
		birthDate = dob;
	}
	
	public static long getStudentNum() {
		return noOfStudents;
	}
	
	public static void main(String args[]) {
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
		Student2 s4 = new Student2();
		System.out.println("There are " + Student2.getStudentNum() + " students.");
	}
}
