/*
COSC 236
Your name:Christian Seyoum
Description:speed of a ball when it hits the ground
Filename:Lab1_problem5 
Date started:5/31/2018
Modification history:5/31/2018
Classes: main
*/
/*At what speed will a ball hit the groud when droped from a certain height?
 The program will ask for an altitude input and later will out put the speed the 
 ball will hit the ground. This progarm is concidering the ball to be in free fall and their is no 
 inital speed added to the ball.*/

import java.lang.Math.*;
import java.util.Scanner;
public class Lab1_Problem5
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    // Input-capture variables:
    double dAltitude;
    double dGravity;

    // Expression-result variables:
    double dSpeed;
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:
    dGravity=9.81;

    
    // INITIALIZE VARIABLES
    
    // INPUT
    System.out.print("Type altidude the ball is drops at in meters: ");
    dAltitude=cin.nextDouble();
    
    // PROCESSING AND CALCULATIONS
    dSpeed=Math.sqrt(2*dGravity*dAltitude);
    
    // OUTPUT
    System.out.println("The ball will hit the ground at a speed of "+dSpeed+" meters per second");
  }
}