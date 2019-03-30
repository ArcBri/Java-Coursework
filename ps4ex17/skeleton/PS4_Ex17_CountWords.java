/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #17: PS4_Ex17_CountWords.java
 * 
 * This program reads a sentence and
 * counts the number of words in it.
 * 
 * <Type your name here>
 */

import java.util.*;

class CountWords {
  
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.print("Enter a sentence: ");
    String str=sc.nextLine();
    System.out.println("Word count = "+wordCount(str) );
  }
  
  // Count the number of words in sentence
  public static int wordCount(String sentence) {
    String[] word=sentence.split(" ");
    int amt=word.length;
    for(int i=0; i<word.length; i++){
      if(noVowel(word[i])){
        amt--;
      }
    }
    return amt;  // stub
  }
  public static boolean noVowel(String str){
    for(int i=0; i<str.length(); i++){
      if(Character.isLetter(str.charAt(i))){
        return false;
      }
    }
    return true;
  }
}