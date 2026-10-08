import java.util.Scanner;
/* Wage2
   Author : Narjis Fatlee
   Date   : 10/1/26
   File   : Wage2.java
   description: this program asks user for hours worked, hourly wage, and full-time hours, then calculates weekly pay using if statements.              
    */

 
 public class Wage2 {
   public static void main(String[] args) {
   
   // create a scanner
   
      Scanner sc= new Scanner(System.in);
      
     // ask user and store three inputs 
      System.out.println("Please enter the number of hours you worked");
            
      double hoursWorked = sc.nextDouble();
         
      System.out.println("Please enter your hourly wage:");
      double wage = sc.nextDouble();
         
      System.out.println("Please enter the number of hours for full time");
      double fullTime = sc.nextDouble();
          
      double totalPay;
          
      if (hoursWorked <0) {
      System.out.println("Invalid calculation");
           //negative number isn't possible 
      } else if (hoursWorked ==0) {
      //if no hours worked it means no pay
      totalPay = 0;
      System.out.printf("Wages being sent out = $%.2f%n", totalPay);
      } else if (hoursWorked<=fullTime)  {
      //1-full time hours calculate in regular pay
      totalPay = hoursWorked * wage;
      System.out.printf("Wages being sent out = $%.2f%n", totalPay);
       } else {
       //if more than full time, its ovetime 
      double overtimeHours = hoursWorked - fullTime;
      //regular pay+ overtime pay
      totalPay = (fullTime * wage) + (overtimeHours * wage * 1.5);
      System.out.printf("Wages being sent out = $%.2f%n", totalPay);
       
       }
   
    }
}
   
