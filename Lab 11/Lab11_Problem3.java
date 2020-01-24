import java.io.*;
import java.util.*;

public class Lab11_Problem3
{
  public static void main(String[] args)
  {
    String sLetters[] = new String[52];
    int iCounts[] = new int[52];
    int iSub;
    
    
    fvPopulateCounterArray(sLetters);
    fvReadAndCount("c:/home/student/Bachman/Lab_11_3_Data.txt", sLetters, iCounts);
    fvShowLetterCount(sLetters, iCounts);
  }

  
  public static void fvPopulateCounterArray(String psLetter[])
  {
    int iSub = 0;
    for (int iLtr = 'a'; iLtr <= 'z'; iLtr ++)
    {
      psLetter[iSub] = String.valueOf((char) iLtr);
      iSub ++;
    }
    for (int iLtr = 'A'; iLtr <= 'Z'; iLtr ++)
    {
      psLetter[iSub] = String.valueOf((char) iLtr);
      iSub ++;
    }
    return;
  }
  
  public static void fvReadAndCount(String psFile, String psLetters[], int piCounts[])
  {
    for(int i = 0; i < 52; i++)
    {
      piCounts[i] = 0;
    }
    
    try
    {
      Scanner ifsInput = new Scanner(new File(psFile));
      while(ifsInput.hasNextLine())
      {
        String stemp = ifsInput.nextLine();
        for(int i = 0; i < stemp.length(); i++)
        {
          char cChar = stemp.charAt(i);
          for (int iSub = 0; iSub <= 51; iSub ++)
          {
            if (psLetters[iSub].equals(cChar))
            {
            piCounts[iSub] = piCounts[iSub] + 1;
            }
          }
        }   
      }
    }
    catch (FileNotFoundException sMsg)
    {
      System.out.println("Error, no file found");
    }
    return;
  }
  public static void fvShowLetterCount(String sLetter[], int iCounts[])
  {
    for(int i = 0; i < 52; i++)
    {
      System.out.println(sLetter[i] + ": " + iCounts[i]);
    }
    return;
  }
}

