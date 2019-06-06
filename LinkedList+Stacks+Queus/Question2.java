//Question2 

import java.util.*;

public class Question2
{//class
   public static void main (String[] args)
   {//main
      Scanner scline = new Scanner (System.in);
      Stack<String> stack1 = new Stack<String>();
      Stack<String> stack2 = new Stack<String>();
      
      System.out.println ("Enter a string to test:");
      String input = scline.nextLine();
      
      stack1 = Utitilty.CompileList (input);
      
      String answer = "";
      
      int count =0;
      
      while (stack1.isEmpty() == false)
      {//while
         String character = stack1.pop();
         String corresponding_character = Utitilty.CorrespondingValue(character);
         stack2.push(character);
         int index_of_corresponding_character = stack1.search(corresponding_character);
         
         if (index_of_corresponding_character != -1)
         {
          stack1.remove(stack1.size()-index_of_corresponding_character);
          count++;
         }
         else
         {
            if (index_of_corresponding_character==-1 && stack1.size()>0)
            {
               if (stack1.peek().equals(Utitilty.CorrespondingValue(stack1.peek())))
               {
                  System.out.println ("error: \'" +character + "\' does not match with \'" +stack1.pop()+"\'.");
                  System.exit (0);
                  break;
                  
               }
            }
            
            if (index_of_corresponding_character ==-1 && character.equals(corresponding_character))
            {
            answer = "error at end: opening bracket \'" + character + "\' remains unclosed.\n" + answer;
            }
            else
            {
               if (index_of_corresponding_character==-1 && !(character.equals(corresponding_character))) 
               {
               answer = "error at end: the close bracket \'"+ character+"\' does not have a corresponding opening bracket.\n" + answer;
               }
            }
         }  
               
      }
      
      if ( count >= stack2.size())
      {
      System.out.println ("The string is correct! There are no mismatched brackets.");
      }
      else
      {
      System.out.println (answer);
      }
   }
}

      