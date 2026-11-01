// Ruth-ann Rudolph RDLRUT001
// Assignment 3 - creates a Seller object of instance variables to be used in the Test Seller class and MarketPlace class
// 07/08/2023

import java.util.Scanner; //imports the scanner class
public class Seller
{
      Currency rand = new Currency("R", "ZAR", 100); //creates a currency object for rands
      public String id;
      public String name;
      public String location;
      public String product;
      public Money unit_price;
      public int number_of_units;
}

