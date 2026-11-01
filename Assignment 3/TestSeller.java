// Ruth-ann Rudolph RDLRUT001
// Assignment 3 - asks the user to input seller details (as specified in the table), creates a Seller object, and inserts the details in the appropriate fields, then retrieves and prints out those details
// 07/08/2023

import java.util.Scanner; //imports the scanner class
public class TestSeller
{
   public static void main (String [] args)
   {
      Seller seller = new Seller();
      Currency rand = new Currency("R", "ZAR", 100); //creates a currency object for rands
      Scanner read = new Scanner(System.in); //creates a scanner to get input from the user
      System.out.println("Please enter the details of the seller.");
      System.out.print("ID: ");
      seller.id = read.nextLine(); //reads the ID from the user and saves it in the seller class variable
      System.out.print("Name: ");
      seller.name = read.nextLine(); //reads the name from the user and saves it in the seller class variable
      System.out.print("Location: ");
      seller.location = read.nextLine(); //reads the location from the user and saves it in the seller class variable
      System.out.print("Product: ");
      seller.product = read.nextLine(); //reads the product from the user and saves it in the seller class variable
      System.out.print("Price: ");
      String inPrice = read.nextLine(); //reads the price from the user
      seller.unit_price = new Money(inPrice, rand); //creates a money object to hold the money amount entered by the user and saves it in the seller class variable
      System.out.print("Units: ");
      seller.number_of_units = read.nextInt(); //reads the number of units from the user and saves it in the seller class variable
      System.out.println("The seller has been successfully created:");
      System.out.println("ID of the seller: "+ seller.id); //gets the value of ID from the seller class and prints out the statement
      System.out.println("Name of the seller: "+ seller.name); //gets the value of name from the seller class and prints out the statement
      System.out.println("Location of the seller: "+ seller.location); //gets the value of location from the seller class and prints out the statement
      System.out.println("The product to sell: "+ seller.product); //gets the value of product from the seller class and prints out the statement
      System.out.println("Product unit price: "+ seller.unit_price); //gets the value of price from the seller class and prints out the statement
      System.out.println("The number of available units: "+ seller.number_of_units); //gets the value of units from the seller class and prints out the statement
   }
}

