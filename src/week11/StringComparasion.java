package week11;

public class StringComparasion {
	public static void main(String args[]) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3= new String("Hello");
		
		System.out.println(str1==str2); //true
		System.out.println(str1==str3); //false
		
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3)); //true
	

	}

}
