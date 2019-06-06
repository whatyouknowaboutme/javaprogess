//Question 2 - application class
//Aadam Osman 
// OSMAAD003
// 22 August 2016 
import java.util.Scanner;
public class Question2
{
   public static void main (String[] args)
   {
      
      Menu[] array = new Menu[100];
      int lengtharray = 0;
      System.out.println("Welcome to Great International Food Court\nMENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
      Scanner command = new Scanner (System.in);
      char input = (char) (command.next().toLowerCase()).charAt(0);
      
      while (input !='q')
      {//while
         switch (input)
         {//switch
         case 'p':
         {
         System.out.println ("Enter the menu item number");
         String menuitemnum = command.next();
         
         System.out.println ("Enter the size");
         String size = command.next();
         
         System.out.println ("Enter the base");
         String base = command.next();
         
         System.out.println ("Enter extra cheese");
         String extra_cheese = command.next();
         
         System.out.println ("Enter extra garlic");
         String extra_garlic = command.next();
         
         array[lengtharray] = new Pizza (menuitemnum,size,base, extra_cheese, extra_garlic);
         lengtharray++;
         System.out.println ("Done");
         break;
         }       
         case 'c':
         {
         System.out.println ("Enter the menu item number");
         String menuitemnum = command.next();
         
         System.out.println ("Enter the size");
         String size = command.next();
         
         System.out.println ("Enter the curry type");
         String type = command.next();
         
         array[lengtharray] = new Curry (menuitemnum,size,type);
         lengtharray++;
         System.out.println ("Done");
         break;
         }
                  
         
         case 's':
         {
         System.out.println ("Enter the menu item number");
         String menuitemnum = command.next();
         
         System.out.println ("Enter the size");
         String size = command.next();
         
         System.out.println("Enter the flavour");
         String flavour = command.next();
         
         System.out.println ("Enter whether it is a bottle or can");
         String b_or_c = command.next();
         
         array[lengtharray] = new SoftDrink(menuitemnum,size,flavour,b_or_c);
         lengtharray++;
         
         System.out.println ("Done");
         break; 
         }        
         
         case 'd':
         {
         System.out.println ("Enter the menu item number");
         String itemd = command.next();
         int found = 0;
         
         for (int start = 0; start < lengtharray; start++)
         {
            if (array[start].getMenuItem().equals(itemd))
            {
               array[start] = array[lengtharray-1];
               lengtharray--;
               found++;
               break;
            }
         }
         if (found>0)
         {
            System.out.println("Done");
         }
         else
         {
           System.out.println("Not found");
         } 
         break;
         }
         case 'l':
         {
           for (int start = 0; start < lengtharray; start++)
           {
            System.out.println(array[start].toString());
           }
         System.out.println("Done");  
         break;
        }
         
         }
         
         
        
      System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
      input = (char) (command.next().toLowerCase()).charAt(0);  
         
      }
   }
}