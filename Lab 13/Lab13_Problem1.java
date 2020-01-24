/*
 COSC 236
 Your name:Christian Seyoum
 Description: Search an array
 Filename:Lab13_problem1 
 Date started:7/12/2018
 Classes: main
 */

import java.util.*;

public class Lab13_Problem1
{
  public static void main(String[] args)
  {
    int iNums[][] = new int[20][5];
    int iNum;
    
    Scanner cin = new Scanner(System.in);
    
    System.out.print("Search Value: ");
    iNum = cin.nextInt();
    
    fvPop(iNums);
    fvDisplay(iNums);
    fvSearch(iNums,iNum);
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
        iRand = rand.nextInt(( 500 - 1 ) + 1) + 1;
        piNums[iRow][iCol] = iRand;
      }
    }
    return;
  }
  public static void fvDisplay(int piNums[][])
  {
    int iRow;
    int iCol;
    for(iRow = 0; iRow<20; iRow++)
    {
      for(iCol = 0; iCol<5; iCol++)
      {
        System.out.printf("%8d", piNums[iRow][iCol]);
      }
      System.out.println("\n");
    }
    return;
  }
  public static void fvSearch(int piNums[][], int piNum)
  {
    int iRow;
    int iCol;
    for(iRow = 0; iRow<20; iRow++)
    {
      for(iCol = 0; iCol<5; iCol++)
      {
        if( piNums[iRow][iCol] == piNum)
        {
          System.out.println("Value "+piNum+" found in Row "+(iRow+1)+", Column "+(iCol+1));
          return;
        }
      }
      
    }
    System.out.println("Value not found");
    return;
  }
}