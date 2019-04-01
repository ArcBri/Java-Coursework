/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #08: OperateLifts.java
 * 
 * This program receives instructions on two
 * lifts and move them from one level to another.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class OperateLifts {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    Lift num1 = new Lift();
    Lift num2 = new Lift();
    
    System.out.print("How many instructions? ");
    int inst=sc.nextInt();
    
    System.out.println("Enter " +inst+  " instructions:");
    for(int i=1; i<=inst; i++){
      int lift=sc.nextInt();
      int from=sc.nextInt();
      int to=sc.nextInt();
      if(lift==1){
        num1.move(from, to);
      }else if(lift==2){
        num2.move(from,to);
      }
    }
      
    
    System.out.println("lift 1 took "+num1.getTime() + " seconds and ended at level "+num1.getLevel());
    System.out.println("lift 2 took "+num2.getTime() + " seconds and ended at level "+num2.getLevel());
  }
}