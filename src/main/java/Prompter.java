import java.util.Scanner;

public class Prompter
{
    //class vars
    private Scanner in = new Scanner(System.in); 
    
    //class methods
    public void setupGame()
    {
        System.out.println("ADMINISTRATOR SETUP");
        System.out.println("===================");
    }
    public void startGame(int maxNumber, String itemName)
    {
        System.out.println("PLAYER");
        System.out.println("===================");
        System.out.println("How many " + itemName + " are in the jar? Pick a number between 1 and " + maxNumber);
    }
    public String getItemName()
    {
        //prompt for jar items
        System.out.println("What type of item?");
        String itemName = in.next();
      
        return itemName;
    }
  
    public int getMaxItemNumber(String itemName)
    {
        //prompt for maximum item number
        System.out.println("What is the maximum amount of " + itemName + "?");
        int maxNumber = in.nextInt();
      
        return maxNumber;
    }
  
    public int getGuess()
    {
        //prompt for guess
        System.out.print("Guess: ");
        int guess = in.nextInt();
      
        return guess;
    }
  
    public void tooHigh()
    {
        //display message
        System.out.println("Your guess is too high");
    }
  
    public void tooLow()
    {
        //display message
        System.out.println("Your guess is too low");
    }
  
    public void printResults(int attempts)
    {
        //display results
        System.out.println("Correct! You got it in " + attempts + " attempts");
    }
  
    public void print(String message)
    {
        //output message
        System.out.println(message);
    }
}