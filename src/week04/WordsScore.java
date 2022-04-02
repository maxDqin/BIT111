package week04;

import java.util.Arrays; //import Arrays
import java.util.Scanner; //import Scanner class for take input from user

class WordsScore {

    public static boolean is_vowel(Character[] word, String letter, int j) { //this function checked the vowel in word

        return Arrays.asList(word).contains(letter.charAt(j)); //return true/false
    }

    public static int score_word(Integer scorePerWord) { //get corrrect score of word

        if (1 <= scorePerWord && scorePerWord < 3) { //create if condition to check scorePerWord
            return 1;
        } else if (scorePerWord >= 3) {
            return 2;
        }
        return 0;
    }

    public static Integer score_words(int[] list) {  //this function will calculate all score of words
        int count = 0;
        for (int i = 0; i < list.length; i++) { ///for loop 
            count = count + list[i];
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};  //create vowels array
        System.out.println("Please enter number of words : ");  //print message on screen
        Integer n = data.nextInt();  //get input from user
        System.out.println("Please enter whole words : "); //print message on screen
        data = new Scanner(System.in);
        String sentence = data.nextLine(); //get input from user

        int[] result = new int[n];

        String[] words = sentence.split(" ");  //split sentence into word 

        for (int i = 0; i < words.length; i++) {  //for loop for iterate all arrays of words
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {

                if (is_vowel(vowels, words[i], j)) {
                    count++;  //increment count
                }
            }
            result[i] = score_word(count);  //get and store score of word
        }

        System.out.println("Total Score of given Sentence is : " + score_words(result)); //print message on screen

    }

}
