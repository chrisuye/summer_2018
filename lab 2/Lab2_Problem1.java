/*
COSC 236
Your name:Christian Seyoum
Description:volume of cylinder
Filename:Lab2_problem1 
Date started:5/30/2018
Modification history:5/30/2018
Classes: main
*/

import java.util.Scanner;
public class Lab2_Problem1
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    // Input-capture variables:
    double dRaduis;
    double dHeight;
    double dPi;

    // Expression-result variables:
    double dVolume;
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    dPi=3.14;
    
    // INPUT
    System.out.print("Type the raduies of the cylinder and press Enter: ");
    dRaduis=cin.nextDouble();
    System.out.print("Type the height of the cylinder and press Enter: ");
    dHeight=cin.nextDouble();
    
    // PROCESSING AND CALCULATIONS
    dVolume=dPi*(dRaduis*dRaduis)*dHeight;

    
    // OUTPUT
    System.out.println("Volume for cylinder is "+dVolume);
 

  }
}