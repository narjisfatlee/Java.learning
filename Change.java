import java.util.Scanner;

/* Change
   Author : Narjis Fatlee
   Date   : 9/27/26
   File   : Change.java
   description: this program will ask user for cost and tendered and calculates the exact change for a purchase.
*/

 
 public class Change {
  public static void main (String [] args) {

      // Create a scanner
         
      Scanner scanner = new Scanner(System.in);
              
      // Get the cost and the amount tendered from the user
      
      System.out.println("Welcome to my Change maker.");
      
      System.out.print("Please enter cost of product: $ ");
               
      double cost = scanner.nextDouble();
            
      System.out.print("Please enter amount tendered: $ ");
      double tendered = scanner.nextDouble();
      
      // Convert the change to whole cents 
      int changeCents = (int) Math.round((tendered - cost) * 100);      
      int remaining = changeCents;
            
      //Break the change into dollars, quarters, dimes, nickels and pennies
       int dollars = remaining/100;
       remaining = remaining %100;
            
      int quarters = remaining/25;
      remaining = remaining % 25;
            
      int dimes = remaining/10;
              remaining = remaining % 10;
            
      int nickels = remaining/5;
      remaining = remaining %5;
            
      int pennies = remaining;
      System.out.println();
             
      
      // print result
      System.out.printf("Your change is: $ %.2f%n", changeCents/100.0);
      System.out.println(dollars + " one-dollar bills");
      System.out.println(quarters + " quarters");
      System.out.println(dimes + " dimes");
      System.out.println(nickels + " nickels");
      System.out.println(pennies + " pennies");
      System.out.println();
      System.out.println("Thank you for your business!");
   



   }
     
 }