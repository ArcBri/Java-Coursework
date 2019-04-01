/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #23: PS4_Ex23_Contains.java
 * 
 * This program checks if digit 'k' appears in 'number'.
 * 
 * <Type your name here>
 */

import java.util.*;

class Contains {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int num=sc.nextInt();
    System.out.print("Enter a single digit integer k: ");
    int k=sc.nextInt();
    if(contains(num, k)==true){
      System.out.println(k+ " appears in "+num );
    }else{
      System.out.println( k+" doesn't appear in "+num );
    }
  }
  
  
  // Check if k appears in any digit of number
  // Return true if so, or false otherwise
  // Pre-cond: number > 0, k < 10 && k >= 0
  public static boolean contains(int number, int k) {
    if(number<10&&number!=k){
      return false;
    }else{
      if(number%10==k||contains(number/10, k)){
        return true;
      }
    }
    return false;
  }
}
