/**
Ruth-ann Rudolph RLDRUT001
Hline object inherits from vector object, it stores id, x, y, and length
28/09/2023
*/
public class HLine extends VectorObject
{
   private int len;
   /**constructor for Hline objet id, x, y, and length */
   public HLine(int id,int x,int y,int len)
   {
      super(id,x ,y);
      this.len = len;
   }
   
   /**replaces the spaces to be filled (a Horizontal line) with star characters */
   public void draw ( char [][] matrix )
   {
         for(int ix = 0; ix < len; ix++)
         {
            matrix[y][ix+x] = '*';
         }
   }
   
}