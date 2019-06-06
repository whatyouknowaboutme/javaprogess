import java.util.*;
public class Question1
{
   public static void main (String[] args)
   {//
      LinkedList<String> buffer = new LinkedList<String>();
      Scanner scline = new Scanner(System.in);
      String input = scline.nextLine();
      
      while ( input.charAt(0) != 'X')
      {
         if (input.charAt(0) == 'O')
         {
            String output = buffer.pollFirst();
            if (output == null)
            {
               System.out.println ("Buffer empty");
            }
            else
            {
            System.out.println("Data: " + output);
            }
         }
         
         else
         {  
             buffer.addLast(input);
         }
         input = scline.nextLine();
      }

}
}
   