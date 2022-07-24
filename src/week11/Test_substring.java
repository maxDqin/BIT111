package week11;

public class Test_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence;
		sentence = "Programming with Java";
		int index=-1;
		String s1 = "";
		while(true) {
			index = sentence.indexOf("a");
			if(index == -1) break;
			System.out.println(index + s1.length());
			s1 = sentence.substring(0, index);
			sentence = sentence.substring(index+1);
			
		}
	}

}
