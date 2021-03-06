/*
 COSC 236
 Your name:Christian Seyoum
 Description: Highest and Smallest Value
 Filename:Lab13_problem2 
 Date started:7/12/2018
 Classes: main
 */

import java.util.*;

public class Lab13_Problem2
{
  public static void main(String[] args)
  {
    int iNums[][] = new int[20][5];
    int iSmall;
    int iLarge;
    
    fvPop(iNums);
    fvDisplay(iNums);
    iSmall = fiSmallest(iNums);
    iLarge = fiLargest(iNums);
    
    System.out.println("Smallest: "+iSmall);
    System.out.println("Largest: "+iLarge);
  }
  public static void fvPop(int piNums[][])
  {
    int iRand;
    int iRow;
    int iCol;
    Random rand = new Random();
    for(iRow = 0; iRow < 20; iRow++)
    {
      for(iCol = 0; iCol < 5; iCol++)
      {
        iRand = rand.nextInt(( 1000 - 1) + 1) + 1;
        piNums[iRow][iCol] = iRand;
      }
    }
    return;
  }
  public static void fvDisplay(int piNums[][])
  {
    int iRow;
    int iCol;
    for(iRow = 0; iRow < 20; iRow++)
    {
      for(iCol = 0; iCol < 5; iCol++)
      {
        System.out.printf("%8d", piNums[iRow][iCol]);
      }
      System.out.println("\n");
    }
    return;
  }
  public static int fiSmallest(int piNums[][])
  {
    int iRow;
    int iCol;
    int iSmall;
    
    iSmall = piNums[0][0];
    for(iRow = 1; iRow < 20; iRow++)
    {
      for(iCol = 1; iCol < 5; iCol++)
      {
        if(iSmall > piNums[iRow][iCol])
        {
          iSmall = piNums[iRow][iCol];
        }
      }
      
    }
    return iSmall;
  }
  public static int fiLargest(int piNums[][])
  {
    int iRow;
    int iCol;
    int iLarge;
    
    iLarge = piNums[0][0];
    for(iRow = 1; iRow < 20; iRow++)
    {
      for(iCol = 1; iCol < 5; iCol++)
      {
        if(iLarge < piNums[iRow][iCol])
        {
          iLarge = piNums[iRow][iCol];
        }
      }
      
    }
    return iLarge;
  }
}