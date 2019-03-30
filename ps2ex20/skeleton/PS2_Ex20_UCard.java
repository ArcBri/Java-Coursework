/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #20: PS2_Ex20_UCard.java
 * 
 * <Programmer to check validity of card via Luhn-an algorithm as well as determine issuing branch if valid>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class UCard {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter uCard Number: ");
    int cardno=sc.nextInt();
    int checkno=luhnah(cardno);
    System.out.println("The check number is " + checkno);
    boolean valid = checkno%7==0 ;
    
    if (valid){
      System.out.println("Valid");
printBranch(cardno);
    }else{
      System.out.println("Invalid");
    }
  }
  
  // <Find check number>
  public static int luhnah(int cardno) {
   int a;//rightmost in iteration
   int b;//2ndrightmost in iteration
   int checkno=0;
   while(cardno>9){
     a=cardno%10;//rightmost in iteration
     cardno=cardno/10;//remove rightmost digit
     b=(cardno%10);//rightmost currently but 2nd rightmost in iteration so far
     b=b*2;
     if (b>9){
       b=(b/10)+(b%10);
     }
     checkno=checkno+a+b;
     cardno=cardno/10;//remove rightmost digit 
   }
   checkno=checkno+cardno;//add leftmost digit
     return checkno;
  }
  
  // <Check branch using first two digits>
  public static void printBranch(int cardno) {
    while (cardno>99){
      cardno=cardno/10;
    }
    if (cardno>30&&cardno<36){
        System.out.println("Issued by East branch"); 
    }else if (cardno>50&&cardno<56){
      System.out.println("Issued by West branch"); 
    }else{
       System.out.println("Issued by Central branch"); 
        
        
        
        
    }
    
  }
  }