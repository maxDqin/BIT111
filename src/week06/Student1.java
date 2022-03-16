package week06;

public class Student1 {
	String name;
	String address;
	int birthDate;
	static int noOfStudent;
	
	public Student1() {
		System.out.println("An object of Studnet is creating...");
		noOfStudent = noOfStudent+1;
	}
	
	public void setName(String s_name) {
		name = s_name;
	}
	
	public void setAddress(String s_address) {
		address = s_address;
	}
	
	public void setDateOfBirth(int s_dob) {
		birthDate = s_dob;
	}
	
	public static int getStudentNum() {
		return noOfStudent;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();
		Student1 s4 = new Student1();
		s4.setDateOfBirth(19900101);
		System.out.println(Student1.getStudentNum());

	}

}
