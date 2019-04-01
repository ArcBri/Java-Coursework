/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #22: PS2_Ex22_Goldbach.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class Goldbach {
  
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    
    
    
    System.out.print("Enter n: ");
    
    int n=sc.nextInt();
    if(n%2!=0||n<4){
      System.out.println("wtf");
      break;
    }
    
    boolean goldbach= testConjecture(n);
    System.out.println(goldbach);
  }
  
  // Verify that every even number in range [4, n]
  // an be expressed as the sum of two primes.
  public static boolean testConjecture(int n) {
    for(int i=4; i<=n; i=i+2){
      boolean yeah= equalsSumOfTwoPrimes(i);
      if(yeah){
        return true;
      }
    }
    return false;  // stub, to be replaced by your code
  }
  
  // Check whether num can be written as the sum of two primes.
  // Return true if so, false otherwise.
  public static boolean equalsSumOfTwoPrimes(int num) {
    int q=1;
    int p=num/2;
    int r=num;
    while(q<=num/2){
      boolean prime=isPrime(q);
      if(prime){
        if(num==q*2){
          return true;
        }
      }
      q++;
    }
    while(p>1){
      boolean prime=isPrime(p);
      if(prime){
        r=num-q;
        boolean primetoo=isPrime(r);
        if(primetoo){
          return true;
        }
      }
      p--;
    }
        
        return false;  // stub, to be replaced by your code
      }
      
      // Check if num is prime or not, return true if so, false otherwise.
      public static boolean isPrime(int num) {
        for(int i=2; i<=num/2; i++){
          if(num%i==0){
            return false;
          }// stub, to be replaced by your code
        }
        return true;
        
      }
    }