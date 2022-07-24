package others;

public class Puppy {
	static int puppyNumber;
	int puppyAge;

	public Puppy(String name) {
		// This constructor has one parameter, name.
		System.out.println("Name chosen is :" + name);
	}

	public void setAge(int age) {
		puppyAge = age;
	}

	public int getAge() {
		System.out.println("I am here...");
		return puppyAge;
	}
	
	public int getAgeNYearsAgo(int N) {
		int age;
		age = puppyAge - N; 
		return age;
	}

	public static void main(String[] args) {
		/* Object creation */
		Puppy myPuppy = new Puppy("myDog");

		/* Call class method to set puppy's age */
		myPuppy.setAge(12);

		/* Call another class method to get puppy's age */
		int a = myPuppy.getAgeNYearsAgo(2);
		System.out.println(a);
	}
}