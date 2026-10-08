/* Investment
   Author : Narjis Fatlee
   Date   : 9/15/26
   File   : Investment.java
   description: this program will illusrate the calcucaion of investment compounded annually and final balance
      */

 
 public class Investment {
    public static void main(String [] args) {
    
    final double RATE = 3;
    int years = 10;
    double principle = 500;
    
    double finalBalance = principle * Math.pow(1 + RATE/100, years);
    System.out.printf("Final balance = $%.2f%n" , finalBalance);
       
   }
  }