/*
 COSC 236
 Your name:Christian Seyoum
 Description: Number row and col
 Filename:Lab7_problem4
 Date started:6/22/2018
 Modification history:6/22/2018
 Classes: main
 */
import java.util.*;
public class Lab7_Problem4
{
  
  public static void main(String args[]) 
  {
    int iCol;
    int iRow;
    int iNum;
    iNum=0;
    for (iCol =0; iCol <6; iCol++)
    {
      for (iRow =0; iRow <4; iRow++)
      {
      System.out.print(iNum+"\t"); 
      iNum = iNum + 3;
      }
      System.out.println("");
    }
    System.out.println("");
    for (iNum =0; iNum <=9; iNum++)
    {
      System.out.print(iNum);
    }
    for (iNum =0; iNum <=9; iNum++)
    {
      System.out.print(iNum);
    }
    for (iNum =0; iNum <=4; iNum++)
    {
      System.out.print(iNum);
    }
           
           
       
  }
}