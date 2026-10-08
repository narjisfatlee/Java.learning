/* Circle
   Author : Narjis Fatlee
   Date   : 9/15/26
   File   : Circle.java
   description: this program will illusrate the calcucaion of area and circumference of circle given its radius
   */

 
 public class Circle {
    public static void main(String [] args) {
    
      double radius = 10;
      double area = Math.PI * Math.pow(radius,2);
      double circumference = 2 * Math.PI * radius;
      System.out.printf("The area of a circle with the radius of %.1f is equal to: %.4f%n", radius, area);
      System.out.printf("The circumference of a circle with the radius of %.1f is equal to: %.4f%n", radius, circumference);
    
   }
}