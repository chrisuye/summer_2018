/*
 COSC 236
 Your name:Christian Seyoum
 Description: invitation
 Filename:Lab5_problem1 
 Date started:6/12/2018
 Modification history:6/12/2018
 Classes: main
 */



import java.util.Scanner;

public class Lab5_Problem1 
{
  
  public static void main(String[] args)
  {
    // DECLARATIONS
    
    
    // Input-capture variables:
    String sIn;
    Scanner cin= new Scanner(System.in);
    
    System.out.print("Are you available March 10? Y or N: ");
    
    sIn=cin.nextLine();
    sIn=sIn.toUpperCase();
    
    
    
    
    if (sIn.equals("Y")) 
    {
      System.out.print("Are you 18 or older? Y or No: ");
      sIn=cin.nextLine();
      sIn=sIn.toUpperCase();
      if (sIn.equals("Y"))
      {
        System.out.print("Are you married? Y or N: ");
        sIn=cin.nextLine();
        sIn=sIn.toUpperCase();
        if(sIn.equals("Y"))
        {
          System.out.println("Congratulations. You are eligible.");
        }
        else if(sIn.equals("N"))
        {
          System.out.println("Sorry. You are not eligible");
        }
        else
        {
          System.out.println("Error: Invalid response. Y or N is required");
        }
      }
      else if(sIn.equals("N"))
      {
        System.out.println("Sorry. You are not eligible");
      }
      else
      {
        System.out.println("Error: Invalid response. Y or N is required");
      }
    }
    else if(sIn.equals("N"))
    {
      System.out.println("Sorry. You are not eligible");
    }
    else
    {
      System.out.println("Error: Invalid response. Y or N is required");
      
    }
    
  }
  
}

