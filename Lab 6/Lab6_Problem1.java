/*
 COSC 236
 Your name:Christian Seyoum
 Description: mililitter to gram
 Filename:Lab6_problem1 
 Date started:6/12/2018
 Modification history:6/12/2018
 Classes: main
 */


import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Lab6_Problem1 
{
  
  public static void main(String[] args)
  {
    // DECLARATIONS
    fvFor(100.00,2000.00);
    fvWhile(100.00, 2000.00);
    
    // Input-capture variables:
    
    
  }
  public static void fvFor(double dMil, double dCount)
  {
    double dGram;
    DecimalFormat df= new DecimalFormat("#,##0.00");
    
    for (dMil=100.00; dMil<=dCount; dMil=dMil+100.00)
    {
      dGram = (dMil*3.00)/100.00;
      System.out.println(df.format(dMil)+" milliliters: "+df.format(dGram)+" grams");
    }
    
  }
  public static void fvWhile(double dMil, double dCount)
  {
    while ( dMil<=dCount)
    {
      double dGram;
      DecimalFormat df= new DecimalFormat("#,##0.00");
      dGram = (dMil*3.00)/100.00;
      System.out.println(df.format(dMil)+" milliliters: "+df.format(dGram)+" grams");
      dMil=dMil+100.00;
    }
  }
  
}



