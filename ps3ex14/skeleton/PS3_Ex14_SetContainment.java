/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #14: PS3_Ex14_SetContainment.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class SetContainment {
  
  public static void main(String[] args) {
    
    // Note: CodeCrunch only accepts one Scanner object!
    // So create 'sc' here and pass it to scanArray method twice
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Size of 1st array? ");
    int[] arrA = scanArray(sc);
    
    System.out.print("Size of 2nd array? ");
    int[] arrB = scanArray(sc);
    
    boolean subset=isSubset(arrA, arrB);
    if(subset){
      System.out.println("1st array is a subset of 2nd array");
    }else{
      System.out.println("1st array is not a subset of 2nd array");
    }
  }
  
  // Read elements into an array and return it
  public static int[] scanArray(Scanner sc) {
    
    int size = sc.nextInt();
    
    System.out.print("Enter " + size + " values: ");
    int[] arr=new int[size];
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
    return arr;
  }
  
  // <Write a short description of the method here>
  public static boolean isSubset(int[] arrA, int[] arrB) {
    for(int i=0; i<arrA.length; i++){
      int j=0;
      while(j<arrB.length){
        if(arrA[i]==arrB[j]){
          break;
        }else{
          if(j==arrB.length-1&&arrA[i]!=arrB[j]){
            return false;
          }else{
            j++;
          }
        }
      }
    }
    return true;
  }
}