/*
 COSC 236
 Your name:Christian Seyoum
 Description: Number row and col
 Filename:Lab7_problem5
 Date started:6/22/2018
 Modification history:6/22/2018
 Classes: main
 */
import java.util.*;

public class Lab7_Problem5
{
  
  public static void main(String args[]) 
  {
    double df;
    
    // Declarations:
    
    int iSets;  // Loop counter for sets (1 to 5)
    iSets=1;
    fvSet(iSets);
  }
  public static void fvSet(int piSets)
  {
    int iCounter;  // Loop counter for within-sets (1 to 10)
    while (piSets<=5)
    {
      
      iCounter=1;
      System.out.println("Set "+piSets+":");
      fvHeadTail(iCounter);
      piSets++;
    }
    return;
  }
  public static void fvHeadTail(int piCounter)
  {
    int iRandom;  // Actual outcome (0 or 1) or an individual "coin toss"
    double dPercentHead;
    double dPercentTail;
    int iHeads;  // Heads counter (value = 0)
    int iTails;  // Tails counter (value = 1)
    int iMin;  // Minimum acceptable random number 
    int iMax;  // Maximum acceptable random number
    iMin = 0;  // Set the minimum acceptable random number to 0
    iMax = 1;  // Set the maximum acceptable random number to 1 
    iHeads=0;
    iTails=0;
    dPercentHead=0;
    dPercentTail=0;
    Random rand = new Random();
    
    while (piCounter <=10)
    {
      iRandom = rand.nextInt((iMax - iMin) + 1) + iMin;
      if(iRandom==0)
      {
        iHeads++;
      }
      else
      {
        iTails++;
      }
      piCounter++;
    }
    dPercentHead=((double)iHeads/10)*100;
    dPercentTail=((double)iTails/10)*100;
    
    System.out.println("Heads: "+iHeads+"/10("+dPercentHead+"%)");
    System.out.println("Tails: "+iTails+"/10("+dPercentTail+"%)");
    return;
    
  }
}