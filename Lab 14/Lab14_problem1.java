import java.util.*;

public class Lab14_problem1
{
  public static void main(String[] args)
  {
    ArrayList<String> State = new ArrayList<String>();
    
    State.add("VT");
    State.add("TX");
    State.add("LA");
    State.add("AR");
    State.add("CA");
    fvDisplay(State);
  }
  public static void fvDisplay(ArrayList<String> State)
  {
    
    int iIndex;
    String sState;
    
    
    State.add(0,"UT");
    
    Collections.sort(State); 
    State.remove(1);
    Collections.reverse(State);
    State.add("GA");
    State.add("GA");
    State.remove("GA");
    //State.clear();
    for (iIndex = 0; iIndex < State.size(); iIndex ++)
    {
      sState = State.get(iIndex);
      System.out.println("Index " + iIndex + ": " + sState);
      
    }
    System.out.println("Array size: "+State.size());
    return;

  }
}