/*
 COSC 236
 Your name:Christian Seyoum
 Description: how many students have a given grade
 Filename:Lab7_problem6 
 Date started:6/22/2018
 Modification history:6/22/2018
 Classes: main
 */
import java.util.*;
public class Lab7_Problem6 
{
  
  public static void main(String[] args)
  {
    int iStudent;
    Scanner cin= new Scanner(System.in);
    System.out.print("How many students do you have?");
    iStudent = cin.nextInt();
    fvStudent(iStudent);
  }
  //method will revive students are peramiter and loop
  //based on the number of test and the number of students
  public static void fvStudent(int piStudent)
  {
    //declaration
    int iTest;
    int iACount;
    int iBCount;
    int iCCount;
    int iDCount;
    int iFCount;
    int iCount;
    int iCounter;
    double dSum;
    double dPercent;
    double dGrade;
    //give value
    iCount=1;
    iACount=0;
    iBCount=0;
    iCCount=0;
    iDCount=0;
    iFCount=0;
    //scanner
    
    Scanner cs= new Scanner(System.in);
    System.out.print("How many tests do each student take?");
    iTest = cs.nextInt();
    //loops
    while (iCount <= piStudent)
    {
      System.out.println ("Student "+iCount+":");
      iCounter=1;
      dSum = 0;
      dPercent = 0;
      while (iCounter <= iTest)
      {
        System.out.print("\tTest out of 100 "+iCounter+":");
        dGrade = cs.nextDouble();
        dSum=dSum+dGrade;
        iCounter++;
      }
      dPercent = dSum/(double) iTest;
      if (dPercent >= 90)
      {
        iACount++;
      }
      else if (dPercent >= 80)
      {
        iBCount++;
      }
      else if (dPercent >= 70)
      {
        iCCount++;
      }
      else if (dPercent >= 60)
      {
        iDCount++;
      }
      else
      {
        iFCount++;
      }
      iCount++;
    }
    //output
    System.out.println("Out of "+piStudent+" the number of A students are: "+iACount);
    System.out.println("Out of "+piStudent+" the number of B students are: "+iBCount);
    System.out.println("Out of "+piStudent+" the number of C students are: "+iCCount);
    System.out.println("Out of "+piStudent+" the number of D students are: "+iDCount);
    System.out.println("Out of "+piStudent+" the number of F students are: "+iFCount);
    return;
  }
}