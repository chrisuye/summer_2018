/*
 COSC 236
 Your name:Christian Seyoum
 Description:Array5
 Filename:Lab10_problem3
 Date started:6/27/2018
 Modification history:6/27/2018
 Classes: main
 */
import java.util.*;
import java.text.*;
public class Lab10_Problem5
{
  public static void main(String[] args)
  {
    
    
    
    int[] iNum = new int[30];
    int iCount;
    int iRand;
    double dMean;
    
    
    
    DecimalFormat dfMain = new DecimalFormat("#,#00.00");
    Random rand = new Random();
    for (iCount=0; iCount<30; iCount++)
    {
      iRand = rand.nextInt((500-0)+1)+0;
      iNum[iCount] = iRand;
    }
    fvLowVal(iNum);
    fvHighVal(iNum);
    dMean = fdCalcMean(iNum);
    System.out.println("Mean value: "+dfMain.format(dMean));
  }
  public static void fvLowVal( int piNum[])
  {
    int iCount;
    int iLowVal;
    iLowVal=550;
    DecimalFormat df = new DecimalFormat("$#,#00.00");
    for (iCount=0; iCount<30; iCount++)
    {
      if (piNum[iCount] < iLowVal)
      {
        iLowVal = piNum[iCount]; 
      }
    }
    System.out.println("Lowest value: "+iLowVal);
    return;
  }
  public static void fvHighVal( int piNum[])
  {
    
    int iCount;
    int iHighVal;
    iHighVal=-1;
    DecimalFormat df = new DecimalFormat("$#,#00.00");
    for (iCount=0; iCount<30; iCount++)
    {
      if (piNum[iCount] > iHighVal)
      {
        iHighVal = piNum[iCount]; 
      }
    }
    System.out.println("Highest value: "+iHighVal);
    return;
  }
  
  public static double fdCalcMean( int piNum[])
  {
    int iArrayLength;
    double dMean;
    int iSum;
    int iCount;
    
    iSum = 0;
    
    iArrayLength = piNum.length;
    
    for(iCount=0; iCount<iArrayLength; iCount++)
    {
      iSum = iSum + piNum[iCount];
    }
    
    dMean = (double)iSum/(double)iArrayLength;
    
    return dMean;
    
  }
}