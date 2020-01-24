/*
 COSC 236
 Your name:Christian Seyoum
 Description: do you drink enough water?
 Filename:Lab5_problem4
 Date started:6/12/2018
 Modification history:6/12/2018
 Classes: main
 */



import java.util.Scanner;

public class Lab5_Problem4
{
  
  public static void main(String[] args)
  {
    // DECLARATIONS
    
    
    // Input-capture variables:
    String sWater;
    String sDayWater; 
    int iNumWater;
    
    Scanner cin= new Scanner(System.in);
    
    System.out.print("Do you drink water? Y or N: ");
    
    sWater=cin.next();
    sWater=sWater.toUpperCase();
    
    
    
    if (sWater.equals("N")) 
    {
      System.out.println("Warning! You need to drink water");
    }
    else
    {
      System.out.print("Do you drink water everyday? Y or N: ");
      sDayWater=cin.next();
      sDayWater=sDayWater.toUpperCase();
      if (sDayWater.equals("N"))
      {
        System.out.println("Warning! You need to drink water daily");
      }
      else
      {
        System.out.print("How many cups of water do you drink daily? ");
        iNumWater=cin.nextInt();
        if (iNumWater<8)
        {
          System.out.println("You must drink at least 8 cups of water");
        }
        else
        {
          System.out.println("congragulations. You are fully hydrating yourself!!!");
        }
      }
      
    }
    
  }
  
}

