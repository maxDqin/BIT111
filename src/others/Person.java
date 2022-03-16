package others;
 class Person { 
	 
    private static int population = 0; 
        
    private int age; 
    private String name;  

    // constructor
    public Person(int a, String n) { 
        age = a;      // copy constructor arg to instance var
        name = n;     // copy constructor arg to instance var
        population++; // increase static counter
    }

    // static method (not per-instance)
    public static void printPop() { 
        System.out.println("The population is " + population);
    }

    // instance method
    public void printName() { 
        System.out.println("My name is " + name + ".");
    }

    // instance method: return name and age
    // 
    public String toString() { 
        return "Name: " + name + " Age: " + age; 
    }
    
    public static void main(String[] args) {
        Person.printPop();     
                          
        // how many objects does this construct?
        Person myMom = new Person(33, "Donna");
        Person myAunt = new Person(44, "Judy");
        Person myChauffeur = myMom;

	
        myAunt.printName();

	
        System.out.println(myMom); 
        printPop();
    }
}