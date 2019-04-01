/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #28: PS4_Ex28_Addition.java
 * 
 * This program computes the sum of two integers in a recursive way.
 * 
 * <Type your name here>
 */

import java.util.*;

class Addition {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter two positive integers: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Sum = "+add(a,b,0) );
  }
  
  // Add two integers recursively by adding digits in corresponding
  // columns together with carry.
  public static int add(int num1, int num2, int carry) {
    int sum;
    if(num1==0){
      return num2+carry;
    }else if(num2==0){
      return num1+carry;
    }else{
      int num=num1%10 + num2%10 + carry;
      sum=num%10;
      carry=num/10;
    }
    return sum+10*(add(num1/10, num2/10, carry));  // stub
  }
}