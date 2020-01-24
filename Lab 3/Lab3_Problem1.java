/*
COSC 236
Your name:Christian Seyoum
Description:The program will tell you if the number is equal to zero
Filename:Lab3_problem1 
Date started:6/5/2018
Modification history:6/10/2018
Classes: main
*/

import java.util.Scanner;
public class Lab3_Problem1
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    // Input-capture variables:
    //int iValue;
    double dValue;

    // Expression-result variables:
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    
    // INPUT
    //System.out.print("Enter an integer value: ");
    System.out.print("Enter an any value: ");
    //iValue=cin.nextInt();
    dValue=cin.nextDouble();
    
    // PROCESSING AND CALCULATIONS
    //if (iValue==0)
    if (Math.abs(dValue-0) < 0.0001)
      System.out.println("Equal to 0");
    else
      System.out.println("Not Equal to 0");

    
    
    // OUTPUT

 

  }
}