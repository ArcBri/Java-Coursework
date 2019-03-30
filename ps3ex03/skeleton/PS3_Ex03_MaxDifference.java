/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #03: PS3_Ex03_MaxDifference.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class MaxDifference {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size=sc.nextInt();
    
    System.out.print("Enter " + size +" elements: ");
    int[] element = new int[size];
    
      for(int i=0; i<element.length; i++){
      element[i]=sc.nextInt();
    }
    
    int difference = maxDifference(element);
    
    System.out.println("Max difference = "+ difference);
  }
  
  // <Write a short description of the method here>
  public static int maxDifference(int[] arr) {
    int max=0;
    int difference;
    for(int i=1; i<arr.length; i++){
    difference=Math.abs(arr[i]-arr[i-1]);
    if (max<difference){
      max=difference;
    }
    }
    return max;  // stub
  }
}