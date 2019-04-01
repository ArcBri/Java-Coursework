/*
 * Name  :Arcillas Brian Joshua Pelaez
 * Matric No.  :A0167854N
 * Plab Account :
 */

import java.util.*;

public class Sudoku {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int size=num*num;
    int[][] sudoku= new int[size][size];
    for(int i=0; i<sudoku.length; i++){
      for(int j=0; j<sudoku.length; j++){
        sudoku[i][j]=sc.nextInt();
      }
    }
    
    boolean validRow= checkRows(sudoku);
    
    boolean validCol=checkCol(sudoku);
    
    boolean validBox=checkBox(sudoku, num);
    
    if(validBox!=true||validRow!=true||validCol!=true){
      System.out.println("INVALID");
    }else{
      System.out.println("VALID");
    }
    
  }
  
  public static boolean checkBox(int[][]arr,int num){
    int sum = ((arr.length)*(arr.length+1))/2;
    int row=0;
    while(row<arr.length){
      int col=0;
      while(col<arr.length){
        int squareSum=0;
        for(int i=row; i <row+num;i++){
          for(int j=col; j <col+num; j++){
            squareSum += arr[i][j];
          }
        }
        if(sum!=squareSum){
          return false;
        }
        col+=num;
      }
      row+=num;
    }
    return true;   
  }
  public static boolean checkRows(int[][] arr){
    int row=0;
    int size=arr.length;
    while(row<size){
      for(int col=0; col<size-1; col++){
        for(int col2=col+1; col2<size; col2++){
          if(arr[row][col]==arr[row][col2]){
            return false;
          }
        }
      }
      row++;
    }
    return true;
  }
  public static boolean checkCol(int[][] arr){
    int col=0;
    int size=arr.length;
    while(col<size){
      for(int row=0; row<size-1; row++){
        for(int row2=row+1; row2<size; row2++){
          if(arr[row][col]==arr[row+1][col]){
            return false;
          }
        }
      }
      col++;
    }
    return true;
  }
}
