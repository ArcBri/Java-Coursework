/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #11: PS2_Ex11_CycleLength.java
 * 
 * <From entered range, find the max cycle length>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class CycleLength {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter range: ");
    
    int a= sc.nextInt();
    int b=sc.nextInt();
    int low=Math.min(a,b);
    int high=Math.max(a,b);
    
    int i= low;
    int cyclelength;
    int cyclelengthmax=0;
    while(i<= high){
      cyclelength = countIterations(i);
      if (cyclelength>cyclelengthmax){
        cyclelengthmax=cyclelength;
      }
      i++;
    }
    
      System.out.println("Maximum cycle length = " + cyclelengthmax);
  }
  
  // Calculate how many rounds are needed to process n till 1
  public static int countIterations(int n) {
    int count=0;
    while (n>1){ //leaves possibility for negative which is logically wrong (not natural)
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

