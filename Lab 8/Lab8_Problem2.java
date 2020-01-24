/*
 COSC 236
 Your name:Christian Seyoum
 Description: Number
 Filename:Lab8_problem2
 Date started:6/22/2018
 Modification history:6/22/2018
 Classes: main
 */
import java.util.*;
public class Lab8_Problem2
{
  
  public static void main(String args[]) 
  {
    double dNum;
    double MinRand;
    double MaxRand;
    dNum = fdNumRand(0.0);
    if (dNum==0)
    {
      System.out.println("Goodbye");
    }
    else
    {
    MinRand = fdMinRand(0);
    if (MinRand<0)
    {
     System.out.println("Goodbye"); 
    }
    else 
    {
      MaxRand = fdMaxRand(0.0);
      if (MaxRand<0.0)
      {
        System.out.println("Goodbye");
      }
      else
      {
       fvRand(dNum,MinRand,MaxRand); 
      }
    }
    }
    
    
    

  }
  public static Double fdNumRand(Double pdNum)
  {
    Scanner cin=new Scanner(System.in);
    System.out.print("How many random integers do you want? (1 to 200, or 0 to quit");
    pdNum= cin.nextDouble();
    while (pdNum<0 || pdNum>200)
    {
      System.out.println("Error");
      System.out.print("How many random integers do you want? (1 to 200, or 0 to quit");
    pdNum= cin.nextDouble();
    }
    return pdNum;
  }
  public static double fdMinRand(double pdMinRand)
  {
    Scanner cin=new Scanner(System.in);
    System.out.print("Minimum acceptable value, inclusive:");
    pdMinRand=cin.nextDouble();
    
    return pdMinRand;
  }
  public static double fdMaxRand(double pdMaxRand)
  {
    
    Scanner cin=new Scanner(System.in);
    System.out.print("Maximum acceptable value, inclusive:");
    pdMaxRand= cin.nextInt();
    
    return pdMaxRand;
  }
  public static void fvRand(double pdNum, double pdMinRand, double pdMaxRand)
  {
    double dRand;
    int iCount;
    iCount=1;
    Random rand = new Random();
    System.out.println("Here are your "+pdNum+" random numbers from "+pdMinRand+" to " +pdMaxRand);
    while (iCount<=pdNum)
    {
    dRand = rand.nextDouble((pdMaxRand-pdMinRand)+1.0)+pdMinRand;

    System.out.println(iRand);
    iCount++;
    }
    
    
    return ;
  }
}