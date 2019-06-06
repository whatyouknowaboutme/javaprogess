//Question 2 - SoftDrink class
//Aadam Osman
//OSMAAD003
//22 August 2016 

public class SoftDrink extends Menu
{
   private String flavour;
   private String b_or_c;
   
   public SoftDrink ( String menunum, String size, String flavour, String b_or_c)
   {
      super (menunum, size);
      this.flavour = flavour;
      this.b_or_c = b_or_c;
   }
   
   public String toString ()
   {
      return "Soft Drink: " + super.toString() + ", " + this.flavour + ", " + this.b_or_c;
   }
}