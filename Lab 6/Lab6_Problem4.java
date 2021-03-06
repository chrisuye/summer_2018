/*
 COSC 236
 Your name:Christian Seyoum
 Description: mean Ph
 Filename:Lab6_problem4
 Date started:6/15/2018
 Modification history:6/15/2018
 Classes: main
 */


import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Lab6_Problem4 
{
  
  public static void main(String[] args)
  {
    // DECLARATIONS
    int iCount;
    int iSample;
    
    // Input-capture variables:
    double dPh;
    double dPhTotal;
    double dPhMean;
    //declaration
    dPh=0;
    iCount=1;
    dPhTotal=0;
    Scanner cin= new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,##0.00");
    
    System.out.print("Enter the number of samples:");
    iSample=cin.nextInt();

  
    if (iSample>=2 && iSample<=100)
    {
    while ( iCount<=iSample)
    {
     
      System.out.print("Sample "+iCount+":");
      dPh=cin.nextDouble();
      dPhTotal=dPhTotal+dPh;
      iCount++;
    }
    dPhMean=dPhTotal/(double)iSample;

    System.out.println("Mean pH: "+df.format(dPhMean));
   
  }
    else
    {
      System.out.println("Error: valid range is 2 to 100");
    }
  }
  
}



