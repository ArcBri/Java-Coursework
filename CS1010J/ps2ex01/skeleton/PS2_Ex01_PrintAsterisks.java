/*
 * CS1010J Programming Methodology
 * Problem Set 2 Exercise #01: PS2_Ex01_PrintAsterisks.java
 * 
 * <From entered integer n, n number of asterisks printed in a line>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class PrintAsterisks {
  
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    
    System.out.print("Enter n: ");
    
    int n= sc.nextInt();
    
    for(int i=1; i<=n; i++) {
      
      System.out.print('*');
    }
    
    System.out.println();  // just to change line
  }
}