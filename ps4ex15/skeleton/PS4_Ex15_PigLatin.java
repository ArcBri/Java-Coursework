/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #15: PS4_Ex15_PigLatin.java
 * 
 * This program reads in a sentence comprising words,
 * and converts the it into Pig Latin.
 * Pig Latin is a language game primarily used in English.
 * It is usually used by children, who often use it to
 * converse in (perceived) privacy from adults,
 * or simply for amusement. (From Wikipedia)
 * 
 * <Type your name here>
 */

import java.util.*;

class PigLatin {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String sentence=sc.nextLine();
    System.out.println("Converted: "+convert(sentence) );
  }
  
  // Convert a single word.
  // For a word starting with a consonant, move that first consonant
  // to the end of the word and append "ay".
  // For a word starting with a vowel, simply append "way" to the word.
  // Return the converted word.
  public static String convert(String word) {
    String[] words=word.split(" ");
    for(int i=0; i<words.length; i++){
      if(hasVowel(words[i])){
        words[i]=words[i]+"way";
      }else{
        words[i]=words[i].substring(1)+words[i].charAt(0)+"ay";
      }
    }
    String sentence=" ";
    for(int j=0; j<words.length; j++){
      sentence+=(words[j]+" ");
    }
    return sentence.trim();  // stub
  }
  public static boolean hasVowel(String word){
    char[] vowels={'a', 'e', 'i', 'o', 'u'};
    for(int i=0; i<5; i++){
      if(word.charAt(0)==(vowels[i])){
        return true;
      }
    }
    return false;
}
}