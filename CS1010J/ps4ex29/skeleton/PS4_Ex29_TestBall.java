/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #29: PS4_Ex29_TestBall.java
 * 
 * This program:
 * i.  Create an array of three balls with given colour and radius.
 * ii. Check whether any two balls have the same color and radius.
 * iv. Print out the radius of the biggest ball.
 * 
 * <Type your name here>
 */

import java.util.*;

class TestBall {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    Ball[] balls = new Ball[3];  // 3 balls
    
    for (int i = 0; i < 3; i++) {
      System.out.print("Enter colour and radius of ball " + (i+1) + ": ");
      balls[i]=new Ball(sc.next(), sc.nextDouble());

    }
    
    if(balls[0].equals(balls[1])&&balls[0].equals(balls[2])){
    System.out.println("Three balls are all the same");
    }else if(balls[0].equals(balls[1])){
    System.out.println("1st and 2nd balls are the same");
    }else if(balls[1].equals(balls[2])){
    System.out.println("2nd and 3rd balls are the same");
    }else if(balls[0].equals(balls[2])){
    System.out.println("1st and 3rd balls are the same");
    }else{
    System.out.println("Three balls are all different");
    }
    double max=0;
    for(int i=1;i<3;i++){
      if(i==1){
      max=Math.max(balls[i].getRadius(), balls[i-1].getRadius());
      }else{
        max=Math.max(balls[i].getRadius(),max);
      }
    }
    System.out.println("The largest radius is: "+max);
  }
}