//Question 3 - PtLine
//OSMAAD003
//Aadam Osman

public class PtLine extends VectorObject
{
   private int x_end;
   private int y_end;
   
   public PtLine(int id, int x, int y, int x_end, int y_end)
   {
      super (id, x,y);
      this.x_end = x_end;
      this.y_end = y_end;
   }
   
   public void draw ( char [][] matrix )
   {
   
   int x2 = x_end;
   int d = 0;
   int y1 = super.y;
   int y2 = y_end;
   int x1 = super.x;
   
   
   if (x2 <x1)
   {
      int temp = x2;
      x2 = x1;
      x1 = temp;
      temp = y2;
      y2 = y1;
      y1 = temp;
   }  
        int dx = Math.abs(x2 - x1);
        int dx2 = (dx << 1);
        int dy = Math.abs(y2 - y1);
        int dy2 = (dy << 1);
 
        //increment by a factor  
        int increment_x = 0; 
        if (x1 <x2)
        {
         increment_x = 1;
        }
        else
        {
         increment_x = -1;
        }
        
        
        int increment_y =0;
        
        if (y1<y2)
        {
         increment_y = 1;
        }
        else
        {
         increment_y = -1;
        }
 
        if (dx >= dy) {
            for (;;)//infinite loop and breaks when it reaches it's last x postion
             {
                matrix[y1][x1] = '*';
                if (x1 == x2)
                    break;
                x1 += increment_x ;
                d += dy2;
                if (d > dx) {
                    y1 += increment_y;
                    d -= dx2;
                }
            }
        } else {
            for (;;)//again and infinite loop and breaks when it reaches it's last y direction
             {
                matrix[y1][x1] = '*';
                if (y1 == y2)
                    break;
                y1 += increment_y;
                d += dx2;
                if (d > dy) {
                    x1 += increment_x ;
                    d -= dy2;
                }
            }
        }
     }
   
   
 }
      
