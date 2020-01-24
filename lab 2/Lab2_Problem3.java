/*
COSC 236
Your name:Christian Seyoum
Description:Cost of pizza per square inch 
Filename:Lab2_problem3 
Date started:5/30/2018
Modification history:5/30/2018
Classes: main
*/


import java.lang.Math.*;
import java.util.Scanner;
public class Lab2_Problem3
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    // Input-capture variables:
    double dDiameterPizza;
    double dCostPizza;

    // Expression-result variables:
    double dSurfaceArea;
    double dCostPerArea;
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    
    // INPUT
    System.out.print("Cost: ");
    dCostPizza=cin.nextDouble();
    System.out.print("Diameter in inches: ");
    dDiameterPizza=cin.nextDouble();
    
    
    // PROCESSING AND CALCULATIONS
    dSurfaceArea=Math.PI*(dDiameterPizza*dDiameterPizza)/4;
    dCostPerArea=dCostPizza/dSurfaceArea;

    
    // OUTPUT
    System.out.println("Cost: "+dCostPizza);
    System.out.println("Diameter: "+dDiameterPizza);
    System.out.println("Square inches: "+dSurfaceArea);
    System.out.println("Cost per square inch: "+dCostPerArea);
 

  }
}