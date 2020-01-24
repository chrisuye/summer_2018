/*
COSC 236
Your name:Christian Seyoum
Description:Volume of swimming pool 
Filename:Lab1_problem4 
Date started:5/30/2018
Modification history:5/30/2018
Classes: main
*/


import java.util.Scanner;

 

public class Lab1_Problem4

{

 

  public static void main(String[] args)

  {

    // DECLARATIONS

   

    // Input-capture variables:
    
    double dLengthWell;

    double dDepthWell;

    double dLengthMain;

    double dWidthMain;

    double dDepthMain;

   

    // Expression-result variables:
    double dCubicFeetMain;
    double dCubicFeetWell;
    double dCubicFeetTotal;

   

    // Counter, accumulator, or flag variables:

   

    // Other variables:

 

    // Instantiations:

    Scanner cin = new Scanner(System.in);

 

    // INITIALIZE VARIABLES

   

    // INPUT

    System.out.print("Enter length of the main pool in feet: ");

    dLengthMain = cin.nextDouble();

    System.out.println();

   

    System.out.print("Enter width of the main pool in feet: ");

    dWidthMain = cin.nextDouble();

    System.out.println();

   

    System.out.print("Enter depth of the main pool in feet: ");

    dDepthMain = cin.nextDouble();

    System.out.println();
    
    System.out.print("Enter length of the diving well in feet: ");

    dLengthWell = cin.nextDouble();

    System.out.println();

   

    System.out.print("Enter depth of the diving well in feet: ");

    dDepthWell = cin.nextDouble();

    System.out.println();

   

    // PROCESSING AND CALCULATIONS
    dCubicFeetMain = dLengthMain * dWidthMain * dDepthMain;
    dCubicFeetWell = dLengthWell * dWidthMain * dDepthWell;
    dCubicFeetTotal = dCubicFeetMain+dCubicFeetWell;

   

    // OUTPUT

    System.out.println("Volume in cubic feet for main pool: " + dCubicFeetMain + " cubic feet");

    System.out.println();
    System.out.println("Volume in cubic feet for diving well: " + dCubicFeetWell + " cubic feet");

    System.out.println();
    System.out.println("Total volume in cubic feet: " + dCubicFeetTotal + " cubic feet");

    System.out.println();

  }

}