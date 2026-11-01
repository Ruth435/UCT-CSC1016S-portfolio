// Ruth-ann Rudolph RDLRUT001
// Assignment 1 - accepts as input two 24-hour clock times, that calculates the period between them, and then prints the result as a quantity of minutes.
// 02/08/2023

import java.util.Scanner; //imports the scanner class
public class CalculateDuration
{
   public static void main (String [] args)
   {
      Scanner read = new Scanner(System.in); //creates scanner which will read input from the user
      System.out.println("Enter time A:");
      Time t1 = new Time(read.next()); // creates a time object to store the initial time from the user
      System.out.println("Enter time B:");
      Time t2 = new Time(read.next()); // creates a time object to store the final time from the user
      Duration d = t2.subtract(t1); // creates a duration object and calculates the difference in time
      System.out.println("The time " + t2 +" occurs " + d.intValue("minute") +" minutes after the time " + t1 +".");// prints the time in minutes between the given times
   }
}
