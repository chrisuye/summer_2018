/*
 COSC 236
 Your name:Christian Seyoum
 Description: Triangle
 Filename:Lab7_problem1 
 Date started:6/22/2018
 Modification history:6/22/2018
 Classes: main
 */
import java.util.*;
public class Lab7_Problem1
{
  
  public static void main(String args[]) 
  {
    int iMaxCols;
    Scanner cin=new Scanner(System.in);
    System.out.println("Enter a numeber with in the range 1-50");
    iMaxCols=cin.nextInt();
    if(iMaxCols >=1 && iMaxCols <=50)
      fvDrawTriangle(iMaxCols);
    else
      System.out.println("Out of the range 1-50");
  }
  
  
  public static void fvDrawTriangle(int piMaxCols)
  {
    int iCol;
    int iRow;
    for(iCol =piMaxCols;iCol >=1;iCol--) 
    {
      for (iRow =iCol;iRow>=1;iRow--) 
      {
        System.out.print("*");
      }
      System.out.println("");
    }
    
  }
}