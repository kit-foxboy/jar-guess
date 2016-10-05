import java.util.Random;

public class Jar
{
    //class vars
    private String mItemName;
    private int mMaxItemNumber;
    private int mItemNumber;
  
    public int getMaxItemNumber()
    {
        return mMaxItemNumber;
    }
  
    public int getItemNumber()
    {
        return mItemNumber;
    }
  
    //class constructors
    public Jar(String itemName, int maxItemNumber)
    {
        //init class vars
        mItemName = itemName;
        mMaxItemNumber = maxItemNumber;
      
        //get random item number
        Random rand = new Random();
        mItemNumber = rand.nextInt(maxItemNumber) + 1;
    }
  
    //class methods
    public int guessNumber(int number)
    {
        //limit guess
        if(number > mMaxItemNumber)
           throw new IllegalArgumentException("“Your guess must be less than " + mMaxItemNumber);
        
        //check guess
        if(number < mItemNumber)
            return -1;
        else if(number > mItemNumber)
            return 1;
        else
           return 0;
    }
}