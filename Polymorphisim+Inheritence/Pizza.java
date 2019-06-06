//Question 2 - pizza class
//Aadam Osman
//OSMAAD003
//22 August 2016 

public class Pizza extends Menu 
{
   private String base;
   private String extra_cheese;
   private String extra_garlic;
   
   public Pizza (String menuitem, String size, String base, String extra_cheese, String extra_garlic)
   {
      super (menuitem, size);
      this.base = base;
      this.extra_cheese = extra_cheese;
      this.extra_garlic = extra_garlic;
   }
   
   
   public String toString()
   {
      return "Pizza: " +super.toString() +", " + base + ", " + extra_cheese + ", "+  extra_garlic;
   }
}
   
      
   