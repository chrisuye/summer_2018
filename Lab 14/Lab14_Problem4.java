import java.util.*;

public class Lab14_Problem4
{
  public static void main(String[] args)
  {
    int iNum;
    int iSum;
    iNum = 6;
    iSum = fiSumDigits(iNum);
    
    System.out.println("Sum of the digits for 1 to 6 is "+iSum);
  }
  
  public static int fiSumDigits(int piNum)
  {
    
    
    // Base case:
    if (piNum == 0)
    {
      return piNum;
    }
    else
    {
       
      return piNum + fiSumDigits((piNum-1));
    }
  }
}
