package week07;

public class Example3 {
	public static void main(String[] args) {
		String[] wordList = {"smallest","biggest","big","largest","large"};
		boolean found = false;
		int index = 0;
		while(!found && (index < wordList.length)) {
			if(wordList[index].equals("largexx")) {
				found = true;
			} else {
				index++;
			}
		}
		
		if(found) {
			System.out.println("I found it at "+ index);
		}else {
			System.out.println("I did not find the word");
		}
	}
}
