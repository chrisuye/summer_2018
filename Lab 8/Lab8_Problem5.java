/*
 COSC 236
 Your name:Christian Seyoum
 Description:Display gate and corresponding radio frequency
 Filename:Lab8_problem5 
 Date started:6/22/2018
 Modification history:6/22/2018
 Classes: main
 */

import java.util.Scanner;
public class Lab8_Problem5
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    
    
    // Input-capture variables:
    int iRadial;
    
    
    iRadial = fiRadial(0);
    fvRadial(iRadial);
    
  }
  //A method that prompts and gets the radial
  //then return the radial
  public static int fiRadial (int piRadial)
  {
    Scanner cin = new Scanner(System.in);
    System.out.print("Enter radial: ");
    piRadial=cin.nextInt();
    return piRadial;
  }
  //A methoid that gets the radial then displays the radio frequency 
  public static void fvRadial (int piRadial)
  {
    if (piRadial>=1 && piRadial<=360)
    {
      if (piRadial>=341 && piRadial<=46)
        System.out.println("Use WOOLY on 132.775");
      else if (piRadial>=47 && piRadial<119)
        System.out.println("Use PALEO on 132.775");
      else if (piRadial>=120 && piRadial<172)
        System.out.println("Use WHINO on 125.125");  
      else if (piRadial>=173 && piRadial<214)
        System.out.println("Use GRUBY on 125.125");   
      else if (piRadial>=215 && piRadial<236)
        System.out.println("Use BRV on 127.325");  
      else if (piRadial>=237 && piRadial<269)
        System.out.println("Use FLUKY on 127.325");
      else if (piRadial>=270 && piRadial<309)
        System.out.println("Use JASEN on 127.325");
      else if (piRadial>=310 && piRadial<=340)
        System.out.println("Use LUCKE on 132.775");
      else
      {
        System.out.println("Invalid entry");
      }
    }
    else
    {
      System.out.println("must be between 1 and 360");
    } 
    return;
  }
}