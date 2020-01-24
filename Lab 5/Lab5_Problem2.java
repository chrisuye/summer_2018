/*
 COSC 236
 Your name:Christian Seyoum
 Description: schoalarship
 Filename:Lab5_problem2 
 Date started:6/12/2018
 Modification history:6/12/2018
 Classes: main
 */



import java.util.Scanner;

public class Lab5_Problem2 
{
  
  public static void main(String[] args)
  {
    // DECLARATIONS
    
    
    // Input-capture variables:
    int iAge;
    String sState;
    double dGpa;
    
    Scanner cin= new Scanner(System.in);
    
    System.out.print("Enter your age in years: ");
    
    iAge=cin.nextInt();
    
    
    
    
    if (iAge<18 || iAge>22) 
    {
      System.out.println("Sorry: Age must be between 18 and 22, inclusive");
    }
    else
    {
      System.out.print("Enter your two-character state abbreviation: ");
      sState=cin.next();
      sState=sState.toUpperCase();
      if (!sState.equals("MD") && !sState.equals("VA")  && !sState.equals("DE") )
      {
        System.out.println("Sorry: Valid states for this scholarship are MD, VA, and DE");
      }
      else
      {
        System.out.print("Enter your high school GPA: ");
        dGpa=cin.nextDouble();
        if (dGpa<0 || dGpa>5)
        {
          System.out.println("Sorry: GPA must be in the range 0 to 5, inclusive");
        }
        else
        {
          System.out.println("congragulations. You pre-qualify");
        }
      }
      
    }
    
  }
  
}

