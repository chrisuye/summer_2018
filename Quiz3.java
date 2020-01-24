/*
COSC 236
Your name:Christian Seyoum
Description:cost of copies
Filename:
Date started:
Modification history:
Classes: main
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class Quiz3
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    int iCount;
    int iSum;
    double dMean;
    // Input-capture variables:
    int iScore;
    
   

    // Expression-result variables:
    Scanner cin = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,###.00");
    

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    iCount=1;
    iSum=0;
    // INPUT
    
    
    // PROCESSING AND CALCULATIONS
    while (iCount<=5)
    {
      System.out.print("Number: ");
    iScore=cin.nextInt();
    iSum=iSum+iScore;
    iCount++;      
    }
    dMean=(double)iSum/5.0;
    System.out.println("Mean: "+df.format(dMean));
    
    
    // OUTPUT

 

  }
}