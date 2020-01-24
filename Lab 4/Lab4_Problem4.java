/*
 COSC 236
 Your name:Christian Seyoum
 Description:uses string and string length to locate and display letters
 Filename:Lab4_problem4 
 Date started:6/5/2018
 Modification history:6/10/2018
 Classes: main
 */



import java.util.Scanner;

public class Lab4_Problem4 
{
  
  public static void main(String[] args)
  {
    // DECLARATIONS
    
    
    // Input-capture variables:
    String sStrings;
    Scanner cin= new Scanner(System.in);
    
    System.out.print("Type a string from 5 to 25 characters and press Enter: ");
    
    sStrings=cin.nextLine();
    
     
      
      
      if (sStrings.length() >= 5 && sStrings.length() <= 25) 
      {
        System.out.println("String length: "+sStrings.length());
        
        System.out.println("Uppercase: "+sStrings.toUpperCase());
        
        System.out.println("Lowercase: "+sStrings.toLowerCase());
        
        System.out.println("Characters in first five positions: "+sStrings.substring(0, 5));
        
        System.out.println("Character at first positions: "+sStrings.charAt(0));
        
        System.out.println("Position of the @: "+sStrings.indexOf("@"));
        
        System.out.println("Last four characters: "+ sStrings.substring(sStrings.length()-4, sStrings.length()));
        
        
        
      }
      else
      {
        System.out.println("Error: length must be from 5 to 25 characters");
        
      }
      
    }
    
  }
  
