package week06;

class Speak {
    public static void main(String arguments[]) {
        Dog doggie = new Dog();
        Cat cat = new Cat ();
        doggie.name = "Jelly";
        cat.name= "Poll";
        System.out.println("First we'll get the dog to speak:");
        doggie.speak();
        System.out.println("Now it's cat's turn to speak:");
        cat.speak();
        System.out.println("Time for both to sleep:");
       System.out.print(doggie.name +" ");
       doggie.sleep();
       
       System.out.print(cat.name +" ");
       cat.sleep();
    }
}
