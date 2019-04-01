/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #30: PS4_Ex30_Student.java
 * 
 * The Student class has two attributes: student number and major, both are strings.
 * 
 * <Type your name here>
 */

class Student {
  
  // Note: both student number and major should have no leading or trailing blanks
  private String stuNumber, major;
  
  // Constructor
  public Student(String number, String major) {
    stuNumber=number;
    this.major=major;
  }
  
  // Return student number
  public String getStuNumber() {
    return stuNumber;  // stub
  }
  
  // Return "[student number, major]"
  public String toString() {
    return "["+stuNumber+", "+major.trim()+"]";  // stub
  }
}