/*
COSC 236
Your name:Christian Seyoum
Description:Shifting
Filename:Lab11_problem1
Date started:7/6/2018
Modification history:7/6/2018
Classes: main
*/

import java.util.*;

public class Lab11_Problem1
{
  public static void main (String[] args)
  {
    int iSub;
    int iArray[] = {47,93,108,173,4,38,62,87,19,11};
    String sShift;
    
    Scanner cin = new Scanner(System.in);
    System.out.print("Native order: ");
    for(iSub = 0; iSub < iArray.length; iSub++)
    {
      System.out.print(iArray[iSub]+" ");
    }
    
    do
    { 
      
      System.out.print("\nEnter L for left Shift, R for right shift, Q to quit: ");
      sShift = cin.nextLine();
      if(sShift.equals("L"))
      {
        fvLeftShift(iArray,sShift);
        System.out.print("Left shift: ");
        
        for(iSub = 0; iSub < iArray.length; iSub++)
        {
          System.out.print(iArray[iSub]+" ");
        }
        
      }
      else if (sShift.equals("R"))
      {
        fvRightShift(iArray,sShift);
        
        System.out.print("Right shift: ");
        
        for(iSub = 0; iSub < iArray.length; iSub++)
        {
          System.out.print(iArray[iSub]+" ");
        }
        
      }
      else if(!sShift.equals("R") && !sShift.equals("L") && !sShift.equals("Q"))
      {
        System.out.println("Error: type L, R, or Q ");
      }
      
    }while (!sShift.equals("Q"));
  }
  
  public static void fvLeftShift(int piArray[], String psShift)
  {
    int iTemp;
    int iSub;
    
    iTemp = piArray[0];
    
    for (iSub = 0; iSub < (piArray.length-1); iSub++)
    {
      piArray[iSub] = piArray[iSub+1];
    }
    
    piArray[piArray.length-1] = iTemp;
    
    return;
  }
  
  public static void fvRightShift(int piArray[], String psShift)
  {
    int iTemp;
    int iSub;
    
    iTemp = piArray[piArray.length-1];
    
    for (iSub = (piArray.length-1); iSub > 0 ; iSub--)
    {
      piArray[iSub] = piArray[iSub-1];
    }
    
    piArray[0] = iTemp;
    
    return;
  }
}
