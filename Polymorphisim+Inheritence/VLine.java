//Question 3 - VLine
//Aadam Osman
//OSMAAD003

public class VLine extends VectorObject
{
   private int ylength;
   
   public VLine (int id, int x, int y, int ylength)
   {
      super (id,x,y);
      this.ylength = ylength;
   }
   
   public void draw ( char [][] matrix )
   {
   
   for (int row = super.y; row < super.y + ylength; row++)
   {
      matrix[row][super.x] = '*';
   }

   }
}