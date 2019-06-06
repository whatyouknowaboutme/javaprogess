//Question 1 - NumberUtil class
//Aadam Osman
//OSMAAD003
//5 September 2016 

public class NumberUtils
{//
   private NumberUtils()
   {
   }
   
   public static int[] toArray(int number)
   {
      String num = "" + number;
      int[] array = new int[num.length()];
      for (int i = 0; i<num.length(); i++)
      {
         array[i] = Integer.parseInt(""+num.charAt(i));
      
      }  
      return array;
   }
   
   public static int countMatches(int numberA, int numberB)
   {
      String A = "" + numberA;
      String B = "" + numberB;
      int count = 0;
      for (int i = 0; i < A.length(); i++)
      {
         if (A.charAt(i) == B.charAt(i))
         {
            count++;
         }
      }
      return count;
   }
      
   
   
   public static int countIntersect(int numberA, int numberB)
   {
      String A = "" + numberA;
      String B = "" + numberB;
      int count = 0;
      for (int i = 0; i < A.length(); i++)
      {
         for (int b = 0; b <B.length(); b++)
         {
            if (A.charAt(i) == B.charAt(b))
            {
               count++;
            }
         }
      }
      return count;
   }
      
}