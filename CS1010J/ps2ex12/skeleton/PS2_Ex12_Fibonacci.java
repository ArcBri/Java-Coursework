/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #12: PS2_Ex12_Fibonacci.java
 * 
 * <Find nth number in fibonacci sequence>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class Fibonacci {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter n: ");
    
    int n =sc.nextInt();
    int fibno= fib(n);
    
    System.out.println(fibno);
    
    
  }
  
  // <Find fibonacci number of given sequence >
  public static int fib(int n) {
    if(n<2){
      return 1;
    }else{
      int fibocurrent=1;
      int fiboprev=0;
      int fibonew=0;
      int i=2; //iteration no.
      while(i<=n){
        fibonew=fibocurrent+fiboprev;
         fiboprev=fibocurrent;
         fibocurrent=fibonew;
        i++;
      }
      return fibonew;  // stub, to be replaced by your code
    }
  }
}