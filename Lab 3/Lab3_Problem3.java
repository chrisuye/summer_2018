/*
COSC 236
Your name:Christian Seyoum
Description:payment for hourly work
Filename:Lab3_problem3 
Date started:6/5/2018
Modification history:6/10/2018
Classes: main
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab3_Problem3
{
  public static void main(String[] args)
  {
    // DECLARATIONS
    double dOverTime;
    double dOverTimeGross;
    double dGrossPay;
    double dTotalGrossPay;
    // Input-capture variables:
    double dHours;
    double dHourRate;
   

    // Expression-result variables:
    Scanner cin = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();
    df.setMaximumFractionDigits(2);

    // Counter, accumulator, or flag variables:

    // Other variables:

    // Instantiations:

    
    // INITIALIZE VARIABLES
    dOverTime=0;
    dOverTimeGross=0;
    
    // INPUT
    System.out.print("Enter regular hourly pay rate: ");
    dHourRate=cin.nextDouble();
    System.out.print("Enter total hours worked: ");
    dHours=cin.nextDouble();
    
    // PROCESSING AND CALCULATIONS
    if (dHours<=40)
    {
      dGrossPay=dHours*dHourRate;
    }
    else
    {
      dOverTime=dHours-40;
      dOverTimeGross=dOverTime*(dHourRate*1.5);
      dGrossPay=40*dHourRate;
    }
    dTotalGrossPay=dGrossPay+dOverTimeGross;

    
    
    // OUTPUT
    
    System.out.println("Total hours worked: "+df.format(dHours));
    System.out.println("Overtime hours worked: "+df.format(dOverTime));
    System.out.println("Regular pay rate: $"+df.format(dHourRate));
    System.out.println("Overtime pay rate: $"+df.format(dHourRate*1.5));
    System.out.println("Regular gross pay: $"+df.format(dGrossPay));
    System.out.println("Overtime gross pay: $"+df.format(dOverTimeGross));
    System.out.println("Total gross pay: $"+df.format(dTotalGrossPay)); 

 

  }
}