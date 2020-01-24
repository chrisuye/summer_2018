/*
COSC 236
Your name:Christian Seyoum
Description:cost of crops loss 
Filename:Lab2_problem2 
Date started:5/30/2018
Modification history:5/30/2018
Classes: main
*/

import java.util.Scanner;
public class Lab2_Problem2
{
  public static final double dPI = 3.14159;
  public static void main(String[] args)
  {
    // DECLARATIONS
    // Input-capture variables:
    double dDiameter;

    // Expression-result variables:
    double dSquareFeet;
    double dAcres;
    double dCropLoss;
    double dDollarLoss;
    double dNumberBushel;
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    
    // INPUT
    System.out.print("Enter crop circle diameter in feet: ");
    dDiameter=cin.nextDouble();
    
    // PROCESSING AND CALCULATIONS
    /* http://farmdocdaily.illinois.edu/2017/10/expectations-for-corn-and-soybean-prices.html
     https://www.reference.com/food/much-ear-corn-weigh-cca0e6a0ba5c6abe
     https://www.unc.edu/~rowlett/units/scales/bushels.html
     I have used the above web sites to find the price of a bushel of corn
     , how much corn is in a bushel and the amount of corn that grows in 
     an acre of land*/

    dSquareFeet=(dPI*dDiameter*dDiameter)/4;
    dAcres=dSquareFeet/43560;
    dCropLoss=dAcres*30000;
    dNumberBushel=(dCropLoss*1.5)/70;
    dDollarLoss=3.36*dNumberBushel;
    
    
    // OUTPUT
    System.out.println("Crop circle diameter: "+dDiameter);
    System.out.println("Square feet: "+dSquareFeet);
    System.out.println("Acres: "+dAcres);
    System.out.println("Estimated crop plants damaged: "+dCropLoss);
    System.out.println("Estimated number of bushels lost: "+dNumberBushel);
    System.out.println("Estimated dollar loss: "+dDollarLoss);
 

  }
}