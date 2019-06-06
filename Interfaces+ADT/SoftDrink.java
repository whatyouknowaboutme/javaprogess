// Question 1 - Assignment 7 
// Aadam Osman
// OSMAAD003
// 12 September 2016 

public class SoftDrink implements Comparable<SoftDrink>
{
   private String name;
   private String colour;
   private int volume;
   
   public SoftDrink (String name, String colour, int volume)
   {
      this.name = name;
      this.colour = colour;
      this.volume = volume; 
   }
   
   
   public String toString()
   {
      return this.name + " " + this.colour + " " + this.volume;
   }
   
   public int compareTo(SoftDrink other)
   {
      int comparisson; 
      
      comparisson = name.compareTo(other.getName());
      
      if (comparisson != 0)
      {  
         return comparisson;
      }
      comparisson = colour.compareTo(other.getColour());
      
      if ( comparisson !=0)
      {
         return comparisson;
      }
      
      return Integer.compare(volume, other.getVolume());
   }
   
   public String getColour ()
   {
      return colour;
   }
      
   public String getName ()
   {
      return name;
   }
   
   public int getVolume ()
   {
      return volume;
   }
   
}