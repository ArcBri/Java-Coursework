/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #12: PS4_Ex12_Greetings.java
 * 
 * This program reads age, name and gender of a person,
 * prints out corresponding greeting message.
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class Greetings {
  
  public static void main(String[] args) {
    
    Scanner brian=new Scanner(System.in);
    
    System.out.print("Your age? ");
    int age=brian.nextInt();
    brian.nextLine(); //the sc int is taken until end of 20. pressing the enter is considered an input. so the next next non int/double input will take in. so without this the enter will be stored under name
    System.out.print("Your name? ");
    String name=brian.nextLine();
    System.out.print("Your gender? ");
    String sex=brian.next();
    
    if(age<18&&sex.charAt(0)=='M'){
      System.out.println("Hello boy " + name.toString());
    }else if(age<18&&sex.charAt(0)=='F'){
      System.out.println("Hey girl " + name.toString());
    }else if(age>=18&&sex.charAt(0)=='M'){
      System.out.println("Hello Mr. " +name.toString());
    }else{
      System.out.println("Hey Ms. " +name.toString() );
    }
  }
}