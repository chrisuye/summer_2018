/*
COSC 236
Your name:Christian Seyoum
Description:dettermine if a number is int, square root number, cube number and tell if its odd or even
Filename:Lab4_problem6 
Date started:6/5/2018
Modification history:6/10/2018
Classes: main
*/

import java.text.DecimalFormat;
import java.lang.Math.*;
import java.util.Scanner;
public class Lab4_Problem6
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    // Input-capture variables:
    int iNum;

    // Expression-result variables:
    Scanner cin = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(3);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    
    // INPUT
    System.out.print("Enter a numeric integer value: ");
    
    
    // PROCESSING AND CALCULATIONS
    if (cin.hasNextInt())
    {
      iNum=cin.nextInt();
      System.out.println("Square root: "+df.format(Math.sqrt(iNum)));
      System.out.println("Rased to the power of 3: "+Math.pow(iNum,3));
      if ((iNum%2)!=1)
        System.out.println("Even");
      else
        System.out.println("Odd");
    }
    else
      System.out.println("Error: must be an integer value.");

    
    // OUTPUT
    

  }
}