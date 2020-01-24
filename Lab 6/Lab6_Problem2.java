/*
 COSC 236
 Your name:Christian Seyoum
 Description: total, subtotal and tax
 Filename:Lab6_problem2 
 Date started:6/15/2018
 Modification history:6/15/2018
 Classes: main
 */


import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Lab6_Problem2 
{
  
  public static void main(String[] args)
  {
    // DECLARATIONS
    int iCount;
    
    // Input-capture variables:
    double dCost;
    double dSubTotal;
    double dTax;
    double dTotal;
    //declaration
    iCount=1;
    dSubTotal=0;
    Scanner cin= new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("$#,##0.00");

  
    while ( iCount<=3)
    {
     
      System.out.print("Enter item "+iCount+" cost:");
      dCost=cin.nextDouble();
      dSubTotal=dSubTotal+dCost;
      iCount++;
    }
    dTax=dSubTotal*.15;
    dTotal=dSubTotal+dTax;
   System.out.println("Subtotal: "+df.format(dSubTotal)); 
   System.out.println("Sales tax: "+df.format(dTax)); 
   System.out.println("Total: "+df.format(dTotal)); 
  }
  
}



