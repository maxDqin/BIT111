package week06;

public class Virus {
	
    static int virusCount = 0;
    int thisVirus=0;
 
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
