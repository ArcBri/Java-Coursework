/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #02: PS2_Ex02_CountPositive.java
 * 
 * <To read off how many positive integers from an input of 5 integers>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class CountPositive {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter 5 integers: ");
    
    int no1= sc.nextInt();
    int count= 0;
    for(int i=0; i<5; i++){
      if(no1>0){
        count++;
      }
      if (i==4){
        break;
      }
      no1= sc.nextInt();
    }
      
      System.out.println("Count = " + count);
    }
  }
