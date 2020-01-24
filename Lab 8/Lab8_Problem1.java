/*
 COSC 236
 Your name:Christian Seyoum
 Description: Number
 Filename:Lab8_problem1
 Date started:6/22/2018
 Modification history:6/22/2018
 Classes: main
 */
import java.util.*;
public class Lab8_Problem1
{
  
  public static void main(String args[]) 
  {
    int iNum;
    
    
    iNum=fiNum();
    if(iNum==99)
    {
      return;
    }
    else
    {
      System.out.println("Value returned: "+iNum);
    }
  }
  public static int fiNum()
  {
    int piNum;
    Scanner cin=new Scanner(System.in);
    System.out.print("Enter an integer value from 2 to 10, or 99 to quit:");
    piNum=cin.nextInt();
    while (piNum<2 || piNum>10 && piNum!=99)
    {
      System.out.println("Error. Out of range.");
      System.out.print("Enter an integer value from 2 to 10, or 99 to quit:");
      piNum=cin.nextInt();
    }
    return piNum;
  }
}