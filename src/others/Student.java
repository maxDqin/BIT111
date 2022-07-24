package others;

public class Student {
	String name;
	String address;
	String birthDate;
	static long noOfStudents;
	
	public Student() {
		noOfStudents = noOfStudents + 1;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public static long getStudentNum() {
		return noOfStudents;
	}
	
}
