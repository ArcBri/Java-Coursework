/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #07: PS3_Ex07_ReverseArray.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class ReverseArray {
  
  public static void main(String[] args) {
    
    int[] arr = readArray();
    
    reverseArray(arr);
    
    System.out.println("Reversed: "+Arrays.toString(arr));
    // Refer to lecture 7 notes how to use Arrays.toString
    // to print out an array        
  }
  
  // Read and return an array
  public static int[] readArray() {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("How many values in the array? ");
    int length =sc.nextInt();
    System.out.print("Enter "+ length + " values: ");
    
    int[] arr = new int[length];
    
    for(int i=length-1; i>=0; i--){
      arr[i]=sc.nextInt();
    }
    return arr;
  }
  
  // <Write a short description of the method here>
  public static void reverseArray(int[] arr) {
    
    // Can you avoid defining additional array?
  }
}