import java.util.*;

public class Lab14_Problem6 
{
  public static void main(String[] args) 
  {
    
    int iArray[] = { 3, 19, 4, 7, 1 }; // array
    int iSort;
    System.out.println("Before:");
    
   print(iArray);
    
    iSort = recursiveSort(iArray);
    
    System.out.println("\nAfter:");
    
    print(iArray);
    
    System.out.println("\n"+iSort+ " iterations (recursive calls) needed for sorting above array");
    
  }
  /**
   * 
   * method to print the array
   * 
   */
  
  public static void print(int piArray[]) 
  {
    int iCount;
    
    for (iCount = 0; iCount < piArray.length; iCount++) 
    {
      
      System.out.printf(piArray[iCount] + " ");
      
    }
    
    System.out.println();
    return;
  }
  
  /**
   * 
   * method to sort an array recursively and return the number of iterations
   * 
   * (recursive calls) needed to sort it
   * 
   */
  
  public static int recursiveSort(int piArray[])
  {
    int iCount;
    boolean bDone;
    int iTemp;
    bDone = true;// assuming the array is sorted
    
    for (iCount = 0; iCount < piArray.length - 1; iCount++) 
    {
      
      if (piArray[iCount] > piArray[iCount + 1]) {
        
        // assumption was wrong
        
        bDone = false;
        
        // swapping elements
        
        iTemp = piArray[iCount];
        
        piArray[iCount] = piArray[iCount + 1];
        
        piArray[iCount + 1] = iTemp;
        
      }
      
    }
    
    if (!bDone) {
      
      // recursively calling again and returning +1 for the extra
      
      // recursive call
      
      return 1 + recursiveSort(piArray);
      
    }
    
    return 0; // array is sorted, no swapping was needed in this call
    
  }
  
  
  
}