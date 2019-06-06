//Question 2 - Menu class
//Aadam Osman
//OSMAAD003
//22 August 2016


public class Menu
{
   private String menuitemnumber;
   private String size;
   
   public Menu (String menuitemnumber, String size)
   {
      this.menuitemnumber = menuitemnumber;
      this.size = size;
   }
   
   public String toString()
   {
      return this.menuitemnumber + ", " + this.size;
   }
   
   public String getMenuItem()
   {
      return this.menuitemnumber;
   }
}