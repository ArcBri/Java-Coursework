/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #06: PS2_Ex06_FirstDigit.java
 * 
 * <Find the leftmost digit of given integer>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class FirstDigit {
  
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    
    int i =sc.nextInt();
    
    int answer= findFirstDigit(i);
    
    
    System.out.println("Leftmost digit is " + answer);
  }
  
  public static int findFirstDigit(int i){
    while(i>9){
      i=i/10;
    }
    return i;
  }
}