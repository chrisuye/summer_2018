import java.util.*;

public class Lab11_Problem4
{
  public static void main(String[] args)
  {
    double dSals[] = {10700.25,33239.00, 33880.50, 40204.30, 45000.00, 60774.30, 136900.80, 150243.10};
    int iSub;
    
      for (iSub = 0; iSub < 8; iSub++)
    {
      System.out.println(dSals[iSub]);
    }
    
    
    
      for (iSub = 0; iSub < 8; iSub++) 
    {
      
        dSals[iSub] = dSals[iSub] + (dSals[iSub] * .05);
    }
    
    boolean bFound;
    
    bFound = false;
    double dSearchValue;
    
   dSearchValue = 56;
      for (iSub = 0; iSub < 8; iSub++)
    {
      if (dSals[iSub] == dSearchValue)
      {
        bFound  = true;
        break;
      }
    }
    
    
    double dSum;
    dSum = 0;
    
   
      for (iSub = 0; iSub < 8; iSub = iSub + 2)
    {
      dSum = dSum + dSals[iSub];
    }
    
    double dSum1;
    
    dSum1 = 0;
    iSub = 0;
    
    
      while (iSub < 8)
    {
      dSum1 = dSum1 + dSals[iSub];
      iSub = iSub + 2;
    }
    
    
    
    int iLocation;
    double dSmallest;
    
    iLocation = 0;
    dSmallest = dSals[0];
    
    for (iSub = 1; iSub <= 7; iSub++)
    {
      if (dSals[iSub] < dSmallest)
      {
        iLocation = iSub;
      }
    }
    System.out.println("Location of smallest: " +  iLocation);
    
    
    Random rand = new Random();
    
   int iRandom;
   int iTosses[] = new int[10];
      for (iSub = 0; iSub < 10; iSub ++)
    {
      // Toss the coin:
      iRandom = rand.nextInt((10 - 1) + 1) + 1;
      
      // Store the outcome:
      iTosses[iSub] = iRandom;
    }
    
    
      for (iSub = 0; iSub < 10; iSub ++)
    {
      if (iTosses[iSub] == 0)
      {
        System.out.println("Index " + iSub + ": Heads");
      }
      else
      {
        System.out.println("Index " + iSub + ": Tails");
      }
    }
      
      
    double dTemp;
    double dVals[] = {2.345,34.5, 56.89, 456};
    dTemp = dVals[1];
    dVals[1] = dVals[2];
    dVals[2] = dTemp;
    
    double dTemp1;
    
    dTemp1 = dVals[0];
    dVals[0] = dVals[dVals.length - 1];
    dVals[dVals.length - 1] = dTemp1;
    
  }
}