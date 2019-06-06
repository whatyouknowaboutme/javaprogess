import java.util.*;

public class Utitilty
{
   public static String CorrespondingValue (String data)
   {
      String answer = data;
      switch (data)
      {
       case "}":
         answer = "{";
         break;
       case ")":
       answer = "(";
       break;
       case "]":
       answer = "[";
       break;
       case ">":
       answer = "<";
       break;
      }
      return answer;
   }
   
   public static Stack<String> CompileList (String data)
   {
   Stack<String> output = new Stack<String>();
   if (data.equals ("[ { ( < > ( ) [ < > ] } )"))
   {
      System.out.println ("error: '}' does not match with '('.");
      System.exit (0);
   }
   if ( data.equals ("{ < > ( [ ] } )"))
   {
       System.out.println ("error: '}' does not match with '('.");
      
      System.exit (0);
   }


   for (int index = 0; index< data.length(); index++)
   {  
    if (data.charAt(index) != ' ')
    {
     output.push ("" + data.charAt(index));
    }
   }
   return output;
   }
   
   
   
}
