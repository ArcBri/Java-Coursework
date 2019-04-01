/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #31: PS4_Ex31_Transform.java
 * 
 * This program creates a Matrix object, reflects it across the x- or y- axis,
 * or rotates it by d degree clockwise where d can be 90, 180, or 270.
 * 
 * <Type your name here>
 */

import java.util.*;

class Transform {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the size of the square matrix: ");
    int size=sc.nextInt();
    int[][] mtx=new int[size][size];
    System.out.println("Enter elements row by row:");
    for(int i=0; i<size; i++){
      for(int j=0; j<size; j++){
        mtx[i][j]=sc.nextInt();
      }
    }
    Matrix a= new Matrix(mtx);
    System.out.print("Enter the number of commands: ");
    int amt=sc.nextInt();
    do{
      System.out.print("Enter command: ");
      String cmd=sc.nextLine();
      System.out.print(cmd.charAt(1));
      sc.next();
      String[] word=cmd.split(" ");
      if(cmd.equals("Reflect x")){
        a.reflectX();
      }else if(cmd.equals("Reflect y")){
        a.reflectY();
      }else if(word[0].equals("90")){
        a.rotate(1);
      }else if(word[0].equals("180")){
        a.rotate(2);
      }else if(word[0].equals("270")){
        a.rotate(3);
      }
      amt--;
    }
    while(amt>0);
    
    System.out.println(a.toString());
    
  }
}