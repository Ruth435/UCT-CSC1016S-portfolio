//Ruth-ann Rudolph RDLRUT001
//15/08/2023
// Exercise 2 - assignment 4, class which will allow the user to capture details of item(s) purchased and print out an invoice for the customer.

import java.util.Scanner;
public class TestShoppingCart
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      System.out.println("How many items would you like to add to your Shopping Cart?:");
      int items = keyboard.nextInt();
      keyboard.nextLine();
      if (items == 0) //if they dont want to add any items to the cart
      {
         System.out.println("Your Shopping Cart is empty.");
      }
      else //if items are to be added to the cart
      {
         ShoppingCart cart = new ShoppingCart();
         for (int i=0; i < items; i++) //loops as many times as there are items to be added
         {
            System.out.println("Enter the Product Name:");
            String name = keyboard.nextLine();
            System.out.println("Enter the Quantity:");
            int quantity = keyboard.nextInt();
            System.out.println("Enter the Unit Cost:");
            double cost = keyboard.nextDouble();
            keyboard.nextLine();
            Item item = new Item(name, quantity, cost);//creates an item object
            cart.addItems(item);//adds item to cart
         }
         cart.getDiscount("WELCOME20");//adds a 20% discount
         System.out.println("The Shopping Cart has the following items:");
         cart.queryCart(); //prints a list of items in the cart
         System.out.println("--- Shopping Cart with all items ---");
         cart.printInvoice();//prints an invoice for the user
      }
   }
}