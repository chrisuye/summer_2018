/*
COSC 236
Your name:Christian Seyoum
Description:File
Filename:Lab9_problem2
Date started:6/27/2018
Modification history:6/27/2018
Classes: main
*/
import java.util.*;
import java.io.*;
public class Lab9_Problem2
{
  public static void main(String[] args)
  {
    int iVal; // To capture each individual token as it's read from file
    int iRow; //  A total number of rows counter; initialize it to 0
    int iRowSum; // A row sum accumulator variable
    int iToke;
    int iGrand;
    double dMean;
    int iToken; // The counter variable for a for loop
    iRow=0;
    iGrand=0;
    iToke=0;
    
    try
    {
    Scanner ifsInput = new Scanner(new File("c:/home/student/Seyoum/folder/number.txt"));
                                   while (ifsInput.hasNextLine())
                                     {
                                     iRowSum=0;
                                     iRow++;
                                     for(iToken=0;iToken<4;iToken++)
                                     {
                                       iVal=ifsInput.nextInt();
                                       iRowSum=iRowSum+iVal;
                                       iToke++;
                                     }
                                     iGrand=iRowSum+iGrand;                                     
                                 System.out.println("Row "+iRow+" sum: "+iRowSum);
                                
                                   }
                                   dMean=(double)iGrand/(double)iToke;
                                   System.out.println("Count "+iToke);
                                   System.out.println("Grand Total "+iGrand);
                                   System.out.println("Mean "+dMean);
                                   }
catch(FileNotFoundException sMsg)
{
  System.out.println("Error");
}
                                   }
}
