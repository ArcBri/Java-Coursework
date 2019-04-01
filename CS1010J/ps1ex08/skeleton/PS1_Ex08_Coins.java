/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #08: PS1_Ex08_Coins.java
 * 
 * <Programme to obtain minimum number of coins needed by finding maximum number of coins per amount given in descending value>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;


class Coins {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter amount in cents: ");
    int total = sc.nextInt();
    
    int dollar = total/100;
    int remainder = total%100;
    int fiftysen = remainder/50;
    int remainder1 = remainder%50;
    int twentysen = remainder1/20;
    int remainder2 = remainder1%20;
    int tensen = remainder2/10;
    int remainder3 = remainder2%10;
    int fivesen = remainder3/5;
    int onesen = remainder3%5;
    
    int coins = dollar+fiftysen+twentysen+tensen+fivesen+onesen;
    
    System.out.println("Minimum number of coins needed: " + coins);
  }
}