/*
COSC 236
Your name:Christian Seyoum
Description:cost of copies
Filename:Lab3_problem2 
Date started:6/5/2018
Modification history:6/10/2018
Classes: main
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab3_Problem2
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    double dCost;
    int iCopiesOver50;
    // Input-capture variables:
    int iCopies;
   

    // Expression-result variables:
    Scanner cin = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(2);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    
    // INPUT
    System.out.print("Enter the number of copies: ");
    iCopies=cin.nextInt();
    
    // PROCESSING AND CALCULATIONS
    if (iCopies<=50)
    {
      dCost=iCopies*.07;
      System.out.println("The price is: $"+df.format(dCost));
    }
    else
    {
      iCopiesOver50=iCopies-50;
      dCost=(50*.07)+(iCopiesOver50*.04);
      System.out.println("The price is: $"+df.format(dCost));
    }

    
    
    // OUTPUT

 

  }
}