import java.util.Scanner;


/* FirstLast
   Author : Narjis Fatlee
   Date   : 9/22/26
   File   : FirstLast.java
   description: this program will illusrate usage of creating a new string using part of two strings
*/

 
 public class FirstLast {
   public static void main(String[] args) {
     
      // Create a scanner
   
        Scanner scanner = new Scanner(System.in);
        
         //give instructions to user to get intger
         
        System.out.print("Please input an integer value\n");
         
         int value = scanner.nextInt();
         scanner.nextLine();
      
         System.out.println(value);
         //give instructions to user for string 1 
         System.out.println("Please enter String 1");
         // Get string 1 
         String S1 = scanner.nextLine();
         System.out.print(S1);
         System.out.println();
         //give instructions to user for string 2
          System.out.println("Please enter String 2");
            // get string 2
          String S2 = scanner.nextLine();
         System.out.print(S2);  
         // get the first part of string 1
           String firstPart = S1. substring(0,value);  
         // get second part of string 2
         String secondPart = S2.substring(S2.length() - value);
         // combine them
           String result = firstPart + secondPart;
          //print 
         System.out.println("Result:" + result);
   

   }
   
  }
   