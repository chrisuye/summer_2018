/*
COSC 236
Your name:Christian Seyoum
Description:Basic arithmetics 
Filename:Lab1_problem2 
Date started:5/30/2018
Modification history:5/30/2018
Classes: main
*/


import java.util.Scanner;
public class Lab1_Problem2
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    // Input-capture variables:
    double dValue1;
    double dValue2;

    // Expression-result variables:
    double dSum;
    double dProduct;
    double dDifference;
    double dQoutient;
    double dSquared;
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    
    // INPUT
    System.out.print("Type the first value and press Enter: ");
    dValue1=cin.nextDouble();
    System.out.print("Type the secound value and press Enter: ");
    dValue2=cin.nextDouble();
    
    // PROCESSING AND CALCULATIONS
    dSum=dValue1+dValue2;
    dProduct=dValue1*dValue2;
    dDifference=dValue1-dValue2;
    dQoutient=dValue1/dValue2;
    dSquared=dValue1*dValue1;
    
    // OUTPUT
    System.out.println("The sum of "+dValue1+" and "+dValue2+" is "+dSum);
    System.out.println("The product of "+dValue1+" and "+dValue2+" is "+dProduct);
    System.out.println("The qoutient of "+dValue1+" and "+dValue2+" is "+dQoutient);
    System.out.println("The difference of "+dValue1+" and "+dValue2+" is "+dDifference);
    System.out.println("The square of "+dValue1+" is "+dSquared);

  }
}