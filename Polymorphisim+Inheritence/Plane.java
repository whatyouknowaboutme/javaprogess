//Question 1 - Plane
//Aadam Osman
//OSMAAD003
//22 August 2016 

public class Plane extends Vehicle
{
   private int modelnum;
   private String modelname;
   
   public Plane (String colour,int numofpass, String modelname, int modelnum)
   {
   super(numofpass, colour);
   this.modelname = modelname;
   this.modelnum = modelnum;
   }
   
   public String toString()
   {
      return super.toString() +" "+ modelname + " "+modelnum;     
   }
}