/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #04: PS1_Ex04_Hypotenuse.java
 * 
 * This program calculates the hypotenuse for a right angle
 * triangle with known sides a and b.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.Scanner;

class Hypotenuse {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a and b: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    
    double c = Math.sqrt((a*a)+(b*b));
 
    
    System.out.println("c = " + c );
  }
}