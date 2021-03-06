/*
COSC 236
Your name:Christian Seyoum
Description:gives name of elements from the second row
Filename:Lab4_problem2 
Date started:6/5/2018
Modification history:
Classes: main
*/

import java.util.Scanner;
public class Lab4_Problem2
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    String sElement;
    

    // Input-capture variables:
    String sSymbol;
   

    // Expression-result variables:
    Scanner cin = new Scanner(System.in);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    
    
    // INPUT
    System.out.print("Enter the chemical symbol of a Row 2 element: ");
    sSymbol=cin.nextLine();
    
    
    // PROCESSING AND CALCULATIONS
    if (sSymbol.length() == 1 || sSymbol.length() == 2)
    {
      switch (sSymbol)
      {
        case "Li":
               sElement = "Lithium";
               System.out.println("Symbol: "+sSymbol+" Element: "+sElement);
               break;
           case "Be":
               sElement = "Berillium";
               System.out.println("Symbol: "+sSymbol+" Element: "+sElement);
               break;
           case "B":
               sElement = "Boron";      
               System.out.println("Symbol: "+sSymbol+" Element: "+sElement);
               break;
           case "C":
               sElement = "Carbon";
               System.out.println("Symbol: "+sSymbol+" Element: "+sElement);
               break;
           case "N":
               sElement = "Nitrogen";
               System.out.println("Symbol: "+sSymbol+" Element: "+sElement);
               break;
           case "O":
               sElement = "Oxygen";
               System.out.println("Symbol: "+sSymbol+" Element: "+sElement);
               break;
           case "F":
               sElement = "Flourine";
               System.out.println("Symbol: "+sSymbol+" Element: "+sElement);
               break;
           case "Ne":
               sElement = "Neon";  
               System.out.println("Symbol: "+sSymbol+" Element: "+sElement);
               break;
           default:
               System.out.println("Invalid symbol or symbol not found in Row 2");
               break;
        
          
    }
    }
    else
      System.out.println("Invalid Date Entry: length must be 1 or 2");
      
    
    
    
    // OUTPUT

    
 

  }
}