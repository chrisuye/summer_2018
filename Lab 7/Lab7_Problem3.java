/*
 COSC 236
 Your name:Christian Seyoum
 Description: Month and Day
 Filename:Lab7_problem2 
 Date started:6/22/2018
 Modification history:6/22/2018
 Classes: main
 */
import java.util.*;
public class Lab7_Problem3  
{
  
  public static void main(String[] args)
  {
    int iRow;
    int iCol;
    iRow = 1;
    
    while (iRow <= 7)
    {
      iCol = 65;
      while (iCol <= 70)
      {
        fvAsll(iRow,iCol);
        iCol++;
      }
      iRow++;
    }
  }
  
  
  public static void fvAsll(int piRow, int piCol)
  {
    System.out.println("ROW " + piRow + " Col " + (char) piCol + ":" + piRow * piCol);
    return;
  }
}