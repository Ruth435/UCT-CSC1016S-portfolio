/**
Ruth-ann Rudolph RLDRUT001
Box inherits from accessory which stores serial number, colour and manufacturure of an object and provides the appropriate methods, box adds memory
28/09/2023
*/
public class Box extends Accessory
{
   private int memory;
   
   /**Constructor for box, uses super accessory, takes in serial number, manufacturer, colour, and memory*/
   public Box(String serialNumber, String manufacturer, String colour, int memory)
   {
      super(serialNumber, manufacturer, colour);
      this.memory = memory;
   }
   
   /**Copy constructor for box, uses super accessory*/
   public Box(Box b)
   {
      super(b);
      if (b == null)
      {
         System.out.println("Fatal error.");
         System.exit(0);
      }
      this.memory = b.memory;
   }
   
   /**checks if the Box passed to the function is the same as the Box, uses super accessory*/
   public boolean Equals(Box other)
   {
      if(other.Equals(this))
      {
         if(memory == other.memory)
         {
            return true;
         }
      }
      return false;
   }
   
   /**returns the variable of the Box as a string, comma seporated, uses super Accessory*/
   public String toString()
   {
       return super.toString() + ", " + memory;
   }
}