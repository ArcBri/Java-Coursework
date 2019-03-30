/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #06: PS4_Ex06_Car.java
 * 
 * This program uses Car class. It reads in a car's information,
 * and creates a Car object. It then reads a list of trips, updates
 * the odometer reading, and computes the average distance travelled per trip.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class TestCar {
  
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter model: ");
    String model=sc.nextLine();
    
    System.out.print("Enter colour: ");
    String colour=sc.nextLine();
    
    
    System.out.print("Enter odometer value: ");
    double odo=sc.nextDouble();
    
    // create a car object with 3 values read
    Car vroom=new Car(model, colour, odo);
    
    System.out.print("Enter the number of trips: ");
    
    int trips=sc.nextInt();
    // Note: there could be a few different designs
    // Computation may be done partially in the main method
    // and partially in the Car class
    double distance=0;
    
    for(int i=1; i<=trips; i++){
      System.out.print("Distance for trip "+i+": ");
      distance+=sc.nextDouble();
      //odo+=distance;
        //System.out.print(odo);
    }
    vroom.updateOdometer(distance);
    // compute the total distance travelled
    double average=distance/trips;
    
    // update car with the total distance
    
    
    System.out.println("Model: "+vroom.getModel() );
    System.out.println("Colour: "+vroom.getColour() );
    System.out.println("Odometer: "+vroom.getOdometer() );
    
    System.out.println("Trips: "+trips );
    System.out.println("Distance per trip: "+average );
  }
}