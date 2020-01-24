import java.util.*;

public class Lab14_problem3
{
  public static void main(String[] args)
  {
    ArrayList<Integer> ListNums = new ArrayList<Integer>();
    
    fvPop(ListNums);
    fvDisplayHist(ListNums);
  }
  public static void fvPop(ArrayList<Integer> ListNums)
  {
    int iRand;
    int iCount;
    Random rand = new Random();
    for(iCount=0; iCount<10; iCount++)
    {
    iRand = rand.nextInt((100-1)+1)+1;
    ListNums.add(iRand);
    }
    return;
  }
 public static void fvDisplayHist(ArrayList<Integer> ListNums)
  {
    
    int iCount;
    int iCount1;
    
    for(iCount=0; iCount<ListNums.size(); iCount++)
    {
      System.out.print((iCount+1)+": ");
      
      for(iCount1=0; iCount1<ListNums.get(iCount); iCount1++)
      {
        System.out.print("*");
      }
      System.out.println(" ("+ListNums.get(iCount)+")");
    }

  }
}