/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #27: PS4_Ex27_OddDigitSum.java
 * 
 * This program checks if the sum of all digits of
 * a given number is odd.
 * 
 * <Type your name here>
 */

import java.util.*;

class OddDigitSum {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int num=sc.nextInt();
    if(isDigitSumOdd(num)){
      System.out.println("Sum of digits for " +num+ " is odd");
    }else{
      System.out.println("Sum of digits for " +num+ " is even");
    }
  }
  
  // Return ture if the sum of all digits is odd, or false otherwise.
  // Pre-cond: num > 0
  public static boolean isDigitSumOdd(int num) {
    int sum=0;
    while(num>0){
      sum+=num%10;
      num=num/10;
    }
    if(sum%2==0){
      return false;  // stub
    }else{
      return true;
    }
  }
}