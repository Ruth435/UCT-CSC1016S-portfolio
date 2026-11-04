/**
Ruth-ann Rudolph RLDRUT001
ptline object inherits from vector object, it stores id, x, y, x1 and y1
28/09/2023
*/
public class PtLine extends VectorObject
{
   private int x1, y1;
   /**constructor for ptline objet id, x, y, x1 and y1 */
   public PtLine(int id,int x,int y,int x1,int y1)
   {
      super(id,x ,y);
      this.x1 = x1;
      this.y1 = y1;
   }
   
   /**implementation of Bresenham's Line Drawing Algorithm.*/
   public void draw( char [][] matrix )
   {
      int ys;
      int newX0 = x, newY0 = y, newX1= x1, newY1 = y1;
      boolean steep = Math.abs(newY1-newY0) > Math.abs(newX1-newX0);
      
      if (steep)
      {
         int temp = newX0;
         newX0 = newY0;
         newY0 = temp;
         
         temp = newX1;
         newX1 = newY1;
         newY1 = temp;
      }
      
      if (newX0>newX1)
      {
         int temp = newX0;
         newX0 = newX1;
         newX1 = temp;
         
         temp = newY0;
         newY0 = newY1;
         newY1 = temp;
      }
      
      if (newY0<newY1)
      {
         ys = 1;
      }
      
      else
      {
         ys = -1;
      }
      
      double m = Math.abs(newY1-newY0)/ (double)(newX1-newX0);
      int y0 = newY0;
      double error = 0;
      for (int i = newX0; i <= newX1; i++)
      {
         if (steep)
         {
            matrix[i][y0] = '*';
         }
         
         else
         {
            matrix[y0][i] = '*';
         }
         error = error + m;
         
         if (error > 0.5)
         {
            y0 = y0 + ys;
            error = error-1;
         }
      }
   }
}