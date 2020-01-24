import java.util.*;

public class Lab
{
  public static void main(String[] args)
  {
    // Create the array list:
    ArrayList<Integer> listNums = new ArrayList<Integer>();
    
    // Call a method to populate it with values 1-10, inclusive:
    fvPop(listNums);
    
    // Display a histogram of the frequency count of the list values:
    fvDisplayHist(listNums);
  }


  // Method to populate the array:
  public static void fvPop(ArrayList<Integer> listNums)
  {
    int iIndex;
    int iNum;
    Random rand = new Random();
    
    for (iIndex = 0; iIndex <= 99; iIndex ++)
    {
      iNum = rand.nextInt(10 - 1 + 1) + 1;
      listNums.add(iNum);
    }
    return;   
  }
    
  // Method to get frequency counts and draw histogram:
  public static void fvDisplayHist(ArrayList<Integer> listNums)
  {
    int iIndex;
    int iCounts[] = new int[10];
    int iSub;
    int iAsterisk;
    
    // Count the occurances of each value, 1 to 10, in the list:
    for (iIndex = 0; iIndex < listNums.size(); iIndex ++)
    {
      switch (listNums.get(iIndex))      {
        case 1:
          iCounts[0] ++;
          break;
        case 2:
          iCounts[1] ++;
          break;
        case 3:
          iCounts[2] ++;
          break;          
        case 4:
          iCounts[3] ++;
          break;
        case 5:
          iCounts[4] ++;
          break;
        case 6:
          iCounts[5] ++;
          break;
        case 7:
          iCounts[6] ++;
          break;          
        case 8:
          iCounts[7] ++;
          break;
        case 9:
          iCounts[8] ++;
          break;
        case 10:
          iCounts[9] ++;
          break;
      }
    }
    
    // Now display the histogram from the frequency count data in the array:
    for (iSub = 0; iSub <= 9; iSub ++)
    {
      // Display the value being output (1 to 10):
      System.out.print((iSub + 1) + ": ");
                     
      // Draw as many asterisks as the value indicates:
      for (iAsterisk = 1; iAsterisk <= iCounts[iSub]; iAsterisk ++)
      {
        System.out.print("*");
      }
      
      // Add a data label in parentheses which has the raw count of that
      // particular value:
      System.out.print(" (" + iCounts[iSub] + ")");
      System.out.println();
    }
    return;
  }
}
