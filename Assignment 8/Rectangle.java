/** Ruth-ann Rudolph RDLRUT001
09/19/2023
inherits from shape class, adds length and width properties to name and colour. */

public class Rectangle extends Shape
{
   private double length, width;
   
   /** constructor for rectangle object with variables name and colour from the shape class, adding length and width */
   public Rectangle(String name, String colour, double length, double width)
   {
      super(name, colour);
      this.length = length;
      this.width = width;
   }
   
   /**copy constructor for rectangle objects, uses shape constructor*/
   public Rectangle(Rectangle r)
   {
      super(r);
      if (r == null)
      {
         System.out.println("Fatal error.");
         System.exit(0);
      }
      this.length = r.length;
      this.width = r.width;
   }
   
   /*returns the shape as a string in the form name colour length length width width*/
   public String toString()
   {
      return super.toString() + " Length " +  length + " Width " + width;
   }
}