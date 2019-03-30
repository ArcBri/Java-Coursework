/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #10: PS4_Ex10_Calculator.java
 * 
 * This program implements a simple calculator that can perform
 * addition, subtraction, multiplication and division on integers.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;
import java.text.*;

class Calculator {
  
  public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);
    DecimalFormat df=new DecimalFormat("0.00");
    DecimalFormat dh=new DecimalFormat("0");
    System.out.print("Enter the number of operations: ");
    int amt=sc.nextInt();
    for(int i=1; i<=amt; i++){
      double num1=sc.nextDouble();
      
      String oprnd=sc.next();
      
      double num2=sc.nextDouble();
      switch(oprnd.charAt(0)){
        case '+':
          System.out.println((int)num1+" "+oprnd+" "+(int)num2+" "+"= "+(int)(num1+num2));
          break;
        case '-':
          System.out.println((int)num1+" "+oprnd+" "+(int)num2+" "+"= "+(int)(num1-num2));
          break;
        case '*':
          System.out.println((int)num1+" "+oprnd+" "+(int)num2+" "+"= "+(int)(num1*num2));
          break;
        case '/':
          System.out.println(dh.format(num1)+" "+oprnd+" "+dh.format(num2)+" "+"= "+df.format(num1/num2));
          break;
          
      }
    }
  }
}