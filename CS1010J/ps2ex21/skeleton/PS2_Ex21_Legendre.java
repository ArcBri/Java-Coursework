/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #21: PS2_Ex21_Legendre.java
 * 
 * <Programme to verify Legendre conjecture>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class Legendre {
  
  public static void main(String[] args) {
    
    
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter n: ");
    
    int n=sc.nextInt();
    
    if(testConjecture(n)==true){
      System.out.println("true");
    }
  }
  
  // Verify if there is at least one prime number in
  // each range (1^2 to 2^2), (2^2 to 3^2), (n^2 to (n+1)^2)
  public static boolean testConjecture(int n) {
    for(int p=1; p<=n; p++){
      if(hasPrime((p*p),((p+1)*(p+1)))){
        return true;
      }
    }
    return false;  // stub, to be replaced by your code
  }
  
  // Check whether there is any prime in range [low, high],
  // return true if so, or false otherwise
  public static boolean hasPrime(int low, int high) {
    while(low<=high){
      if(isPrime(low)){
        return true;
      }
      low++;
    }
    
    return false;  // stub, to be replaced by your code
  }
  
  // <Write a short description of the method here>
  public static boolean isPrime(int num) {
    for(int factor=2; factor<=num/2; factor++){
      if(num%factor==0){
        return false;
      }// stub, to be replaced by your code
    }
    return true;
    
  }
}