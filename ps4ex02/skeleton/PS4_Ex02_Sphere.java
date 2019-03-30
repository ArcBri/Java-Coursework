/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #02: PS4_Ex02_Sphere.java
 * 
 * A sphere has one attribute: radius
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

class Sphere {
  
  // Attribute
  private
    double radius;
  double diameter=radius*2;
  
  
  // Constructor
  public Sphere(double rad) {
    radius=rad; 
    diameter=2*rad;
  }
  
  // Return radius of a Sphere object
  public double getRadius() {
    return radius;  // this is a stub
  }
  
  // Return diameter of a Sphere object
  public double computeDiameter() {
    return diameter;  // this is a stub
  }
  
  // Return circumference of a Sphere object
  public double computeCircumference() {
    return Math.PI*diameter;  // this is a stub
  }
  
  // Return surface area of a Sphere object
  public double computeSurfaceArea() {
    return 4*Math.PI*radius*radius;  // this is a stub
  }
  
  // Return volume of a Sphere object
  public double computeVolume() {
    double volume= (4.0/3.0 )*Math.PI*radius*radius*radius;
    return volume;  // this is a stub
  }
}
