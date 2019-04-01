/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #11: PS4_Ex11_ICCheckCode.java
 * 
 * This program reads a NRIC number and produces its check code.
 * 
 * <Type your name here>
 */

import java.util.*;

class ICCheckCode {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter 7-digit NRIC number: ");
    int nric=sc.nextInt();
    System.out.println("Check code is "+generateCode(nric));
  }
  
  // Generate check code according to the given algorithm
  public static char generateCode(int num) {
    String code="ABCDEFGHIZJ";
    int[] mult={2, 3, 4, 5, 6, 7, 2};
    int sum=0;
    int idx=0;
    while(num>0){
      sum+=((num%10)*mult[idx]);
      num=num/10;
      idx++;
    }
    int step2=sum%11;
    int pass=11-step2;
    return code.charAt(pass-1);  // stub
  }
}