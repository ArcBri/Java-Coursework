/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #23: PS1_Ex23_SAT.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez> 
 */

import java.util.Scanner;

import java.text.*;


class SAT {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter scores: ");
    int verbal = sc.nextInt();
    int maths = sc.nextInt();
    int writing = sc.nextInt();
   
    int percentile = computePercentile(verbal, maths, writing);
    
    System.out.println("The SAT score is in the " + percentile +  " percentile.");
    
    double IQ= computeIQScore( verbal,  maths);
    DecimalFormat df = new DecimalFormat("0.00");
    
    System.out.println("The IQ score is " + df.format(IQ) );
    
    if (((verbal > 600) && (maths > 600) && (writing > 600))||(IQ>119)) {
      System.out.println("Wow, this is amazing!");
    }

  }
  
  // <compute percentile of SAT score>  
  public static int computePercentile(int verbal, int maths, int writing) {
    int total = verbal + maths + writing;
    if (total>2199){
      return 99;}
    else if (total>1999){
      return 95;}
    else if (total>1499){
      return 50;}
    else return 10;
   
  }
  
  // <Compute IQ score of any decimal place>
  public static double computeIQScore(int verbal, int maths) {
    return ( 0.095 * (double) maths) + (0.003* (double) verbal) + 50.241;

  }
}