/**
Ruth-ann Rudolph RLDRUT001
rectangle object inherits from vector object, it stores id, x, y, xlength and ylength
28/09/2023
*/
public class Rectangle extends VectorObject
{
   private int xLen,yLen;
   /**constructor for rectangle objet id, x, y, xlength and ylength */
   public Rectangle(int id,int x,int y,int xLen,int yLen)
   {
      super(id,x ,y);
      this.xLen = xLen;
      this.yLen = yLen;
   }
   
   /**replaces the spaces to be filled in the rectangle with star characters */
   public void draw ( char [][] matrix )
   {
      for(int iy = 0; iy < yLen; iy++)
      {
         for(int ix = 0; ix < xLen; ix++)
         {
            matrix[iy+y][ix+x] = '*';
         }
      }
   }
}