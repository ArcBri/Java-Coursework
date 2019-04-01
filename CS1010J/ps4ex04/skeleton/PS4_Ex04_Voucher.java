/*
 * CS1010J Programming Methodology
 * Problem Set 4 Exercise #04: PS4_Ex04_Voucher.java
 * 
 * A voucher has three attributes: name (word),
 * face value (int) and amount of vouchers (int)
 * 
 * <Type your name here>
 */

class Voucher {
  
  // Attributes
  private
    
    String name;
  int value;
  int amount;
  int total;
  
  // Constructor
  public Voucher(String voucherName, int voucherValue, int voucherAmt) {
    name=voucherName;
    value=voucherValue;
    amount=voucherAmt;
    
  }
  
  // Return name of a voucher
  public String getName() {
    return name;  // stub
  }
  
  // Return face value of a voucher
  public int getValue() {
    total=amount*value;
    return total;  // stub
  }
  
  // Return the number of vouchers
  public int getAmt(int price) {
      int i=0;
      while(i<=amount){
        price=price-value;
        i++;
        if(price<value){
          return i;
        }
      }
      return i;
    }// stub
  
  
  // Compute the number of vouchers to use given a price
  // such that there is no overpay
  public int useVoucher(int price) {
    int used=getAmt(price);
    if(used!=amount){
      int cash=price-(used*value);
      return cash;
    }else{
      return 0;
    }
// stub
  }
}