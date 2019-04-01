/**
 * name      :
 * matric no.:
 */

import java.util.*;

class Grid {
  
  private int[][] grid;// declare the member field
  
  public void makeGrid(int num){
    int[][] land=new [num][num];
    grid=land;
  }
  public void makeTree(int num, int xcoord, int ycoord){
    for(int i=0; int<num; i++){
      grid[xcoord][ycoord]=1;
    }
  }// declare the constructor
  
  /**
   *    checkNoTree   : to check whether the (size x size) square with upper-left coordinate 
   *                     (x, y) contains a tree
   *    Pre-condition :all trees havent been found
   *    Post-condition:
   */
  public boolean checkNoTree(int x, int y, int size) {
    // implementation
    if(grid[x][y]==1){
      return false;
    }else{
      return true;
    }
  }
  
  
  
  /**
   *    checkValidSize: to check whether it is possible to find a (size x size) square that contains 
   *                     no tree
   *    Pre-condition :current square has no tree
   *    Post-condition:
   */
  public boolean checkValidSize(int length, int width) {
    if(length!=width){
      return false;
    }else{
      return true;
    }
  }
  
  
  
  /** 
   *    solve         : use this method to find the largest size of a square with no trees
   *    Pre-condition :current square has no tree
   *    Post-condition:
   */
  public int solve(int x, int y) {
    if(grid[x][y]==0){
      return 0;
    }else{
      int length=findLength(x, y);
      int width=findWidth(x, y);
      if(checkValidSize(length, width)){
        return length;
      }else{
        return 0;
      }
    }
  }
  public int findLength(int x, int y){
    int l=0;
    while(grid[x][y]!=0||x<grid.length){
      if(grid[x][y]==0){
        l++;
      }
      x++;
    }
  }
  public int findLength(int x, int y){
    int l=0;
    while(grid[x][y]!=0||y<grid.length){
      if(grid[x][y]==0){
        l++;
      }
      x++;
    }
  }
}
class Land {
  
  public static void main(String[] args) {
    
    // declare the necessary variables
    
    // create new object from class Result
    
    // declare a Scanner object to read input
    
    // read input and process them accordingly
  }
}
