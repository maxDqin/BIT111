package week06;

public class Virus {
	
    static int virusCount = 0; // This is a class variable, which means there
                               // is only one vriusCount and is shared by all objects.
    
    int thisVirus=0; // This is an instance variable, and each object has its own. 
    				 //	That is to say, when creating an object,
                     // a thisVirus variable will be assigned to its object.
                     // Suppose you've created N objects, there are N thisVirus in your app.
 
    public Virus() {
        virusCount++;
        thisVirus++;
    }
 
    static int getVirusCount() {
    	return virusCount;
    }
    
    void localVirus(){
       int localV=0;
       getLocalVirus(localV);
    }
    
    int getLocalVirus(int localV){
    	localV++;
    	System.out.println("There are "  + localV+" local viruses.");
    	return localV;
    }
    
}
