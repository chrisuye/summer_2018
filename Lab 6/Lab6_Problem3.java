/*
 COSC 236
 Your name:Christian Seyoum
 Description: subtotal, total, and tax
 Filename:Lab6_problem3 
 Date started:6/15/2018
 Modification history:6/15/2018
 Classes: main
 */


import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Lab6_Problem3 
{
  
  public static void main(String[] args)
  {
    // DECLARATIONS
    int iCount;
    int iItems;
    
    // Input-capture variables:
    double dCost;
    double dSubTotal;
    double dTax;
    double dTotal;
    //declaration
    dCost=0;
    iCount=1;
    dSubTotal=0;
    Scanner cin= new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("$#,##0.00");

  
    while ( dCost>=0)
    {
     
      System.out.print("Enter item "+iCount+" cost, negative to quit:");
      dCost=cin.nextDouble();
      dSubTotal=dSubTotal+dCost;
      iCount++;
    }
    dSubTotal=dSubTotal-dCost;
    iItems = iCount-2;
    dTax=dSubTotal*.15;
    dTotal=dSubTotal+dTax;
    System.out.println("Items: "+iItems);
   System.out.println("Subtotal: "+df.format(dSubTotal)); 
   System.out.println("Sales tax: "+df.format(dTax)); 
   System.out.println("Total: "+df.format(dTotal)); 
  }
  
}



