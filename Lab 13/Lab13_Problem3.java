/*
 COSC 236
 Your name:Christian Seyoum
 Description: Transposed
 Filename:Lab13_problem3 
 Date started:7/12/2018
 Classes: main
 */

import java.util.*;

public class Lab13_Problem3
{
  public static void main(String[] args)
  {
    int iRow;
    int iCol;
    
    Scanner cin = new Scanner(System.in);
    
    System.out.print("Enter Row: ");
    iRow = cin.nextInt();
    System.out.print("Enter Row: ");
    iCol = cin.nextInt();
    
    int iNums[][] = new int[iRow][iCol];
    
    fvPop(iNums);
    fvDisplay(iNums);
    fvTranspose(iNums);
    
  }
  public static void fvPop(int piNums[][])
  {
    int iRand;
    int iRow;
    int iCol;
    int iRowLen;
    int iColLen;
    iRowLen = piNums.length;
    iColLen = piNums[0].length;
    Random rand = new Random();
    for(iRow = 0; iRow<iRowLen; iRow++)
    {
      for(iCol = 0; iCol<iColLen; iCol++)
      {
        iRand = rand.nextInt((9-0)+1)+0;
        piNums[iRow][iCol] = iRand;
      }
    }
    return;
  }
  public static void fvDisplay(int piNums[][])
  {
    int iRow;
    int iCol;
    int iRowLen;
    int iColLen;
    
    iRowLen = piNums.length;
    iColLen = piNums[0].length;
    
    System.out.println("Original:");
    
    for(iRow = 0; iRow<iRowLen; iRow++)
    {
      for(iCol = 0; iCol<iColLen; iCol++)
      {
        
        System.out.printf("%8d", piNums[iRow][iCol]);
      }
      System.out.println("\n");
    }
    return;
  }
  public static void fvTranspose(int piNums[][])
  {
    int iRow;
    int iCol;
    int iTemp;
    int iRowLen;
    int iColLen;
    
    iRowLen = piNums.length;
    iColLen = piNums[0].length;
    
    System.out.println("Transposed:");
    
    for(iRow = 0; iRow < iRowLen; iRow++)
    {
      for(iCol = 0; iCol < iColLen; iCol++)
      {        
        System.out.printf("%8d", piNums[iCol][iRow]);
      }
      System.out.println("\n");
    }
  }
}