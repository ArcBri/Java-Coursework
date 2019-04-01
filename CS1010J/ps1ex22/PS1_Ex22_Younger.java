/*
 * CS1010J Programming Methodology
 * Problem Set 1 Exercise #22: PS1_Ex22_Younger.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;  
class Younger {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter birthday for Tamil (day month year): ");
    int Tday = sc.nextInt();
    int Tmonth = sc.nextInt();
    int Tyear = sc.nextInt();
    System.out.print("Enter birthday for Alice (day month year): ");   
    int Aday = sc.nextInt();
    int Amonth = sc.nextInt();
    int Ayear = sc.nextInt();
    
    if ( Ayear > Tyear) {
      System.out.println("Alice is younger");
    }
    else if( Ayear < Tyear){
      System.out.println("Tamil is younger");
    }
    
    else  {
      if (Amonth>Tmonth){ 
        System.out.println("Alice is younger");
      }
      else if (Amonth<Tmonth){
        System.out.println("Tamil is younger");
      }
      else{
        if (Aday>Tday){
          System.out.println("Alice is younger");
        }
        else if (Aday<Tday){
          System.out.println("Tamil is younger");
        }
        else{
          
          
          System.out.println("Tamil and Alice are of the same age");
          
        }
      }
    }
  }
}
