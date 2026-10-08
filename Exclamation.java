import java.util.Scanner;
/* Exclamation
   Author : Narjis Fatlee
   Date   : 9/15/26
   File   : Exclamation.java
   description: this program will illusrate the split of a sentance at a exclamation point 
*/

public class Exclamation {
   public static void main(String[] args) {


      // Create a scanner
      Scanner scanner= new Scanner(System.in); 
      
      //give instructions to user
      System.out.println("Please input a sentance that contains an (!)");
      
      String sentance = scanner.nextLine();
      
      int length = sentance.length(); //find how many characters
      int indexofExclamation = sentance.indexOf("!");  //break the sentance at Exclamation point
      String substring1 = sentance.substring(0, indexofExclamation);
      String substring2 = sentance.substring(indexofExclamation+1 , length);
 
 // print      
   System.out.println(substring1);
   System.out.println(substring2);





   }
 }