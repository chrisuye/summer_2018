/*
COSC 236
Your name:Christian Seyoum
Description:toggles a given letter
Filename:Lab4_problem5 
Date started:6/5/2018
Modification history:6/10/2018
Classes: main
*/
import java.util.Scanner;

public class Lab4_Problem5
{
  
  public static void main(String []args)
  {
    // DECLARATIONS
    char cLetter1;
    
    // Input-capture variables:
    String sLetter;
    
    // Expression-result variables:
    Scanner cin=new Scanner(System.in);
    // Counter, accumulator, or flag variables:
    
    // Other variables:
    
    // Instantiations:
    
    
    // INITIALIZE VARIABLES
    
    
    // INPUT
    System.out.println("Type a single character and press Enter: ");
    sLetter=cin.next();
    cLetter1=sLetter.charAt(0);
    // PROCESSING AND CALCULATIONS
    if(Character.isDigit(cLetter1))
      System.out.println("Digit: Yes");
   
    else
      System.out.println("Digit: No");
    
    if(Character.isLetter(cLetter1))
    { System.out.println("Letter: Yes");
      System.out.print("Lowercase: ");
      

      if(Character.isLowerCase(cLetter1))
      { System.out.println("Yes");
        System.out.print("Toggle case :");
        System.out.println(Character.toUpperCase(cLetter1));
      }
      

      else
      {
        System.out.println("No");
        System.out.print("Toggle case :");
        System.out.println(Character.toLowerCase(cLetter1));
      }
      // OUTPUT
    }
    
  }
}