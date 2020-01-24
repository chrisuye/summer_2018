import java.util.*;

public class RecursiveResponseEnforcer
{
  public static void main(String[] args)
  {
    Scanner cin = new Scanner(System.in);
    String sInput;
    
    System.out.println("Enter Y or N (not case sensitive): ");
    sInput = cin.nextLine();
    
    sInput = fsValidate(sInput);
     
    System.out.println("Final value is " + sInput);
  }
  
  public static String fsValidate(String psText)
  {
    Scanner cin = new Scanner(System.in);
    
    // Base case:
    if (psText.equals("Y") || psText.equals("y") || psText.equals("N") || psText.equals("n"))
    {
      return psText;
    }
    else
    {
      // Fails validation; invoke a recursive method call:
      System.out.println("Enter Y or N (not case sensitive): ");
      psText = cin.nextLine();
      
      return fsValidate(psText);
    }
  }
}
