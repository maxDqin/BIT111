package week06;

import java.util.Date;

public class Student extends People {
	String name;
	String address;
	Date birthDate;
	static long noOfStudents = 0;
	
	public Student() {
		 super();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setDateOfBirth(Date date) {
		this.birthDate = date;
	}
	
	public static long getStudentNum(){
		return noOfStudents;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
//		System.out.println(Student.getStudentNum());
	}

}
