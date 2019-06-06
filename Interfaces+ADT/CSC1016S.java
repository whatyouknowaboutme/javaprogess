// Question 3 - JUnit test
// Aadam Osman
// OSMAAD003
// 13 September 2016 

public class CSC1016S implements Student 
{//
   private String name;
   private int pracs;
   private int practests;
   private int test;
   private int exam;
   

   
   public void setName (String name)
   {
      this.name = name;
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setMark (String category, int mark )
   {//
      switch (category)
      {
         case "pracs":
         {
         this.pracs = mark; 
         break;
         }
         case "practests":
         {
            this.practests = mark;
            break;
         }
         case "tests":
         {
            this.test = mark;
            break;
          }
          
          case "exam": 
          {
            this.exam= mark;
            break;
          }
          
      }
    }
   public float getFinal ()
      {
            return (float) (0.15*pracs) + (float)(0.10*practests) + (float)(0.15*test)  + (float)(0.60*exam);
      }
      
   }