/*
COSC 236
Your name:Christian Seyoum
Description:Letter Grade generater
Filename:Lab8_problem3 
Date started:6/22/2018
Modification history:6/22/2018
Classes: main
*/

import java.util.Scanner;
public class Lab8_Problem3
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
    fvGrade(dGrade);
  }
    
  //A method that recives the grade then displays the letter grade  
  public static void fvGrade(double pdGrade)
  {
    // PROCESSING AND CALCULATIONS
    if (pdGrade>=0 && pdGrade<=100)
    {
      if (pdGrade>=95)
        System.out.println("Letter grade equivalent: A");
        else if (pdGrade>=90)
          System.out.println("Letter grade equivalent: A-");
        else if (pdGrade>=87)
          System.out.println("Letter grade equivalent: B+");  
        else if (pdGrade>=83)
          System.out.println("Letter grade equivalent: B");   
        else if (pdGrade>=80)
          System.out.println("Letter grade equivalent: B-");  
        else if (pdGrade>=75)
          System.out.println("Letter grade equivalent: C+");
        else if (pdGrade>=70)
          System.out.println("Letter grade equivalent: C");
        else if (pdGrade>=67)
          System.out.println("Letter grade equivalent: D+");
        else if (pdGrade>=63)
          System.out.println("Letter grade equivalent: D");
        else if (pdGrade>=60)
          System.out.println("Letter grade equivalent: D-");
        else
          System.out.println("Letter grade equivalent: F");
    }
    else
    {
      System.out.println("Invalid Date Entry: Range is 0 to 100");
    }
    return;
  }
  
  }
