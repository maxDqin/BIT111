package others;

public class ClassMethod {
    public ClassMethod() {
    	
    }
    public static int findMinimum(int number1, int number2) {
        int minimum = number2; 
        if (number1 < number2) minimum = number1; 
        return minimum; 
    }
    
    public static void main(String args[]) {
    	//calling method outside of the class
    	int min = ClassMethod.findMinimum(3, 5);
    	System.out.println(min);
    }

}

