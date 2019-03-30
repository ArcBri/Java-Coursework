/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #25: PS2_Ex25_OddHunter.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class OddHunter {
  
  public static void main(String[] args) {
    
    
    
    System.out.print("Enter a positive integer: ");
    Scanner sc= new Scanner(System.in);
    
    int number=sc.nextInt();
    
    int sum=checkDigits(number);
    
    
    System.out.println("Answer = " + sum );
  }
  
  public static boolean isOdd(int digit){
    if(digit%2==0){
      return false;
    }
    return true;
  }
  public static boolean hasOdd(int number){
    while(number>0){
      int digit=number%10;
      if(digit%2!=0){
        return true;
      }
      number=number/10;
    }
    return false;
  }
  public static int checkDigits(int number){
    int sum=0;
    do{ 
      while(number>0){
      int digit=number%10;
      boolean odd= isOdd(digit);
        if(odd){
          sum+=digit;
        }
        number=number/10;
      }
      number=sum;
    } while(hasOdd(number));
    return sum;
  }
}
