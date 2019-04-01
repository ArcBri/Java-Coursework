/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #29: PS4_Ex29_Ball.java
 * 
 * Ball class has two attributes: colour and radius.
 * 
 * <Type your name here>
 */

class Ball {
  
  private String colour;
  private double radius;
  
  public Ball(String col, double rad) {
    colour=col;
    radius=rad;
  }
  
  // Return colour of a ball
  public String getColour() {
    return colour;  // stub
  }
  
  // Return radius of a ball
  public double getRadius() {
    return radius;  // stub
  }
  
  // Compare this ball with another.
  // Return true if they have the same values, or false otherwise
  public boolean equals(Ball another) {
    if(this.colour.equalsIgnoreCase(another.colour)
         &&this.radius==another.radius){
      return true;
    }else{
      return false;
    }// stub
  }
  
  // Return e.g. "[colour = Red, radius = 5]"
  public String toString() {
    return "[colour = "+colour+", radius = "+radius+"]";   // stub
  }
}