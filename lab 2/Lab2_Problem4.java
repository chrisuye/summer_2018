/*
COSC 236
Your name:Christian Seyoum
Description:Cost of pizza per square inch 
Filename:Lab2_problem4 
Date started:5/31/2018
Modification history:5/31/2018
Classes: main
*/

/* This program will calculate the dimensions of 
 a square base cylinder, by having the surface area and volume as input*/
import java.lang.Math.*;
import java.util.Scanner;
public class Lab2_Problem4
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    // Input-capture variables:
    double dVolume;
    double dSurfaceArea;

    // Expression-result variables:
    double dLength;
    double dHeight;
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    
    // INPUT
    System.out.print("Enter the volume needed: ");
    dVolume=cin.nextDouble();
    System.out.print("Enter the surface area: ");
    dSurfaceArea=cin.nextDouble();
    
    
    // PROCESSING AND CALCULATIONS
    dLength=Math.sqrt(dSurfaceArea);
    dHeight=dVolume/dLength;
    

    
    // OUTPUT
    System.out.println("Volume: "+dVolume);
    System.out.println("Surface Area: "+dSurfaceArea);
    System.out.println("Lenght: "+dLength);
    System.out.println("Height: "+dHeight);
 

  }
}