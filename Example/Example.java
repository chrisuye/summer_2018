import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;
public class Example
{
  public static void main(String[] args]
  { 
    // Declare a counter variable: 
    int iASCII;  

    // Initialize the counter variable: 
    iASCII = (int) 'a'; 

    // Create a loop in which the statements will be executed 
    // as long as the counter variable is less than the character z:
    while (iASCII <= (int) 'z') 
    { 
      // Display the current value of the counter variable and character translation:
      System.out.println(iASCII +  " = " +  char(iASCII));

      // Increment the counter variable:
      iASCII ++; 
    }
  } 

