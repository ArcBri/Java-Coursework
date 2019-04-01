/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #05: PS1_Ex05_CompositeShape.java
 * 
 * This program computes the area of the given composite shape.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.Scanner;
import java.text.DecimalFormat;  // to format real number output

class CompositeShape {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of rectangle: ");
    double length = sc.nextDouble();
    
    System.out.print("Enter width of rectangle: ");
    double width = sc.nextDouble();
    
    
    DecimalFormat df= new DecimalFormat("0.0000");
    
    double area = calculateArea(length, width);
    
    System.out.println("Area = " + df.format(area));
  }
  
  public static double calculateArea( double length, double width){
    return ((Math.PI/2)*Math.pow((length/2),2))+(length*width);
  }
}