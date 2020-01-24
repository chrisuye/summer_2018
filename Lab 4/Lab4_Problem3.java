/*
 COSC 236
 Your name:Christian Seyoum
 Description:Display gate and corresponding radio frequency
 Filename:Lab4_problem3 
 Date started:6/5/2018
 Modification history:6/10/2018
 Classes: main
 */

import java.util.Scanner;
public class Lab4_Problem3
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    
    
    // Input-capture variables:
    int iRadial;
    
    
    // Expression-result variables:
    Scanner cin = new Scanner(System.in);
    
    // Counter, accumulator, or flag variables:
    
    // Other variables:
    
    // Instantiations:
    
    
    // INITIALIZE VARIABLES
    
    
    // INPUT
    System.out.print("Enter radial: ");
    iRadial=cin.nextInt();
    
    
    // PROCESSING AND CALCULATIONS
    if (iRadial>=1 && iRadial<=360)
    {
      if (iRadial>=341 && iRadial<=46)
        System.out.println("Use WOOLY on 132.775");
      else if (iRadial>=47 && iRadial<119)
        System.out.println("Use PALEO on 132.775");
      else if (iRadial>=120 && iRadial<172)
        System.out.println("Use WHINO on 125.125");  
      else if (iRadial>=173 && iRadial<214)
        System.out.println("Use GRUBY on 125.125");   
      else if (iRadial>=215 && iRadial<236)
        System.out.println("Use BRV on 127.325");  
      else if (iRadial>=237 && iRadial<269)
        System.out.println("Use FLUKY on 127.325");
      else if (iRadial>=270 && iRadial<309)
        System.out.println("Use JASEN on 127.325");
      else if (iRadial>=310 && iRadial<=340)
        System.out.println("Use LUCKE on 132.775");
      else
        System.out.println("Invalid entry");
    }
    else
      System.out.println("must be between 1 and 360");
    
    
    
    
    // OUTPUT
    
    
    
    
  }
}