/*
COSC 236
Your name:Christian Seyoum
Description:Numbers
Filename:Lab9_problem5
Date started:6/27/2018
Modification history:6/27/2018
Classes: main
*/
import java.util.*;
import java.io.*;
public class Lab9_Problem5
{
  public static void main(String[] args)
  {
    int iRow;
    int iCol;
    int iVal;
    Scanner cin = new Scanner(System.in);
    System.out.print("How many rows do you need? ");
      iRow = cin.nextInt();
    if (iRow >=1 || iRow <=100)
    {
      System.out.print("How many columns do you need? ");
        iCol = cin.nextInt();
      
      if (iCol>=1 || iCol <= 8)
      {
        iVal = fiCreateFile(iRow,iCol);
        if (iVal != 0)
        {
          System.out.println("Success: file processing complete; "+iVal+" values written");
        }
        else
        {
          System.out.println("Error: unable to create output file");
        }
      }
      else
      {
        return;
      }
    }
    else
    {
      return;
    }
  }
  public static int fiCreateFile(int piRow, int piCol)
  {
    int iRand;
    int iCountRow;
    int iCountCol;
    int iCount;
    iCount=0;
    try
    {
    PrintStream ofsOutput= new PrintStream(new File("c:/home/student/seyoum/folder/Problem_5.txt"));
    Random rand = new Random();
    for(iCountRow=0; iCountRow<piRow; iCountRow++)
    {
      for(iCountCol=0; iCountCol<piCol; iCountCol++)
      {
        iRand = rand.nextInt((100-0)+1)+0;
ofsOutput.printf("%6d", iRand);
iCount++;

}
    ofsOutput.println("");  
    }
    }
    
    catch(FileNotFoundException sMsg)
    {
      System.out.println("Error");
    }
return iCount;
}
}
