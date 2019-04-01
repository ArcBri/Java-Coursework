/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #02: PS3_Ex02_Sorted.java
 * 
 * <Prgramme to check if array is ascending>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class Sorted {
  
  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    
    System.out.print("Enter the size of the array: ");
    int size=sc.nextInt();
    System.out.print("Enter " + size +" elements: ");
    int[] item= new int[size];
    for(int i=0; i<item.length; i++){
      item[i]=sc.nextInt();
    }
    boolean sorted=isSorted(item);
    if(sorted){
      System.out.println("Given array is sorted.");
    }else{
      System.out.println("Given array is not sorted.");
    }
  }
  
  // <Write a short description of the method here>
  public static boolean isSorted(int[] item) {
    for(int i=1; i<item.length; i++){
      if(item[i]-item[i-1]<0){
        return false;
      }// stub
    }
    return true;
  }
}