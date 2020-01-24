import java.util.*;

public class Lab12_Problem2
{
  public static void main(String[] args)
  {
    int iNums[][] = new int[2][3];
    int iSum;
    int iHigh;
    fvPop(iNums);
    fvRowTotal(iNums);
    fvColTotal(iNums);
    iSum = fiGrandTotal(iNums);
    iHigh = fiHighest(iNums);
    
    System.out.println("Grand Total: "+iSum);
    System.out.println("Highest value: "+iHigh);
    fvSwapRows(iNums);
  }
  public static void fvPop(int piNums[][])
  {
    piNums[0][0] = 74;
    piNums[0][1] = 3;
    piNums[0][2] = 19;
    piNums[1][0] = 23;
    piNums[1][1] = 21;
    piNums[1][2] = 62;
    return;
  }
  public static void fvRowTotal(int piNums[][])
  {
    int iCol;
    int iSum1;
    int iSum2;
    iSum1=0;
    iSum2=0;
    
    for (iCol = 0; iCol<3; iCol++)
    {
      iSum1 = iSum1 + piNums[0][iCol]; 
    }
    for (iCol = 0; iCol<3; iCol++)
    {
      iSum2 = iSum2 + piNums[1][iCol];
    }
    System.out.println("Row 1: "+iSum1);
    System.out.println("Row 2: "+iSum2);
    return;
  }
  public static void fvColTotal(int piNums[][])
  {
    int iRow;
    int iSum1;
    int iSum2;
    int iSum3;
    iSum1=0;
    iSum2=0;
    iSum3=0;
    
    for (iRow = 0; iRow<2; iRow++)
    {
      iSum1 = iSum1 + piNums[iRow][0]; 
    }
    for (iRow = 0; iRow<2; iRow++)
    {
      iSum2 = iSum2 + piNums[iRow][1]; 
    }
    for (iRow = 0; iRow<2; iRow++)
    {
      iSum3 = iSum3 + piNums[iRow][2]; 
    }
    System.out.println("Col 1: "+iSum1);
    System.out.println("Col 2: "+iSum2);
    System.out.println("Col 3: "+iSum3);
    return;
  }
  public static int fiGrandTotal(int piNums[][])
  {
    int iRow;
    int iCol;
    int iSum;
    iSum=0;
    for(iRow = 0; iRow<2; iRow++)
    {
      for(iCol = 0; iCol<3; iCol++)
      {
        iSum = iSum + piNums[iRow][iCol];
      }
    }
    return iSum;
  }
  public static int fiHighest(int piNums[][])
  {
    int iRow;
    int iCol;
    int iHigh;
    iHigh = piNums[0][0];
    for (iRow = 1; iRow<2; iRow++)
    {
      for(iCol = 1; iCol<3; iCol++)
      {
        if(iHigh < piNums[iRow][iCol])
        {
          iHigh = piNums[iRow][iCol];
        }
      }
    }
    return iHigh;
  }
  public static void fvSwapRows(int piNums[][])
  {
    int iRow;
    int iCol;
    int iSwap;
    for(iRow = 0; iRow<1; iRow++)
    {
      for(iCol = 0; iCol<3; iCol++)
      {
        iSwap = piNums[iRow][iCol];
        piNums[iRow][iCol] = piNums[iRow+1][iCol];           
        piNums[iRow+1][iCol] = iSwap;
      }
    }
    System.out.print("Row 1: ");
    for(iRow = 0; iRow<1; iRow++)
    {
      for(iCol = 0; iCol<3; iCol++)
      {
        System.out.print(piNums[iRow][iCol]+" ");
      }
    }
    System.out.print("\nRow 2: ");
    for(iRow = 1; iRow<2; iRow++)
    {
      for(iCol = 0; iCol<3; iCol++)
      {
        System.out.print(piNums[iRow][iCol]+" ");
      }
    }
    return;
  }
}