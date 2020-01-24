
public class PassArray
{
  public static void main(String[] args)
  {
    int iVals[] = {10, 15, 20, 25}; 
    int iSub;
    
    // Call the method and pass the array:
    fvAddThreeToEach(iVals);
    
    // Display the array. Note that each value will be 3 more now:

    for (iSub = 0; iSub <= 3; iSub ++)
    {
      System.out.println("Value " + (iSub + 1) + ": " + iVals[iSub]);
    }
  }
  
  // A method that adds 3 to each value in the array:
  public static void fvAddThreeToEach(int piVals[])
  {
    int iSub;
    
    // Add three to each value:
    for (iSub = 0; iSub < piVals.length; iSub ++)
    {
      piVals[iSub] = piVals[iSub] + 3;
    }
    
    
    return;
  }
}
