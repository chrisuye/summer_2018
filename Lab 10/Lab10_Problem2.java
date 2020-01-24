/*
COSC 236
Your name:Christian Seyoum
Description:Array2
Filename:Lab10_problem2
Date started:6/27/2018
Modification history:6/27/2018
Classes: main
*/
import java.util.*;
import java.text.*;
public class Lab10_Problem2
{
  public static void main(String[] args)
  {
    
  
    
    double dSals[] = {10700.25, 33239.00, 33880.50, 40204.30, 45000.00, 60774.30 , 136900.80, 150243.10};
    double dSum;
    
    DecimalFormat dfSum = new DecimalFormat("$#,#00.00");
    fvDisplay(dSals);
    dSum = fdSum(dSals);
    System.out.println("Total of 8 salaries: "+dfSum.format(dSum));
  }
  public static void fvDisplay( double pdSals[])
  {
    int iCount;
    DecimalFormat df = new DecimalFormat("$#,#00.00");
    for (iCount=1; iCount<=8; iCount++)
    {
      System.out.println("Salary "+iCount+": "+df.format(pdSals[iCount-1]));
    }
    return;
  }
  public static Double fdSum( double pdSals[])
  {
    int iCount;
    int iElementCount;
    
    double dSum;
    double dMean;
    
    dSum=0.00;
    iElementCount=0;
    
    for(iCount=0; iCount<8; iCount++)
    {
      dSum = dSum + pdSals[iCount];
      
      iElementCount++;
    }
    
    dMean= dSum/iElementCount;
    
    return dSum;
  }
}