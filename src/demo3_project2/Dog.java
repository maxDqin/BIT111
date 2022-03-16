package demo3_project2;
public class Dog extends Mammal {
    public void speak() {
        System.out.println("Arf! Arf!");
    }
    
    public void sleep() {
    	System.out.println("Overriding method from Mammal");
    }
}
