import java.util.Scanner;


/* Investment2
   Author : Narjis Fatlee
   Date   : 9/22/26
   File   : Investment2.java
   description: this program will calculate the final balance of investment 
*/

 
 public class Investment2 {
   public static void main(String[] args) {
 
 //Step one: creating Scanner
 
       Scanner scanner = new Scanner(System.in);
 
 // Step two:giving insturctions 
 
       System.out.println("Please input the principle amount");
 
 // Step three: catch the input 
       double principle = scanner.nextDouble();
       
       System.out.println("Please input the intrest rate");
       
       double rate = scanner.nextDouble();
       
       System.out.println("Please input the number of years of investment");
       
       double years = scanner.nextDouble();
       
       //Calculate the final balance and print it
    
       double finalBalance = principle * Math.pow((1 + rate/100), years);
       System.out.printf("Final Balance = %.2f", finalBalance);
   

   }
 
 }