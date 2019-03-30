/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #20: PS3_Ex20_MinMax.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Type your name here>
 */

import java.util.*;

class MinMax {
  
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the size of the matrix: ");
    int row=sc.nextInt();
    int col=sc.nextInt();
    int[][] mtx=new int[row][col];
    System.out.println("Enter elements row by row:");
    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        mtx[i][j]=sc.nextInt();
      }
    }
    int[] minmax=getMinMax(mtx);
    
    System.out.println("Min = "+minmax[0]);
    System.out.println("Max = "+minmax[1]);
  }
  
  // Return the minimum and maximum values in a matrix
  public static int[] getMinMax(int[][] mtx) {
    int max=0;
    int min=mtx[0][0];
    for(int i=0; i<mtx.length; i++){
      for(int j=0; j<mtx[i].length; j++){
        if(mtx[i][j]>max){
          max=mtx[i][j];
        }
        if(mtx[i][j]<min){
          min=mtx[i][j];
        }
      }
    }
    int[] arr={min, max};
    return arr;
  }
}