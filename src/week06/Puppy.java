package week06;

public class Puppy {
	static int puppyNumber;
	int puppyAge;
	
	public Puppy(String name) {
		System.out.println("Name chosen is: " + name);
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	
	public int getAge() {
		return puppyAge;
	}
	
	public int getAgeNYearsAgo(int N) {
		int age;
		age = puppyAge - N;
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy myPuppy = new Puppy("tommy");
		myPuppy.setAge(10);
		System.out.println("Variable Value: "+ myPuppy.getAge());
		System.out.println(myPuppy.getAgeNYearsAgo(8));
	}

}
