import java.util.*;
import java.lang.*;
public class Lab14_Problem2
{
  public static void main(String[] args)
  {
     ArrayList<Double> ListNum = new ArrayList<Double>();
     
     ListNum.add(67.0);
     ListNum.add(89.0);
     ListNum.add(89.9);
     ListNum.add(56.9);
     
     ListNum.add(0,89.4);
     ListNum.add(1,78.5);
     ListNum.set(3,86.56);
     System.out.println("Fist value: "+ListNum.get(0));
     System.out.println("Last value: "+ListNum.get(5));
     System.out.println("Array size: "+ListNum.size());
  }
}