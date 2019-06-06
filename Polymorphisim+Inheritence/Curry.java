//Question 2 - Curry class
//Aadam Osman
//OSMAAD003
//22 August 2016

public class Curry extends Menu
{
  private String type;
  
  public Curry (String menuitem, String size, String type)
  {
   super (menuitem,size);
   this.type = type;
  }
  
  
  public String toString ()
  {
   return "Curry: " + super.toString() + ", " + this.type;
  }
}
  