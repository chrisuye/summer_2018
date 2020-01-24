/*
COSC 236
Your name:Christian Seyoum
Description:Tells the direction after a left turn
Filename:Lab3_problem4 
Date started:6/5/2018
Modification history:6/10/2018
Classes: main
*/

import java.util.Scanner;
public class Lab3_Problem4
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    int iNewHeading;

    // Input-capture variables:
    int iInitHeading;  
    int iTurn;
   

    // Expression-result variables:
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    
    
    // INPUT
    System.out.print("Enter the inital heading: ");
    iInitHeading=cin.nextInt();
    System.out.print("Enter the number of degree to turn left: ");
    iTurn=cin.nextInt();
    
    // PROCESSING AND CALCULATIONS
    iNewHeading=iInitHeading-iTurn;
    if (iNewHeading<=0)
      iNewHeading=iNewHeading+360;
    
    
    
    // OUTPUT
    System.out.println("Intital heading: "+iInitHeading);
    System.out.println("After "+iTurn+" degrees turn to the left: "+iNewHeading);
    
 

  }
}