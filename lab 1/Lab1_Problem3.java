/*
COSC 236
Your name:Christian Seyoum
Description:Descent profile of an airplane
Filename:Lab1_problem3 
Date started:5/30/2018
Modification history:5/30/2018
Classes: main
*/


import java.util.Scanner;
public class Lab1_Problem3
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    // Input-capture variables:
    double dAltitude;
    double dHorizontalSpeed;

    // Expression-result variables:
    double dTime;
    double dHorizontalDistance;
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    
    // INPUT
    System.out.print("Type altidude in feets and press Enter: ");
    dAltitude=cin.nextDouble();
    System.out.print("Type horizontal speed in knots and press Enter: ");
    dHorizontalSpeed=cin.nextDouble();
    
    // PROCESSING AND CALCULATIONS
    dTime=(dAltitude-1000)/500;
    dHorizontalDistance= dHorizontalSpeed*.0192*dTime;
    
    // OUTPUT
    System.out.println("Minutes needed to descend from "+dAltitude+" to 1000 is "+dTime);
    System.out.println("Distance to begin descent on a ground speed of "+dHorizontalSpeed+" knots is "+dHorizontalDistance);
  }
}