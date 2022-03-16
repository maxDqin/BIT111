package week10;

public class Examples {

	public static void main(String[] args) {
		//Syntax error
//		System.out.println("Hello" ;  
//		System.out.println("Hello); 

		// Runtime error
		
		//Example 1
//		String str;
//		str = null;
//		System.out.printf(str);
		
		//Example 2
//		int rate, balance,  payment, credit;
//		payment = 100;
//		credit = 20;
//		rate = 8+8+payment-116;
//		balance = (payment - credit)/ rate;
		
//		int i = 0;
//		while(i>-7) {
//			System.out.println("Test...");
//			i = i-1;
//		}
		
		try {  
			System.out.println(5/0);
		    System.out.println("I am running try"); 
		    
		}  
		catch (Exception e) { 
			System.out.println("something wrong");
		}  
		finally {  
		    System.out.println("I don't know if this will get printed out");
		}

	}

}
