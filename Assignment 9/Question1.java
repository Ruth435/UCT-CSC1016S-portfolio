/**
Ruth-ann Rudolph RLDRUT001
input output that allows a user to add an object (box, screen accessory) to a list, delete an object from the list, print out the list or to exit the input output system
28/09/2023
*/
import java.util.Scanner;
public class Question1
{
   public static void main (String [] args)
   {
      Scanner input = new Scanner(System.in);
      Accessory[] list = new Accessory[100];
      int count = 0;
      String in = "";
      System.out.println("Welcome to Great International Technology");
      //loops untill the user opts to exit the program
      do
      {
         System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
         in = input.next();
         //if the user selects to add a box object to the array
         if (in.equalsIgnoreCase("b") || in.equalsIgnoreCase("box"))
         {
            System.out.println("Enter the serial number");
            String sn = input.next();
            System.out.println("Enter the manufacturer");
            input.nextLine();
            String man = input.nextLine();
            System.out.println("Enter the colour");
            String col = input.nextLine();
            System.out.println("Enter the amount of memory (MB)");
            int mem = input.nextInt();
            Box b = new Box(sn,man,col,mem); //creates a box object
            list[count] = b;//adds the box object to the array
            count++;
            System.out.println("Done");
         }
         //if the user selects to add a screen object to the array
         else if (in.equalsIgnoreCase("s") || in.equalsIgnoreCase("Screen"))
         {
            System.out.println("Enter the serial number");
            String sn = input.next();
            System.out.println("Enter the manufacturer");
            input.nextLine();
            String man = input.nextLine();
            System.out.println("Enter the colour");
            String col = input.next();
            System.out.println("Enter the screen size in inches");
            int size = input.nextInt();
            Screen s = new Screen(sn,man,col,size);//creates a screen object
            list[count] = s;//adds the screen object to the array
            count++;
            System.out.println("Done");
         }
         //if the user selects to add an accessory object to the array
         else if(in.equalsIgnoreCase("a") || in.equalsIgnoreCase("accessories"))
         {
            System.out.println("Enter the serial number");
            String sn = input.next();
            System.out.println("Enter the manufacturer");
            input.nextLine();
            String man = input.nextLine();
            System.out.println("Enter the colour");
            String col = input.nextLine();
            Accessory a = new Accessory(sn,man,col);//creates an accessory object
            list[count] = a; //adds the accessory to the array
            count++;
            System.out.println("Done");
         }
         //if the user selects to delete an object from the array
         else if(in.equalsIgnoreCase("d") || in.equalsIgnoreCase("delete"))
         {
            System.out.println("Enter the serial number");
            String del = input.next();
            boolean found = false;
            for (int i = 0; i < count; i++) //loops through all objects in the array
            {
               if(found && !(list[i+1].equals(null)))//checks if the object has been found and the object in the array exists
               {
                  list[i] = list[i+1];//moves the object forward by one
               }
               if(list[i].getSerialNumber().equals(del))//if the serial number in the object is the one being searched for
               {
                  list[i] = list[i+1];//removes the item from the array 
                  found = true; //notes that the object has been found
                  count--;//removes one from count
               }
            }
            if(found)//the object was found and removed
            {
               System.out.println("Done");
            }
            else//the object was not found and thus not removed
            {
               System.out.println("Not found");
            }
         }
         //if the user selects to list the array
         else if(in.equalsIgnoreCase("l") || in.equalsIgnoreCase("list"))
         {
            for (int i = 0; i < count; i++)
            {
               if(list[i] instanceof Box)//if the object is a box
               {
                  System.out.println("Box: " + list[i]);
               }
               else if(list[i] instanceof Screen)//if the object is a screen
               {
                  System.out.println("Screen: " + list[i]);
               }
               else if(list[i] instanceof Accessory)//if the object is an accessory
               {
                  System.out.println("Accessories: " + list[i]);
               }
            }
            System.out.println("Done");
         }
         //if the user selects to quit the program
         else if(in.equalsIgnoreCase("q") || in.equalsIgnoreCase("quit"))
         {
         
         }
         else //if no valid option was selected
         {
            System.out.println("Invalid input");
         }
      }
      while(!(in.equalsIgnoreCase("q") || in.equalsIgnoreCase("quit")));
   }
}