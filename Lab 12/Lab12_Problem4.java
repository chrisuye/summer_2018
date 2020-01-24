import java.util.*;
import java.lang.*;
public class Lab12_Problem4
{
  public static void main(String[] args)
  {
    int iVals[][] = new int[][]{{3,7,1,4},{9,4,8,2},{7,3,9,5},{4,0,5,8}};
    double dMean;
    double dVariance;
    double dStd;
    int iRowLength;
    int iColLength;
    int iLength;
    iRowLength = iVals.length;
    iColLength = iVals[0].length;
    iLength = (iRowLength * iColLength) - 1;
    
    fvDisplayAll(iVals);
    fvDisplayRow(iVals);
    fvDisplayCol(iVals);
    fvRowSum(iVals);
    fvColSum(iVals);
    dMean = fdMean(iVals);
    dVariance = fdVariance(iVals,dMean);
    
    dStd = Math.sqrt(dVariance/(double)iLength);
    
    System.out.println("Mean: "+dMean);
    System.out.println("STD: "+dStd);
  }
  public static void fvDisplayAll(int piVals[][])
  {
    int iRow;
    int iCol;
    for(iRow = 0; iRow<4; iRow++)
    {
      for(iCol = 0; iCol<4; iCol++)
      {
        System.out.print(piVals[iRow][iCol]+" ");
      }
    }
    return;
  }
  public static void fvDisplayRow(int piVals[][])
  {
    int iRow;
    int iCol;
    System.out.println("\n");
    for(iRow = 0; iRow<4; iRow++)
    {
      for(iCol = 0; iCol<4; iCol++)
      {
        System.out.print(piVals[iRow][iCol]+" ");
      }
      System.out.println("\n");
    }
    return;
  }
  public static void fvDisplayCol(int piVals[][])
  {
    int iRow;
    int iCol;
    for(iCol = 0; iCol<4; iCol++)
    {
      for(iRow = 0; iRow<4; iRow++)
      {
        System.out.print(piVals[iRow][iCol]+" ");
      }
      System.out.println("\n");
    }
    return;
  }
  public static void fvRowSum(int piVals[][])
  {
    int iRow;
    int iCol;
    int iSum;
    for(iRow = 0; iRow<4; iRow++)
    {
      iSum = 0;
      for(iCol = 0; iCol<4; iCol++)
      {
        iSum = piVals[iRow][iCol] + iSum;        
      }
      System.out.println("Row "+(iRow+1)+" subtotal: "+iSum);
    }
    return;
  }
  public static void fvColSum(int piVals[][])
  {
    int iRow;
    int iCol;
    int iSum;
    for(iCol = 0; iCol<4; iCol++)
    {
      iSum = 0;
      for(iRow = 0; iRow<4; iRow++)
      {
        iSum = piVals[iRow][iCol] + iSum;        
      }
      System.out.println("Column "+(iCol+1)+" subtotal: "+iSum);
    }
    return;
  }
  public static double fdMean(int piVals[][])
  {
    int iRow;
    int iCol;
    int iSum;
    double dMean;
    int iRowLength;
    int iColLength;
    int iLength;
    iRowLength = piVals.length;
    iColLength = piVals[0].length;
    iSum=0;
    iLength = iRowLength * iColLength;
    for(iRow = 0; iRow<4; iRow++)
    {
      for(iCol = 0; iCol<4; iCol++)
      {
        iSum = piVals[iRow][iCol] + iSum;        
      }
    }
    dMean = (double)iSum/(double)iLength;
    return dMean;
  }
  public static double fdVariance(int piVals[][], double pdMean)
  {
    int iRow;
    int iCol;
    int iSum;
    double dVariance;
    dVariance = 0;
    
    for(iRow = 0; iRow<4; iRow++)
    {
      for(iCol = 0; iCol<4; iCol++)
      {
        dVariance = Math.pow((piVals[iRow][iCol] - pdMean), 2) + dVariance;        
      }
    }
    return dVariance;
  }
}