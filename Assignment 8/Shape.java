/**Ruth-ann Rudolph RDLRUT001
09/19/2023
creates a shape object with propperties name and colour*/

public class Shape
{
   private String name, colour;
   
   /** constructor for shape object with variables name and colour */
   public Shape(String name, String colour)
   {
      this.name = name;
      this.colour = colour;
   }
   
   /**copy constructor for shape objects*/
   public Shape(Shape s)
   {
      if (s == null)
      {
         System.out.println("Fatal error.");
         System.exit(0);
      }
      this.name = s.name;
      this.colour = s.colour;
   }
   
   /*returns the shape as a string in the form name colour*/
   public String toString()
   {
      return name + " " + colour;
   }
}