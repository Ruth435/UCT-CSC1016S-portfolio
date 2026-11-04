/** Ruth-ann Rudolph RDLRUT001
09/19/2023
CowsAndBulls implements the logic for a cows and bulls guessing game the player has */

public class CowsAndBulls
{   
   public final static int NUM_DIGITS = 4;
   public final static int MAX_VALUE = 9876;
   public final static int MIN_VALUE = 1234;
   public final static int MAX_GUESSES = 10;
   private int remGuesses;
   private int num = 0;
   private boolean guessed;
   
   /** Create a CowsAndBulls game using the given randomisation seed value to generate a mystery number of NUM_DIGITS length,
    and that gives the player MAX_GUESSES guesses. */
   public CowsAndBulls(int seed)    {
      remGuesses = MAX_GUESSES;
      NumberPicker choose = new NumberPicker(seed, 1, 9);
      for (int i = 0; i < 4; i++)
      {
         num += choose.nextInt();
         num = num*10;
      }
      num = num/10;
      guessed = false;
   }
   
   /** Obtain the number of guesses remaining. */
   public int guessesRemaining()
   {
      return remGuesses;
   }
   
   /**Evaluates a guess that the mystery number is guessNumber, returning the outcome in the form of a Result object. 
   Decrements guesses remaining*/
   public Result guess(int guessNumber)
   {
      int total = NumberUtils.countIntersect(num, guessNumber); //finds the number of correct digits, reguardless of position
      int bulls = NumberUtils.countMatches(num, guessNumber); //finds digits in the correct positions
      int cows = total - bulls;
      Result r = new Result(cows, bulls);
      if(bulls == 4)
      {
         guessed = true;
      }
      remGuesses--;
      return r;
   }
   
   /**End the game, returning the secretNumber.*/
   public int giveUp() 
   {
      remGuesses = 0;
      return num;
   }
   
   /** Returns true if (i) the secret number has been guessed, or (ii) there are no more guesses. */
   public boolean gameOver()
   {
      if(remGuesses == 0)
      {
         return true;
      }
      else if (guessed)
      {
         return true;
      }
      return false;
   }
}