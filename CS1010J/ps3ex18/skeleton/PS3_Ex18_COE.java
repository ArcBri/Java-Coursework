/*
 * CS1010J Programming Methodology
 * Problem Set 3 Exercise #18: PS3_Ex18_COE.java
 * 
 * <Fill in a short description of this program>
 * 
 * 
 * <Arcillas Brian Joshua Pelaez>
 */

import java.util.*;

class COE {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of available COEs: ");
    int size=sc.nextInt();
    System.out.print("Enter the number of bids: ");
    int amount=sc.nextInt();
    System.out.print("Enter "+amount + " bids: ");
    int[] coe=new int[amount];
    for(int i=0; i<coe.length; i++){
      coe[i]=sc.nextInt();
    }
    sortBids(coe);
    if(coe[coe.length-size]==coe[coe.length-(size+1)]){
      coe[coe.length-(size)]=coe[coe.length-(size-1)];
    }else{
      for(int i=1; i<coe.length-size; i++){
      if(coe[coe.length-size]==coe[coe.length-size+i]){
        coe[coe.length-size]=coe[coe.length-size+i];
      }
    }
    }
    // for debugging
    //System.out.println(Arrays.toString(coe));
    
    System.out.println("COE final price this month is $"+coe[coe.length-(size)]);
  }
  
  // Sort bids in descending order
  public static void sortBids(int[] bids) {
    for(int end =bids.length-1; end>0; end--){
      for(int i=0; i<end; i++){
        if(bids[i]>bids[i+1]){
          int temp=bids[i];
          bids[i]=bids[i+1];
          bids[i+1]=temp;
        }
      }
    }
  }
}