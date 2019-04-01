/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #06: PS3_Ex06_PositiveFirst.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class PositiveFirst {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int size=sc.nextInt();
    System.out.print("Enter " + size+ " elements: ");
    int[] number=new int[size];
    for(int i =0; i<size; i++){
      number[i]=sc.nextInt();
    }
    boolean positivefirst=isPositiveFirst(number);
    
    if(positivefirst==true){
      System.out.println("Positive numbers appear before non-positive numbers");
    }else{
      System.out.println("Some positive numbers appear after non-positive numbers");
    }
  }
  
  // <Write a short description of the method here>
  public static boolean isPositiveFirst(int[] numbers) {
    int i=1;
    while(i<numbers.length){
      if(numbers[i-1]<1&&numbers[i]>0){
        return false;
      }else{
        i++;
      }
    }
    return true;
  }
}