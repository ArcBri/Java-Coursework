/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #13: PS4_Ex13_WordGame.java
 * 
 * This program reads in a word and computes
 * the total points of all the letters in the word.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class WordGame {
  
  public static void main(String[] args) {
    Scanner sk = new Scanner(System.in);
    
    System.out.print("Enter a word: ");
    String word=sk.next();
    int score=0;
    for(int i=0; i<word.length(); i++){
      score+=computeScore(word.charAt(i));
    }
    System.out.println("Total score = "+score);
  }
  
  // Compute total score of letters in a word
  public static int computeScore(char word) {
    switch(word){
      case 'D': case 'G':
        return 2;
      case 'B': case 'C': case 'M': case 'P':
        return 3;
      case 'F': case 'H': case 'V': case 'W': case 'Y':
        return 4;
      case 'K':
        return 5;
      case 'J': case 'X':
        return 8;
      case 'Q': case 'Z':
        return 10;
      default:
        return 1;
    }  // stub
  }
}