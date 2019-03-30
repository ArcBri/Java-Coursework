/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #01: PS3_Ex01_NonNegative.java
 * 
 * <Checks if element in array is all non-negative>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class NonNegative {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size=sc.nextInt();
    System.out.print("Enter " + size + " elements: ");
    int[] item=new int[size];
      
      for(int i=0; i<item.length; i++){
      item[i]=sc.nextInt();
    }
    boolean nonNegative=nonNegative(item);
    if(nonNegative==false){
        System.out.println("Some array elements are negative");
    }else{
    
    System.out.println("All array elements are non-negative");
  }
  }
  // <Write a short description of the method here>
  public static boolean nonNegative(int[] arr) {
    for(int i=0; i<arr.length; i++){
      if(arr[i]<0){
    return false;
      }
    }return true;// stub, to be replaced by your code
    
    /* We have seen the word 'stub' many times. What is a 'stub'?
     * 
     * A stub is a method which is incomplete, but has enough code to
     * be compiled and work with other methods. When programmers are writing
     * code together, they frequently use stubs as placeholders until
     * the programmer responsible has finished the work.
     * Even if you are working alone, you may use stubs for certain parts
     * of your code while you are focusing on other parts first. This is the
     * idea of incremental development. 
     * 
     * In a stub, the body of the method usually contains only a comment
     * like 'this is a stub'. If the method needs to return a value in order
     * to compile successfully, the programmer will add a line to return
     * a dummy value, such as zero. 
     */
  }
}