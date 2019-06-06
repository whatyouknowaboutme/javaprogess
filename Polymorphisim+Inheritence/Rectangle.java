//Question 3 - Rectangle

public class Rectangle extends VectorObject
{
   private int xlength;
   private int ylength;
   
   public Rectangle (int id, int x, int y, int xlength, int ylength)
   {
      super (id,x,y);
      this.xlength = xlength;
      this.ylength = ylength;
   }
   
   public void draw (char [][] matrix )
   {
    for (int row = super.y; row < super.y + ylength; row++)
    {
      for  (int col = super.x; col < super.x + xlength; col++)
      {
         matrix[row][col] = '*';
      }
    }
      
   }
}