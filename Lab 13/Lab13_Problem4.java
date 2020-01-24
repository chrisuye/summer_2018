/*
 COSC 236
 Your name:Christian Seyoum
 Description: Duplicate Row
 Filename:Lab13_problem3 
 Date started:7/12/2018
 Classes: main
 */

import java.util.*;

public class Lab13_Problem4
{
  public static void main (String[] args)
  {
    
    int[][] iVals = {{1,2,7,4}, {5,6,7,8}, {9,10,10,12}, {9,10,10,12}, {1,2,3,4}};
    boolean bDups;
    
    bDups = fbDupRows(iVals);
    
    if(bDups == true)
    {
      System.out.println("Duplicate Rows Found");
    }
    else
    {
      System.out.println("Duplicate Rows not Found");
    }
  }
  public static boolean fbDupRows(int piVals[][])
  {
    int iCount;
    int iRow;
    int iCol;
    int iRowLen;
    int iColLen;
    
    iRowLen = piVals.length;
    iColLen = piVals[0].length;
    iCount = 0;
    
    
    
      for(iCol = 0; iCol < iColLen; iCol++)
      {
        if(piVals[1][iCol]==piVals[1 - 1][iCol])
        {
          iCount++;
          if (iCount == iColLen)
          {
            return true;
          }
        }
      }  
      
      iCount = 0;
      
      for(iCol = 0; iCol < iColLen; iCol++)
      {
        if(piVals[2][iCol]==piVals[2 - 1][iCol])
        {
          iCount++;
          if (iCount == iColLen)
          {
            return true;
          }
        }
        if(piVals[2][iCol]==piVals[2 - 2][iCol])
        {
          iCount++;
          if (iCount == iColLen)
          {
            return true;
          }
        }
      }  
      
      iCount = 0;
      
      for(iCol = 0; iCol < iColLen; iCol++)
      {
        if(piVals[3][iCol]==piVals[3 - 1][iCol])
        {
          iCount++;
          if (iCount == iColLen)
          {
            return true;
          }
        }
        if(piVals[3][iCol]==piVals[3 - 2][iCol])
        {
          iCount++;
          if (iCount == iColLen)
          {
            return true;
          }
        }
         if(piVals[3][iCol]==piVals[3 - 3][iCol])
        {
          iCount++;
          if (iCount == iColLen)
          {
            return true;
          }
        }
      }    
      
      iCount = 0;
      
      for(iCol = 0; iCol < iColLen; iCol++)
      {
        if(piVals[4][iCol]==piVals[4 - 1][iCol])
        {
          iCount++;
          if (iCount == iColLen)
          {
            return true;
          }
        }
        if(piVals[4][iCol]==piVals[4 - 2][iCol])
        {
          iCount++;
          if (iCount == iColLen)
          {
            return true;
          }
        }
         if(piVals[4][iCol]==piVals[4 - 3][iCol])
        {
          iCount++;
          if (iCount == iColLen)
          {
            return true;
          }
        }
         if(piVals[4][iCol]==piVals[4 - 4][iCol])
        {
          iCount++;
          if (iCount == iColLen)
          {
            return true;
          }
        }
      }  
      
       
    return false;
  }
  
  
}