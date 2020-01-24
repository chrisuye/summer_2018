import java.util.*;

public class Recursion
{
  public static void main(String[] args)
  {
    // Declarations:
    int iRetval;
    int iUserRequest;
    Scanner cin = new Scanner(System.in);

    // Get the user's request; force validation to range and integer:
    iUserRequest = fiGetInput();  
    
    // Call the method recursively:
    iRetval = fiFactorial(iUserRequest);
    
    // Display output:
    System.out.println("Factorial of " + iUserRequest + " is " + iRetval);
  }
  
  // A method to get and validate user input:
  public static int fiGetInput()
  {
    int iVal;
    Scanner cin = new Scanner(System.in);
    
    do
    {
      System.out.print("Enter an integer from 1 to 12 to calculate its factorial: ");
      iVal = cin.nextInt();
      
      if (iVal < 1 || iVal > 12)
      {
        System.out.println("Error: must be between 1 to 12, inclusive. Try again.");
      }
      else
      {
        break;
      }
    } while (true);
      
    return iVal;
  }
  
  // A recursive method that will be called repeatedly until the base case
  // evaluate true:
  public static int fiFactorial(int piVal)
  {
    if (piVal == 1)
    {
      return 1;
    }
    else
    {
      return piVal * fiFactorial(piVal - 1);
    }
  }
}
