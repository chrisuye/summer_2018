/*
 COSC 236
 Your name:Christian Seyoum
 Description:Sorting
 Filename:Lab11_problem2
 Date started:7/6/2018
 Modification history:7/6/2018
 Classes: main
 */

import java.util.*;

public class Lab11_Problem2
{
  public static void main (String[] args)
  {
    int iArray[] = new int[10];
    fvArray(iArray,0,400);
    String sChoice;
    sChoice = fsChoice(iArray);
    
    if(sChoice.equals("A"))
      {
        fvAscending(iArray);        
        
      }
     else if (sChoice.equals("D"))
      {
        fvDescending(iArray);       
        
        
      }
  }
  
  public static void fvArray(int piArray[], int piMin, int piMax)
  {    
    int iSub;
    int iRand;
    
    Random rand = new Random();
    
    
    
    for (iSub = 0; iSub < piArray.length; iSub++)
    {
      iRand = rand.nextInt((piMax-piMin)+1)+piMin;
      piArray[iSub] = iRand;
      
          
      
    }    
    fvDisplay(piArray);
    
    
    return;
  }
  
  public static void fvDisplay(int piArray[])
  {
    int iSub;
    
    
    
    System.out.print("Native array: ");
    
    for (iSub = 0; iSub < piArray.length; iSub++)
    {
      
      System.out.print(piArray[iSub]+" ");     
      
    }    
    
    
    
    return;
  }
  public static String fsChoice(int piArray[])
  {
    String sChoice;
    
    Scanner cin = new Scanner(System.in);
    do
    { 
      
      System.out.print("\nEnter A for ascending sort, D for descending: ");
      sChoice = cin.nextLine();
      if (!sChoice.equals("A") && !sChoice.equals("D"))
      {
        System.out.println("Error: type A or D");
      }
      
    }while (!sChoice.equals("A") && !sChoice.equals("D"));
    
    return sChoice;
  }
  
  public static void fvAscending(int piArray[])
  {
    int iOuter;
    int iSub;
    int iTemp;
    int iInterchanges;
    iInterchanges=0;
    for (iOuter = 0; iOuter < piArray.length - 1; iOuter ++ )
    {     
      // Inner loop::
      for (iSub = 0; iSub < piArray.length - iOuter - 1; iSub ++)
      {
        //Compare the next two adjacent values:
        if (piArray[iSub] > piArray[iSub + 1])
        {        
          // Interchange, since they're out of ascending order:
          iTemp = piArray[iSub];
          piArray[iSub] = piArray[iSub + 1];
          piArray[iSub + 1] = iTemp;
          
          iInterchanges ++;
        }
      }
    }
    System.out.print("Sorted Ascending: ");
    for (iSub = 0; iSub < piArray.length; iSub ++)      
    {
      System.out.print(piArray[iSub]+" ");
    }
    System.out.println("\nInterchange required to sort: "+iInterchanges);
    
    return;
  }
  public static void fvDescending(int piArray[])
  {
    int iOuter;
    int iSub;
    int iTemp;
    int iInterchanges;
    iInterchanges=0;
     for (iOuter = 0; iOuter < piArray.length - 1; iOuter ++ )
    {     
      // Inner loop::
      for (iSub = 0; iSub < piArray.length - iOuter - 1; iSub ++)
      {
        //Compare the next two adjacent values:
        if (piArray[iSub] < piArray[iSub + 1])
        {        
          // Interchange, since they're out of ascending order:
          iTemp = piArray[iSub];
          piArray[iSub] = piArray[iSub + 1];
          piArray[iSub + 1] = iTemp;
          
          iInterchanges ++;
        }
      }
    }
    System.out.print("Sorted Descending: ");
    for (iSub = 0; iSub < piArray.length; iSub ++)      
    {
      System.out.print(piArray[iSub]+" ");
    }
    System.out.println("\nInterchange required to sort: "+iInterchanges);
    
    return;
  }
}
