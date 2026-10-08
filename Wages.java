/* Wages
   Author : Narjis Fatlee
   Date   : 9/15/26
   File   : Wages.java
   description: this program will illusrate the calcucaion of weekly wages and overtime pay 
*/

 
 public class Wages {
    public static void main(String [] args) {
    
    int hoursWorkedInWeek = 47;
    final double WAGE = 16.45;
    final int FULL_TIME = 40;
    
    int overtimeHours = hoursWorkedInWeek - FULL_TIME;
    double regularPay = FULL_TIME * WAGE;
    double overtimePay = overtimeHours * WAGE * 1.5;
    double totalPay = regularPay + overtimePay; 
    System.out.printf("Wages being sent out = $%.2f%n", totalPay);
   
   }
}