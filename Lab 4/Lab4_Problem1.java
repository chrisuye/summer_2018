/*
COSC 236
Your name:Christian Seyoum
Description:Letter Grade generater
Filename:Lab4_problem1 
Date started:6/5/2018
Modification history:6/10/2018
Classes: main
*/

import java.util.Scanner;
public class Lab4_Problem1
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    

    // Input-capture variables:
    double dGrade;
   

    // Expression-result variables:
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    
    
    // INPUT
    System.out.print("Enter score: ");
    dGrade=cin.nextDouble();
    
    
    // PROCESSING AND CALCULATIONS
    if (dGrade>=0 && dGrade<=100)
    {
      if (dGrade>=95)
        System.out.println("Letter grade equivalent: A");
        else if (dGrade>=90)
          System.out.println("Letter grade equivalent: A-");
        else if (dGrade>=87)
          System.out.println("Letter grade equivalent: B+");  
        else if (dGrade>=83)
          System.out.println("Letter grade equivalent: B");   
        else if (dGrade>=80)
          System.out.println("Letter grade equivalent: B-");  
        else if (dGrade>=75)
          System.out.println("Letter grade equivalent: C+");
        else if (dGrade>=70)
          System.out.println("Letter grade equivalent: C");
        else if (dGrade>=67)
          System.out.println("Letter grade equivalent: D+");
        else if (dGrade>=63)
          System.out.println("Letter grade equivalent: D");
        else if (dGrade>=60)
          System.out.println("Letter grade equivalent: D-");
        else
          System.out.println("Letter grade equivalent: F");
    }
    else
      System.out.println("Invalid Date Entry: Range is 0 to 100");
      
    
    
    
    // OUTPUT

    
 

  }
}