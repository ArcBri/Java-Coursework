/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #10: PS3_Ex10_Tuple.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class Tuple {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of distinct elements in sorted array: ");
    int size=sc.nextInt();
    System.out.print("Enter "+size + " elements: ");
    int[] arr=new int[size];
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
    System.out.print("Enter key: ");
    int key=sc.nextInt();
    boolean exist=checkTuple(arr,key);
    if(exist){
      System.out.println("Exist");
    }else{
      System.out.println("Not exist");
    }
  }
  
  // <Write a short description of the method here>
  public static boolean checkTuple(int[] arr, int key) {
    int i=0;
    int j=i+1;
    int number;
    while(i<arr.length){
      number=key-arr[i];
      if(i<arr.length-1&&number==arr[j]){
        return true;
      }else if(i==arr.length-2&&number!=arr[j]){
        return false;
      }else{
        if(j<arr.length-1){
          j++;
        }else{
          i++;
          j=i+1;
        }
      }
    } 
    return false;  // stub
  }
}