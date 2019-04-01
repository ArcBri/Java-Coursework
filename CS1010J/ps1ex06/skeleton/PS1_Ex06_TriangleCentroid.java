/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #06: PS1_Ex06_TriangleCentroid.java
 * 
 * This program computes the centroid (G) of a triangle
 * given the coordinates of three vertices.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.Scanner;
import java.text.DecimalFormat;

class TriangleCentroid {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
      
    System.out.print("Coordinates of 1st vertex: ");
    double x1= sc.nextDouble();
    double y1= sc.nextDouble();
    
    System.out.print("Coordinates of 2nd vertex: ");
    double x2= sc.nextDouble();
    double y2= sc.nextDouble();
    
    System.out.print("Coordinates of 3rd vertex: ");
    double x3= sc.nextDouble();
    double y3= sc.nextDouble();
    
    double xcentroid = calculateX(x1,x2,x3);
    double ycentroid = calculateY(y1,y2,y3);
    
    System.out.println("Coordinates of centroid = ("+df.format(xcentroid) + ", "+df.format(ycentroid) + ")");
  }
  
  public static double calculateX(double x1, double x2, double x3){
    return ((x1+x2+x3)/3);
  }
  
  public static double calculateY(double y1, double y2, double y3){
    return ((y1+y2+y3)/3);
  }
}