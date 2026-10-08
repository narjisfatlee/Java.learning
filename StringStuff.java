import java.util.Scanner;
import java.util.Random;


/* StringStuff
   Author : Narjis Fatlee
   Date   : 9/27/26
   File   : StringStuff.java
   description: this program uses String methods to break down a phrase.
*/

 
 public class StringStuff {
  public static void main (String [] args) {
 
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    
    
    System.out.println("Welcome to my string manipulator program");
    // Get the phrase from the user

    System.out.print("Please enter a string that may have multiple words: ");
     
    String phrase = input.nextLine();
       
     // Use String methods to find each result

    int length = phrase.length();
    String middle = phrase.substring (1, length - 1);
    String firstAndLast = phrase.substring(0,1) + phrase.substring(length -1); 
    
    // Pick a random index and get the letter at that spot

    int randomIndex = rand.nextInt(length);
    char randomLetter = phrase.charAt(randomIndex);
    int spaceIndex = phrase.indexOf (" ");
    
    // Print 
    System.out.println("Results:");
    System.out.println("length of string = " + length);
    System.out.println("substring = " + middle);
    System.out.println("first and last = " + firstAndLast);
    System.out.println("random letter (picked index " + randomIndex + ") = " + randomLetter);
    System.out.println("index of first space = " + spaceIndex);
    System.out.println("Thanks for using my program!");
    
 
  }
 }