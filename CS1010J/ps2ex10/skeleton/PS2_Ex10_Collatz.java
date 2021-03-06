/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #10: PS2_Ex10_Collatz.java
 * 
 * <To find minimun steps needed for number to = 1 via Collatz conjecture>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class Collatz {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a natural number: ");
    
    int n= sc.nextInt();
    int count = countIterations(n);
    
    
    
    System.out.println("Number of iterations = " + count );
  }
  
  // Calculate how many rounds are needed to process n till 1
  public static int countIterations(int n) {
    int count=0;
    while (n!=1){ //leaves possibility for negative which is logically wrong (not natural)
      if(n%2==0){
        n=n/2;
      }else{
        n=3*n+1;
      }
      count++;
    }
    return count;  // stub, to be replaced by your code
  }
  
}