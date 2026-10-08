import java.util.Scanner;
/* Grade
   Author : Narjis Fatlee
   Date   : 9/22/26
   File   : Grade.java
   description: this program will take numeric grade 1-100 and covert it to letter grade using If and switch statement
    */

 
 public class Grade {
   public static void main(String[] args) {
   
      Scanner sc= new Scanner(System.in);
      int grade;
         
      System.out.println("Please enter your grade");
      
      grade=sc.nextInt();
         
         
      if(grade >=90) {
      System.out.println("A");
      } else if (grade >= 80) {
      System.out.print("B");
      } else if (grade >= 70) {
      System.out.print("C");
      } else if (grade >=60) {
      System.out.print("D");
      } else {
      System.out.println("You failed");
      }
    
      System.out.println("\n");
       
 
      System.out.println ("Please enter your grade");
      grade=sc.nextInt();
          
      switch(grade/10) {
        case 10:
        case 9:
             System.out.println("A");
        break;
        case 8:
             System.out.println("B");
        break;
         case 7:
             System.out.println("C");
        break;
        case 6:
            System.out.println("D");
        break;
      default:
            System.out.println("You failed");
         break;
     }
 
 
   }
   
}