/*
COSC 236
Your name:Christian Seyoum
Description:gives name of elements from the second row
Filename:Lab8_problem4 
Date started:6/22/2018
Modification history:6/22/2018
Classes: main
*/

import java.util.Scanner;
public class Lab8_Problem4
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    
    

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
        
    fbElement(sSymbol);
    
  }
  //A method that recives that chemical symbol then
  //displays the Element name
  public static boolean fbElement(String psSymbol) 
  {
      String sElement;
   if (psSymbol.length() == 1 || psSymbol.length() == 2)
    {
      switch (psSymbol)
      {
        case "Li":
               sElement = "Lithium";
               System.out.println("Symbol: "+psSymbol+" Element: "+sElement);
               break;
           case "Be":
               sElement = "Berillium";
               System.out.println("Symbol: "+psSymbol+" Element: "+sElement);
               break;
           case "B":
               sElement = "Boron";      
               System.out.println("Symbol: "+psSymbol+" Element: "+sElement);
               break;
           case "C":
               sElement = "Carbon";
               System.out.println("Symbol: "+psSymbol+" Element: "+sElement);
               break;
           case "N":
               sElement = "Nitrogen";
               System.out.println("Symbol: "+psSymbol+" Element: "+sElement);
               break;
           case "O":
               sElement = "Oxygen";
               System.out.println("Symbol: "+psSymbol+" Element: "+sElement);
               break;
           case "F":
               sElement = "Flourine";
               System.out.println("Symbol: "+psSymbol+" Element: "+sElement);
               break;
           case "Ne":
               sElement = "Neon";  
               System.out.println("Symbol: "+psSymbol+" Element: "+sElement);
               break;
           default:
               System.out.println("Invalid symbol or symbol not found in Row 2");
               break;
        
          
    }
    }
    else
    {
      System.out.println("Invalid Date Entry: length must be 1 or 2"); 
    }
    return true;
  }
}