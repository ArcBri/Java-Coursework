/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #05: PS4_Ex05_TestMyPoint.java
 * 
 * This class demonstrates the use of MyPoint class.
 * It reads a double seed and generates 2 points p and q as follows:
 *   p's x-coordinate: divide seed by 17 and take the quotient
 *   p's y-coordinate: divide seed by 53 and take the remainder
 *   q's x-coordinate: divide seed by 11 and take the quotient
 *   q's y-coordinate: divide seed by 41 and take the remainder
 * It then computes, by invoking appropriate member methods of the MyPoint class,
 * the Euclidean distance between the two points, and the area of the
 * rectangle bounded by these 2 points as the opposite corners.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;
import java.text.*;

class TestMyPoint {
  
  public static void main (String [] args) {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter seed: ");
    double seed=sc.nextDouble();
    
    // create point p
    
    double x=seed/17;
    double y=seed%53;
    
    MyPoint p=new MyPoint(x,y);
    
    System.out.println("p = "+p.toString() );
    // create point q
    
    
    x=seed/11;
    y=seed%41;
    
    MyPoint q=new MyPoint(x,y);
    System.out.println("q = "+q.toString() );
    
    double distance=p.distanceTo(q);
    double area=p.computeRectArea(q);
    DecimalFormat here=new DecimalFormat("0.00000");
    System.out.println("Distance = "+here.format(distance));
    System.out.println("Area = "+here.format(area));
  }
}