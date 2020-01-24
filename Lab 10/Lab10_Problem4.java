/*
COSC 236
Your name:Christian Seyoum
Description:worksheet
Filename:Lab10_problem4
Date started:6/27/2018
Modification history:6/27/2018
Classes: main
*/
import java.util.*;
import java.text.*;
public class Lab10_Problem4
{
  public static void main(String[] args)
  {
    
  
    
    double dSals[] = {10700.25, 33239.00, 33880.50, 40204.30, 45000.00, 60774.30 , 136900.80, 150243.10};
    double dSum;
    double dHighestSalary;
    double dNewSalary;
    double dSumOdd;
    double dMean;
    double dSwap;

    
    DecimalFormat dfMain = new DecimalFormat("$#,#00.00");
    Scanner cin = new Scanner(System.in);
    
    //problem 6
    System.out.println("The first salary is "+dfMain.format(dSals[0]));
    
    //problem 7
    dHighestSalary = dSals[7];
    System.out.println("The highest salary is "+dfMain.format(dHighestSalary));
    
    //problem 8
    dSum= dSals[1] +dSals[2];
    System.out.println("The sum of the second and third salary is "+dfMain.format(dSum));
    
    //problem 9
    System.out.print("Enter a new salary: ");
    dNewSalary = cin.nextDouble();
    
    dSals[7] = dNewSalary;
    System.out.println("The Last salary is "+dfMain.format(dSals[7]));
    
    //problem 10
    dSumOdd = dSals[1] + dSals[3] + dSals[5] + dSals[7];
    System.out.println("The sum of the odd elements is:"+dfMain.format(dSumOdd));
    
    //problem 11
    dSals[0] = 1.2 * dSals[0];
    System.out.println("The lowest paid with a 20% pay raise: "+dfMain.format(dSals[0]));
    
    //problem 12
    dSals[7] = dSals[7] - (5000.00);
    System.out.println("The highest paid with a 5000 pay cut: "+dfMain.format(dSals[7]));
    
    //Problem 13
    if  (dSals[3] > dSals[4])
    {
      System.out.println("The Highest value is the fourth salary");
    }
    else if (dSals[4] > dSals[3])
    {
      System.out.println("The Highest value is the fifth salary");
    }
    else
    {
      System.out.println("The fourth and fifth value are equal");
    }
    
    //problem 14
    dSwap = dSals[2];
    dSals[2] = dSals[4];
    dSals[4] = dSwap;
    System.out.println("The third salary is "+dfMain.format(dSals[2]));
    System.out.println("The fifth salary is "+dfMain.format(dSals[4]));
    
    fvDisplay(dSals);

  }
  public static void fvDisplay(double pdSals[])
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