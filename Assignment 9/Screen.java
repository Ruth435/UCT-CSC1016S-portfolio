/**
Ruth-ann Rudolph RLDRUT001
Screen inherits from accessory which stores serial number, colour and manufacturure of an object and provides the appropriate methods, Screen adds size
28/09/2023
*/
public class Screen extends Accessory
{
   private int size;
   
   /**Constructor for Screen, uses super accessory, takes in serial number, manufacturer, colour, and size*/
   public Screen(String serialNumber, String manufacturer, String colour, int size)
   {
      super(serialNumber, manufacturer, colour);
      this.size = size;
   }
   
   /**Copy constructor for Screen, uses super accessory*/
   public Screen(Screen s)
   {
      super(s);
      if (s == null)
      {
         System.out.println("Fatal error.");
         System.exit(0);
      }
      this.size = s.size;
   }
   
   /**checks if the Screen passed to the function is the same as the Screeen, uses super accessory*/
   public boolean Equals(Screen other)
   {
      if(other.Equals(this))
      {
         if(size == other.size)
         {
            return true;
         }
      }
      return false;
   }
   
   /**returns the variable of the Screen as a string, comma seporated, uses super Accessory*/
   public String toString()
   {
       return this.getSerialNumber() + ", " +  this.getColour() + ", " + this.getManufacturer() + ", " + size;
   }
}