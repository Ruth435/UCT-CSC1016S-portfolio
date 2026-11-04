/**
Ruth-ann Rudolph RLDRUT001
Accessory stores serial number, colour and manufacturure of an object and provides the appropriate methods
28/09/2023
*/
public class Accessory
{
   private String manufacturer, colour, serialNumber;
   
   /**Constructor for accessory, takes in serial number, manufacturer, and colour*/
   public Accessory(String serialNumber, String manufacturer, String colour)
   {
      this.serialNumber = serialNumber;
      this.manufacturer = manufacturer;
      this.colour = colour;
   }
   
   /**Copy constructor for Accessory*/
   public Accessory(Accessory a)
   {
      if (a == null)
      {
         System.out.println("Fatal error.");
         System.exit(0);
      }
      this.serialNumber = a.serialNumber;
      this.manufacturer = a.manufacturer;
      this.colour = a.colour;
   }
   
   /**method to return the serial number as a string*/
   public String getSerialNumber()
   {
      return serialNumber;
   }
   
   /**method to return the manufacturer as a string*/
   public String getManufacturer()
   {
      return manufacturer;
   }
   
   /**method to return the colour as a string*/
   public String getColour()
   {
      return colour;
   }
   
   /**checks if the accessory passed to the function is the same as the accessory*/
   public boolean Equals(Accessory other)
   {
      if(serialNumber.equals(other.serialNumber))
      {
         if(manufacturer.equals(other.manufacturer))
         {
            if(colour.equals(other.colour))
            {
               return true;
            }
         }
      }
      return false;
   }
   
   /**returns the variable of the accessory as a string, comma seporated*/
   public String toString()
   {
       return serialNumber + ", " + manufacturer + ", " +  colour;
   }
}