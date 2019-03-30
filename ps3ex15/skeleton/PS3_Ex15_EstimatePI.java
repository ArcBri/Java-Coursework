/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #15: PS3_Ex15_EstimatePI.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;
import java.text.*;

class EstimatePI {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the list: ");
    int size=sc.nextInt();
    System.out.print("Enter " +size+ " elements: ");
    int[] wtf=new int[size];
    for(int i=0; i<wtf.length; i++){
      wtf[i]=sc.nextInt();
    }
    double ratio= estimatePI(wtf);
    double ratio2=ratio/6;
    double ratio3=1/ratio2;
    double pi=Math.sqrt(ratio3);
    
    DecimalFormat df=new DecimalFormat("0.0000");
    System.out.println("Estimated pi = " +df.format(pi) );
  }
  
  public static double estimatePI(int[] list){
    int count=0;
    int count1=0;
    for(int i=0; i<list.length; i++){
      for(int j=i+1; j<list.length; j++){
        int factor=findHCF(list[i],list[j]);
        count1++;
        if(factor==1){
          count++;
        }
      }
      if(count1/count<0.0001){
        return (double) count/count1;
      }
    }
    return (double) count/count1;     
  }
  public static int findHCF(int x, int y){
    int hcf=1;
    int min=Math.min(x,y);
    if(min%2==0){
      min=min+1;
    }
    if(x%2==0&&y%2==0){
      return 2;
    }else{
      for(int i=min; i>1; i=i-2){
        if(x%i==0&&y%i==0){
          hcf=i;
        }
      }
      return hcf;
    }
  }
}