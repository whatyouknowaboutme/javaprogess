import java.util.*;

public class Question1
{
   public static void main (String[] args) throws NoSuchElementException
   {
      ArrayList<SoftDrink> array = new ArrayList<SoftDrink>();
      Scanner sc = new Scanner(System.in);
      String input = "";
      System.out.println ("Enter option: (1) add soft drink (2) quit:");
      input = sc.nextLine();
      
      while (!(input.equals("2")))
      {
         System.out.println("Enter name, colour and volume in ml separated by space");
         input = sc.nextLine();
         Scanner scline = new Scanner(input).useDelimiter(" ");
         //System.out.print (scline.next() + scline.next() + scline.next());//System.out.print (input);
         
         
         array.add(new SoftDrink(scline.next(),scline.next(),Integer.parseInt(scline.next())));
         System.out.println ("Enter option: (1) add soft drink (2) quit:");
         input = sc.nextLine();
        
      }
      Collections.sort(array);
      
      for (SoftDrink e : array)
      {
         System.out.println ( e.toString());
      }
      
      
    }
}