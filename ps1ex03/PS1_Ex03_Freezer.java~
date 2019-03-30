/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #03: PS1_Ex03_Freezer.java
 * 
 * This program estimates the temperature in a freezer 
 * given the elapsed time (hours) since a power failure.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class PS1_Ex03_Freezer {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.print ("Enter hours and minutes since power failure" + ":");
    double hour = sc.nextDouble();
    double minutes = sc.nextDouble();
    
    double totalhours = hour + computeHours(minutes);
    
    
    System.out.println ("Temperature in freezer" +" "+ "="+ " " + computeTemperature(totalhours));
  }
  
  public static double computeHours( double a) {
    return a/60;
  }
  public static double computeTemperature(double c) {
    return (((4*Math.pow(c,2))/(c + 2)) - 20);
  }
}
