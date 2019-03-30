/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #14: PS4_Ex14_DateConvert.java
 * 
 * This program reads a string in the UK date format
 * and outputs the equivalent American format.
 * 
 * <Type your name here>
 */

import java.util.*;

class DateConvert {
  
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.print("Enter date in UK format: ");
    String date =sc.nextLine();
    System.out.println("Date in American format: "+convert(date) );
  }
  public static String convert(String date){
    String[] dates=date.split(" ");
    int idxof=dates[1].indexOf(',');
    String day=dates[1].substring(0,idxof);
    day=day.concat(" ");
    String month=dates[0].concat(" ");
    return day.concat(month.concat(dates[2]));
  }
}