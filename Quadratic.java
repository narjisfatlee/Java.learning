import java.util.Scanner;

/* Quadratic
   Author : Narjis Fatlee
   Date   : 9/27/26
   File   : Quadratic.java
   description: This program finds the two solutions of a quadratic equation.
   */

 
 public class Quadratic {
  public static void main (String [] args) {
 
    double coefficientA;
    double coefficientB;
    double coefficientC;
 

    Scanner scanner = new Scanner(System.in);
      
      
    System.out.println("Welcome to my Quadratic solver.");
   
    // Get the three coefficients from the user
   
    
    System.out.println("Please input the value of A");
    
    
    coefficientA = scanner.nextDouble();
    
    System.out.println(coefficientA);
    
    System.out.println("Please input the value of B");
    
    
    coefficientB = scanner.nextDouble();
    
    System.out.println(coefficientB);
   
   
    System.out.println("Please input the value of C");
    
    
    coefficientC = scanner.nextDouble();
    
    System.out.println(coefficientC);
      
    
    System.out.printf("You have entered the Equation %.2fx^2 + %.2fx + %.2f = 0%n" , coefficientA, coefficientB, coefficientC);
     // Use the quadratic formula to find the two solutions

    double solution1 = (-coefficientB + Math.sqrt(Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC))/(2 * coefficientA);
    double solution2 = (-coefficientB - Math.sqrt(Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC))/(2 * coefficientA);
   
   
    // Print
    System.out.println("The solutions are:");
    System.out.printf("x = %.2f%n", solution2);
    System.out.printf("x = %.2f%n", solution1);
    
   System.out.println("Thank you for using my program!");
   
   }
 }