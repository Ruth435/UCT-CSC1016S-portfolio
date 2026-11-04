/**
Ruth-ann Rudolph RLDRUT001
Vline object inherits from vector object, it stores id, x, y, and length
28/09/2023
*/
public class VLine extends VectorObject
{
   private int len;
   /**constructor for Vline objet id, x, y, and length */
   public VLine(int id,int x,int y,int len)
   {
      super(id,x ,y);
      this.len = len;
   }
   
   /**replaces the spaces to be filled (a verticle line) with star characters */
   public void draw ( char [][] matrix )
   {
         for(int iy = 0; iy < len; iy++)
         {
            matrix[iy+y][x] = '*';
         }
   }
}