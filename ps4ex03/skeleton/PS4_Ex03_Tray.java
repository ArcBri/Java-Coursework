/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #03: PS4_Ex03_Tray.java
 * 
 * A rectangle tray has two attributes: length and width.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

class Tray {
  
  // Attributes
  private
    double x;
 double y;
 double perimeter;
  
  // Constructor
  public Tray(double side1, double side2) {
    x=side1;
    y=side2;
    
  }
  
  // Fold a tray into halves once, either along the x-axis or the y-axis
  // such that the resulting tray has minimum perimeter.
  public void fold() {
    perimeter=2.0*(x/2)+y+y;
    if(perimeter>(x+x+(2.0*(y/2)))){
      perimeter=(x+x+(2.0*(y/2)));
    }
    
  }
  
  // Return the perimeter of a tray object
  public double computePerimeter() {
    return perimeter;  // this is a stub
  }
}