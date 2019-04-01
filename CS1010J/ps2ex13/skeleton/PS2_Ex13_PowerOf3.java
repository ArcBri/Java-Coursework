/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #13: PS2_Ex13_PowerOf3.java
 * 
 * <Finding amount of numbers divisible by 3 from given range>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class PowerOf3 {
  
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    
    
    System.out.print("Enter start and end: ");
    
    int start=sc.nextInt();
    int end = sc.nextInt();
    
    int amount= countNumbers(start, end);
    
    
    
    System.out.println("Answer = "+ amount);
  }
  
  // Count the number of integers from start to
  // end (both inclusive) that are power of 3
  public static int countNumbers(int start, int end) {
    int power = 1;
    int count=0;
    do{power++;
      count++;
      System.out.println( Math.pow(3,power));
    }while(Math.pow(3,power)>start-1&&Math.pow(3,power)<end+1);{
    }
    
    return count;  // stub, to be replaced by your code
  }
}
