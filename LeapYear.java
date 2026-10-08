import java.util.Scanner;
/* LeapYear
   Author : Narjis Fatlee
   Date   : 10/1/26
   File   : LeapYear.java
   description: this program will take numeric grade 1-100 and covert it to letter grade using If and switch statement
    */

 
 public class LeapYear {
   public static void main(String[] args) {
         
      Scanner sc= new Scanner(System.in);
         
      int year;
         
      System.out.println("Please enter your year");
      
      year=sc.nextInt();
         
      System.out.println("\n");
      if(year %4 ==0) {
         if (year %100 == 0) {
          if (year %400 ==0)  {
            System.out.println(year + " is a leap year");
    
           } else {
               System.out.println(year + " is not a leap year");
        } 
   } else {
         System.out.println(year + " is a leap year");
       }
    } else {
       System.out.println(year + " is not a leap year" );
       
       }

   }
}

