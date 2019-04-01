/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #16: PS4_Ex16_Palindromes.java
 * 
 * This program reads a list of input strings, reports
 * how many of them are palindrome if we disregard case
 * and all non-letter characters.
 * 
 * <Type your name here>
 */

import java.util.*;

class Palindromes {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("How many strings? ");
    int size=sc.nextInt();
    sc.nextLine();
    int count=0;
    System.out.println("Enter " +size+  " strings, each on a line:");        
    for(int i=1; i<=size; i++){
      String sentence=sc.nextLine();
      if(isPalindrome(sentence)){
        count++;
      }
    }
      
    System.out.println("Number of palindromes = "+count );
  }
  
  
  // Check a single string 'str'.
  // Return true if str is a palindrome, or false otherwise.
  public static boolean isPalindrome(String str) {
    char[] punc={',', '.', '?', '!', ' '}
    for(int i=0; i<str.length(); i++){
      for(int j=0; j<5; j++){
        if(str.charAt(i)==char[j]){
          str=str.split
    return false;  // stub
  }
}