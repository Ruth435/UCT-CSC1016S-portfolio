import java.io.File;
import java.io.FileNotFoundException;
//
import java.util.Scanner;
/**
 * See Assignment II Question II
 *
 * @author Stephan Jamieson
 * @version 26/7/2019
 */
public class MarketPlace {
    
    private MarketPlace() {}
    
    private final static Currency RAND = new Currency("R", "ZAR", 100);
    
    
    // Create an instance of Seller with attributes ID, name, location, product, 
    // unit_price and number_of_units
    private static Seller makeSeller(final String data) {
        final Scanner scanner = new Scanner(data.trim());
        scanner.useDelimiter("\\s*,\\s*");
        
        Seller seller = new Seller();
        seller.id = scanner.next(); //reads the ID from the file and saves it in the seller class variable
        seller.name = scanner.next(); //reads the name from the file and saves it in the seller class variable
        seller.location = scanner.next(); //reads the location from the file and saves it in the seller class variable
        seller.product = scanner.next(); //reads the product from the file and saves it in the seller class variable
        String inPrice = scanner.next(); //reads the price from the file
        seller.unit_price = new Money(inPrice, RAND); //creates a money object to hold the money amount entered by the file and saves it in the seller class variable
        seller.number_of_units = scanner.nextInt(); //reads the number of units from the file and saves it in the seller class variable

        return seller;
    }
    
    // Read the contents of CSV file into an array.
    // See the Appendix on page 4 of the Assignment sheet.
    private static Seller[] parseFile(final String fileName) throws FileNotFoundException {
        final Scanner inFile = new Scanner(new File(fileName));
        Seller[] sellers = null;
    
        if (inFile.hasNextLine()) {
            sellers = new Seller[Integer.parseInt(inFile.nextLine().trim())];
            for (int index=0; index<sellers.length; index++) {
                sellers[index] = makeSeller(inFile.nextLine());
            }
        }
        
        inFile.close();
        return sellers;
    }
    
    public static void main(final String[] args) throws FileNotFoundException {
      try{
           final Scanner inKey = new Scanner(System.in);
           System.out.println("Enter the name of a \"Comma Separated Values\" (CSV) file:");
           final Seller[] sellers = parseFile(inKey.nextLine());
           if (sellers != null) //checks if the array is null, as it was not created
           {
            if (sellers.length > 0) //checks if the array is empty
            {
                 System.out.println("Enter the name of a product:");
                 String searchProduct = inKey.nextLine(); //gets a product name from the user
                 System.out.println("Enter the number of units required:");
                 int searchUnits = inKey.nextInt(); //gets the number of units required from the user
                 inKey.nextLine(); //skips over the new line character
                 System.out.println("Enter the maximum unit price:");
                 Money searchPrice = new Money(inKey.nextLine(),RAND);//gets a maximum price limit from the user
         
                 int count = 0;// creates a counter variable
                 boolean found = false;
                 while (count < sellers.length && count < 100) // loops until the counter reaches 100 or the end of the array is reached
                 {
                     String checkProduct = sellers[count].product;
                     if (checkProduct.equalsIgnoreCase(searchProduct)) // checks if product names match
                     {
                        if (searchUnits <= sellers[count].number_of_units) //checks if the place has enough units available
                        {
                           Money checkPrice = sellers[count].unit_price;
                           int compare = searchPrice.compareTo(checkPrice); //compares the prices entered
                           if (compare >= 0) //checks if the price is in the correct range (below the useres entered value)
                           
                           {
                              found = true;// identifies that a result was found
                              System.out.println(sellers[count].id + " : " + sellers[count].name + " in " + sellers[count].location + " has " 
                              + sellers[count].number_of_units + " " + sellers[count].product + " for " + sellers[count].unit_price + " each.");
                              //prints out the matching result
                           }
                        }
                     }
                     count++;//increments counter
                 }
                 
                 if (found == false)// if no matching results were found
                 {
                  System.out.println("None found.");
                 }
            }
              else // if the array is empty
              {
               System.out.println("The file contains no seller data.");
              }
           }
           else // if the file is empty/ array is null
           {
            System.out.println("The file contains no seller data.");
           }
           
        }
        catch (FileNotFoundException e) //if the file is not found
        {
         System.out.println("The file contains no seller data.");
        }
    }
}
