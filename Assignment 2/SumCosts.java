// Ruth-ann Rudolph RDLRUT001
// Assignment 1 - 
// 02/08/2023

import java.util.Scanner; //imports the scanner class
public class SumCosts
{
   public static void main (String [] args)
   {
      Currency rand = new Currency("R", "ZAR", 100); //creates a currency object for rands
      Scanner read = new Scanner(System.in); //creates a scanner to get input from the user
      String enter;
      System.out.println("Enter an amount or '[D]one' to print the sum and quit:");
      enter = read.nextLine(); //reads the input from the user
      Money sum = new Money("R0.00", rand); // creates a sum variable to hold the total of the amounts entered by the user
      while (!(enter.equalsIgnoreCase("D")  || enter.equalsIgnoreCase("Done"))) //loops until the user ends the process
      {
         Money money = new Money(enter, rand); //creates a money object to hold the money amount entered by the user
         System.out.println("Enter an amount or '[D]one' to print the sum and quit:");
         enter = read.nextLine(); //reads the input from the user
         sum = sum.add(money); //adds the amount entered by the user to the total
      }
      System.out.println("Total: " + sum); //prints the total sum of the amounts entered by the user

   }
}
