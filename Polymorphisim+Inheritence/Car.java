//Question 1 - Car class
//Aadam Osman
//OSMAAD003
//22 August 2016 

public class Car extends Vehicle
{
   private int numdoors;
   
   public Car (String colour, int numberofpassengers, int numdoors) 
   {
      super (numberofpassengers,colour);
      this.numdoors = numdoors;
   }
   
   public String toString()
   {
      return super.toString() + " " + this.numdoors + " doors";
   }
}