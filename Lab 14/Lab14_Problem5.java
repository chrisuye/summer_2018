import java.util.*;

public class Lab14_Problem5
{
  public static void main(String[] args)
  {
    int iVal;
    int iFactorial;
    int iSum;
    
    try 
    {
      Scanner cin = new Scanner(System.in);
      
      System.out.print("Enter an integer value from 1 to 20: ");
      
      while(cin.hasNextInt())
      {
        iVal = cin.nextInt();
        if ( iVal < 1 || iVal > 20)
        {
          System.out.println("Error: not in range 1 to 20");
        }
        else
        {
          iSum = fiSumDigits(iVal);
          iFactorial = fiFactorial(iVal);
          System.out.println("Sum of the digits from 1 to "+iVal+": "+iSum);
          System.out.println("Factorial of "+iVal+" is "+iFactorial);
        }
        break;
      }
    }
    catch(InputMismatchException sMsg)
    {
      System.out.println("Error: not an int");
      
    }
  }
  
  public static int fiSumDigits(int piVal)
  {
    if (piVal == 0)
    {
      return piVal;
    }
    else
    {
      
      return piVal + fiSumDigits((piVal-1));
    }
  }
  public static int fiFactorial(int piVal)
  {
    if (piVal == 1)
    {
      return 1;
    }
    else
    {
      
      return piVal * fiFactorial(piVal-1);
    }  
    
  }
}
