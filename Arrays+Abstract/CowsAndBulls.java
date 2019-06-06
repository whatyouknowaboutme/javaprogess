//Question 2 - cows and bulls
//Aadam Osman
//OSMAAD003
//5 September 2016 

public class CowsAndBulls
{
   
   private boolean end;
   private int Guessnumber;
   
   private int guessesmade;
   public final static int NUM_DIGITS = 4; 
   public final static int MAX_VALUE = 9876; 
   public final static int MIN_VALUE = 1234; 
   public final static int MAX_GUESSES = 10;
   
   public CowsAndBulls(int seed)
   {
       NumberPicker create_game = new NumberPicker(seed,1,9);
       String sum = "";
      
       for (int i = 1; i <= 4; i++)
       {
         String value = "" + create_game.nextInt();
         while(sum.indexOf(value)>0)
         {
            value = "" + create_game.nextInt();
         }
         sum+=value;
       }
         
       Guessnumber = Integer.parseInt(sum);
       //create_game.nextInt();
       //(((create_game.nextInt()*10+create_game.nextInt())*10+create_game.nextInt())*10+create_game.nextInt())*10;
       //System.out.println(Guessnumber);
       guessesmade = 0;
       end = false;
   }
   
   
public int guessesRemaining()
    {
      
         return MAX_GUESSES-guessesmade;
    }
    
    public Result guess(int guessNumber)
    {
         Result object = new Result (NumberUtils.countIntersect(guessNumber,Guessnumber)-NumberUtils.countMatches(guessNumber,Guessnumber),NumberUtils.countMatches(guessNumber,Guessnumber));
      guessesmade++;
      if ( guessNumber ==Guessnumber)
      {
         end = true;
      }
      if ( guessesmade == 10)
      {
         end = true;
      }
          
      return object;
    }
      
   public int giveUp()
   {
      end = true;
      return Guessnumber;
   }
  
   
   public boolean gameOver()
   {
     
     
      return end;
   }
    
     
   
}