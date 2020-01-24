/*
COSC 236
Your name:Christian Seyoum
Description:shows what happens when comparing floating-point
Filename:Lab3_problem5 
Date started:6/5/2018
Modification history:6/10/2018
Classes: main
*/

import java.util.Scanner;
public class Lab3_Problem5
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    // Input-capture variables:
    double dCalculatedSum;
    double dActualSum;
    double dDifference;

    // Expression-result variables:
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    dCalculatedSum=.1+.2+.3;
    dActualSum=.6;
    dDifference=dCalculatedSum-dActualSum;
    // INPUT
    // PROCESSING AND CALCULATIONS
    

    
    // OUTPUT
    System.out.println("Calculated sum: "+dCalculatedSum);
    System.out.println("Actual sum: "+dActualSum);
    System.out.println("Calculated sum -actual sum: "+dDifference);
    
    if (dCalculatedSum==dActualSum)
      System.out.println("The comparison evaluates to Equal using ==");
    else
    {
      System.out.println("The comparison evaluates to Not Equal using ==");
    }
    if (bEquals(dCalculatedSum, dActualSum, .001) == true)
      System.out.println("The values fall within the acceptable epsilon for near equality ");
    else
      System.out.println("The values fall outside the acceptable epsilon for near equality");
  }
  // A method to determine if two values of data type double are 
  // nearly equal with a user-defined epsilon:
  public static boolean bEquals(double pdVal1, double pdVal2, double pdEpsilon)  
  {
    // Declare a variable to store the return value to be passed 
    // back to the calling method:
    boolean bReturnValue;
    
    // If it evaluates to truly equal, the outcome is true:
    if (pdVal1 == pdVal2)
    {
      bReturnValue = true;
    }
    // Test for being within an acceptable range of error; if within,
    // the outcome is also true:
    else if (Math.abs(pdVal1 - pdVal2) < pdEpsilon)
    {
      bReturnValue = true;
    }
    else
    {
      // It is neither truly equal or acceptably within range; return false:
      bReturnValue = false;
    }
    
    // Return the boolean outcome to the calling method:
    return bReturnValue;
  } // The METHOD’s closing brace
} // The CLASS’ closing brace

  


