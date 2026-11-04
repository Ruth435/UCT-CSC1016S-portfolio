/**Ruth-ann Rudolph RDLRUT001
09/19/2023
inherits from shape class, adds radius property to name and colour. */

public class Circle extends Shape
{
   private double radius;
   
   /** constructor for Circle object with variables name and colour from the shape class, adding radius */
   public Circle(String name, String colour, double radius)
   {
      super(name, colour);
      this.radius = radius;
   }
   
   /**copy constructor for circle objects, uses shape constructor*/
   public Circle(Circle c)
   {
      super(c);
      if (c == null)
      {
         System.out.println("Fatal error.");
         System.exit(0);
      }
      this.radius = c.radius;
   }

   /*returns the shape as a string in the form name colour Radius radius*/
   public String toString()
   {
      return super.toString() + " Radius " +  radius;
   }
}