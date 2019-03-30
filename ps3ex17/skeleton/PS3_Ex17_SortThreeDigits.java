/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #17: PS3_Ex17_SortThreeDigits.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class SortThreeDigits {
  
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the number of elements: ");
    int length=sc.nextInt();
    System.out.print("Enter "+length + " elements: ");
    int[] arr=new int[length];
    for(int i=0; i<length; i++){
      arr[i]=sc.nextInt();
    }
    
    sortArray(arr);
    
    System.out.println("Sorted array: "+Arrays.toString(arr));
    
  }
  
  // Bubble sort the given array according to the first 3 digits
  public static void sortArray(int[] arr) {
    for(int end=arr.length-1; end>0; end--){
      for(int i=0; i<end; i++){
        if(moreThan(arr[i],arr[i+1])==true){
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        }
      }
    }
    
  }
  
  // Compare num1 with num2 according to their first 3 digits.
  // Return true if num1 is bigger, or false otherwise
  public static boolean moreThan(int num1, int num2) {
    if(num1>99){
      while(num1>999){
        num1=num1/10;
      }
    }
    if(num2>99){
      while(num2>999){
        num2=num2/10;
      }
    }
    if(num1>num2){
      return true;
    }else{
      return false;  // stub
    }
  }
}