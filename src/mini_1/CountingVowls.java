package mini_1;

import java.util.Scanner;
public class CountingVowls {
	static final int OUT = 0;
	static final int IN = 1;
   public static void main(String args[]){
	   CountingVowls c= new CountingVowls();
	   //Vowel Count start
	   System.out.println("----------------Vowel Count-------------");
	   System.out.println("Enter a Word :");
	   Scanner sc = new Scanner(System.in);
	   String word = sc.nextLine();
	   c.is_vowel(word);
	   //Count word
	   System.out.println("----------------Count Word-------------");
	   System.out.println("Enter a Sentence :");
	   sc = new Scanner(System.in);
	   String sentence = sc.nextLine();
	   c. score_word(sentence);
	   //Count Words
	   System.out.println("----------------Count Words-------------");
	   System.out.println("Enter a Sentence :");
	   sc = new Scanner(System.in);
	   String for_words = sc.nextLine();
	   System.out.println("No of words in given sentence : " + c. score_words(for_words));
   }
   //function is_vowel() counts the vowels in the word or sentence and shows the count
   public static void is_vowel(String word){
	int count = 0;
	for (int i=0 ; i<word.length(); i++){
	   char ch = word.charAt(i);
	   if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
		  count ++;
	   }
	}
	System.out.println("Number of vowels in the given word is "+count);
   }
   //function score_word() counts the vowels in the word or sentence and shows the count

  	static void score_word(String str)
	{
		// Creating an character array of given String
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			String s = "";

			// checking when the character is not space using loop
			while (i < ch.length && ch[i] != ' ') {
				s = s + ch[i];
				i++;
			}
			//displaying the words and thier length
			if (s.length() > 0)
				System.out.println(s + "->" + s.length());		
		}
	}

	// score_words() function used to count no of words given input string.
	public static int score_words(String str)
	{
		int state = OUT;
		int wc = 0; // initializing the word count
		int i = 0;
		
		// Scaning all characters one by one
		while (i < str.length())
		{
			
			if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
					|| str.charAt(i) == '\t')
				state = OUT;
				
	
			// State is OUT, then set the state as IN
			else if (state == OUT)
			{
				state = IN;
				++wc;
			}
	
			
			++i;
		}
		return wc;
	}
}	

