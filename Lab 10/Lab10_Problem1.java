/*
COSC 236
Your name:Christian Seyoum
Description:Array
Filename:Lab10_problem1
Date started:6/27/2018
Modification history:6/27/2018
Classes: main
*/
import java.util.*;
import java.text.*;
public class Lab10_Problem1
{
  public static void main(String[] args)
  {
    
   // double[] dSals = new double[8];
    
    //int iCount;
    /*
    dSals[0]=10700.25;
    dSals[1]=33239.00;
    dSals[2]= 33880.50;
    dSals[3]=40204.30;
    dSals[4]=45000.00;
    dSals[5]=60774.30;
    dSals[6]=136900.80;
    dSals[7]=150243.10;
    */
    
    double dSals[] = {10700.25, 33239.00, 33880.50, 40204.30, 45000.00, 60774.30 , 136900.80, 150243.10};
    
    
    /*Scanner cin = new Scanner(System.in);
     
    
    for(iCount=1 ; iCount<=8; iCount++)
    {
      System.out.print("Enter salary "+iCount+":");
      dSals[iCount-1] = cin.nextDouble();
    }*/
    
    
    //System.out.println(dSals[4]);
    fvDisplay(dSals);
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
}