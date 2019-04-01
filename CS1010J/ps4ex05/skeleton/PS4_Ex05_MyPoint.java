/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #05: PS4_Ex05_MyPoint.java
 * 
 * This class provides various routines to
 * manipulate points in the coordinate plane (x, y).
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.text.*;

class MyPoint {
  
  // The x- and y- coordinates of a point
  private double xCoord, yCoord;
  
  // Constructor
  public MyPoint(double xInit, double yInit) {
    xCoord=xInit;
    yCoord=yInit;
    
  }
  
  // Return the x-coordinate of a point
  public double getX() {
    return xCoord;  // stub
  }
  
  // Return the y-coordinate of a point
  public double getY() {
    return yCoord;  // stub
  }
  
  // Change the value of the x-coordinate of a point
  public void setX(double x) {
    xCoord*=2;
  }
  
  // Change the value of the y-coordinate of a point
  public void setY(double y) {
    yCoord*=2;
  }
  
  // Compute the Euclidean distance between 'this' and 'another' points
  public double distanceTo(MyPoint another) {
    double xdist= Math.abs(this.xCoord-another.xCoord);
    double ydist= Math.abs(this.yCoord-another.yCoord);
    double distance=Math.sqrt(Math.pow(xdist,2.0)+Math.pow(ydist,2.0));
    return distance;  // stub
  }
  
  // Compute the area of a rectangle whose sides are
  // parallel to the x- or y-axis and has 'this' and
  // 'another' points as two opposite corners.
  public double computeRectArea(MyPoint another) {
     double xdist= Math.abs(this.xCoord-another.xCoord);
    double ydist= Math.abs(this.yCoord-another.yCoord);
    double area=xdist*ydist;
    return area;  // stub
  }
  
  // Return string representation of a point
  // Format: (x, y) where x and y are shown in 3 decimal places
  public String toString() {
    DecimalFormat df=new DecimalFormat("0.000");
    return "("+df.format(xCoord)+", "+df.format(yCoord)+")";  // stub
  }
}