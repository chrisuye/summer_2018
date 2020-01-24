/*
 COSC 236
 Your name:Christian Seyoum
 Description: Is it a vowel?
 Filename:Lab6_problem5
 Date started:6/15/2018
 Modification history:6/15/2018
 Classes: main
 */



import java.util.Scanner;
import java.lang.Math;

public class Lab6_Problem5 
{
  
  public static void main(String[] args)
  {
    // DECLARATIONS
    
    
    
    
    // Input-capture variables:
    String sStr;
    //declaration
    
    Scanner cin= new Scanner(System.in);
    
    
    System.out.print("Type a line of text and press Enter: ");
    sStr = cin.nextLine();
    if (sStr.equals(""))
    {
      System.out.println("You didn't type anything");
    }
    else
    {
      fbCountVowel(sStr);
    }
    
    
    
    
  }
  public static boolean fbCountVowel(String fsStr)
  {
    //declaration
    int iCount;
    int iCountLet;
    int iACount;
    int iECount;
    int iICount;
    int iOCount;
    int iUCount;
    //give inital value
    iCount=0;
    iACount=0;
    iECount=0;
    iICount=0;
    iOCount=0;
    iUCount=0;
    
    
    iCountLet = fsStr.length();
    fsStr=fsStr.toLowerCase();
    
    
    while ( iCount<iCountLet)
    {
      
      char cLetter;
      cLetter=fsStr.charAt(iCount);
      if (cLetter=='a')
      {
        
        System.out.println(cLetter+": vowel");
        iACount++;
      }
      
      else if (cLetter=='e')
      {
        
        System.out.println(cLetter+": vowel");
        iECount++;
      }
      else if (cLetter=='i')
      {
        
        System.out.println(cLetter+": vowel");
        iICount++;
      }
      else if (cLetter=='o')
      {
        
        System.out.println(cLetter+": vowel");
        iOCount++;
      }
      else if (cLetter=='u')
      {
        
        System.out.println(cLetter+": vowel");
        iUCount++;
      }
      else
      {
        System.out.println(cLetter+": not a vowel");
      }
      iCount++;
      
    }
    System.out.println("Vowel counts: ");
    System.out.println("a: "+iACount);
    System.out.println("e: "+iECount);
    System.out.println("i: "+iICount);
    System.out.println("o: "+iOCount);
    System.out.println("u: "+iUCount);
    
  
  if(iACount + iECount + iICount + iOCount + iUCount == 0)
  {
    return false;
  }
  else
  {
    return true;
  }
  
}
}



