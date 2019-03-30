/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #30: PS4_Ex30_Roster.java
 * 
 * This program reads student number and major, and prints
 * out the student roster in ascending order of student matric.
 * 
 * <Type your name here>
 */

import java.util.*;

class Roster {
  
  public static void main(String[] args) {
    
    // read student info
    Student[] roster = readRoster();
    
    // sort roster accoding to ascending order of student number
    sortRoster(roster);
    
    // print roster
    printRoster(roster); 
  }
  
  // Read student number and major of students and return an array of Student objects.
  public static Student[] readRoster() {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of students in class: ");
    int size=sc.nextInt();
    Student[] roster = new Student[size];  // stub
    System.out.println("Enter student number and major of " +size+ " students:");
    for(int i=0; i<size; i++){
      String no=sc.next();
      String maj=sc.nextLine();
      roster[i]=new Student(no, maj);
    }
    return roster;
  }
  
  // Sort roster according to ascending order of matric
  public static void sortRoster(Student[] roster) {
    /*  for(int i=1; i<roster.length; i++) {
     Student temp=new Student("a","0");
     if(roster[i-1].getStuNumber().compareTo(roster[i].getStuNumber())>0) {
     temp = roster[i-1];
     roster[i-1] = roster[i];
     roster[i] = temp;
     }
     }
     */
    int n = roster.length;  
    Student temp=new Student("a", "0");  
    for(int i=0; i < n; i++){  
      for(int j=1; j < (n-i); j++){  
        if(roster[j-1].getStuNumber().compareTo(roster[j].getStuNumber())>0){  
          //swap elements  
          temp = roster[j-1];  
          roster[j-1] = roster[j];  
          roster[j] = temp;  
        }  
        
      }  
    }  
  }
  
  // Print the roster
  public static void printRoster(Student[] roster) {
    System.out.println("Sorted list:");
    for (int i = 0; i < roster.length; i++) {
      System.out.println(roster[i]);
    }
  }
}