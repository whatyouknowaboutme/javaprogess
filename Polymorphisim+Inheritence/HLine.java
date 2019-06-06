//Question 3 - HLine
//Aadam Osman
//OSMAAD003

public class HLine extends VectorObject
{
   private int xlength;
   
   public HLine (int id, int x, int y, int xLength)
   {
      super (id,x,y);
      this.xlength = xLength;
   }
   
   public void draw ( char [][] matrix )
   {
    //System.out.print("a");
    for (int col = super.x; col < (super.x + xlength); col++)
    {
      matrix[y][col] = '*';//super.y][col] = '*';
    }
    
    
   }
   
}