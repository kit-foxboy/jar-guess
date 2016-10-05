public class Game 
{
   public static void main(String[] args) 
    {
        //setup prompter
        Prompter io = new Prompter();
     
        //display opening message
        io.setupGame();
        
        //setup jar
        String itemName = io.getItemName();
        int maxNumber = io.getMaxItemNumber(itemName);
        Jar jar = new Jar(itemName, maxNumber);
     
        //display player message
        io.startGame(jar.getMaxItemNumber(), itemName);
     
        //run game
        int guessResult = -1;
        int attempts = 0;
        while(guessResult != 0)
        {
            try
            {
              
              //get guess
              int currentGuess = io.getGuess();
              guessResult = jar.guessNumber(currentGuess);
              
              if(jar.guessNumber(currentGuess) > 0)
                io.tooHigh();
              
              if(jar.guessNumber(currentGuess) < 0)
                 io.tooLow();
              
              //increment attempts
              attempts++;
            
            }
            catch(IllegalArgumentException e)
            {
                //print exception message
                io.print(e.getMessage());
            }
        }
     
        //finish game
        io.printResults(attempts);
    }
}
