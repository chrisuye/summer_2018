/*
 COSC 236
 Your name:Christian Seyoum
 Description: Volume of different objects
 Filename:Lab5_problem3 
 Date started:6/12/2018
 Modification history:6/12/2018
 Classes: main
 */


import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Lab5_Problem3 
{
  
  public static void main(String[] args)
  {
    // DECLARATIONS
    
    
    // Input-capture variables:
    int iPick;
    
    
    Scanner cin= new Scanner(System.in);
    
    System.out.println("1 Calculate the volume of a sphere");
    System.out.println("2 Calculate the volume of a cone");
    System.out.println("3 Calculate the volume of a rectangular solid");
    System.out.println("4 Calculate the volume of a cylinder");
    System.out.println("5 Calculate the volume of a pyramid");
    System.out.print("6 Do nothing (quit)");
    iPick=cin.nextInt();
    
    switch (iPick)
    {
      case 1:
        VolumeSphere();
        break;
      case 2:
        VolumeCone();
        break;
      case 3:
        VolumeRectangular();
        break;
      case 4:
        VolumeCylinder();
        break;
      case 5:
        VolumePyramid();
        break;
      case 6:
        System.out.println("Good bye");
        break;
      default:
        System.out.println("Error: Your options are 1 to 6");
        break;
        
    }
    
  }
  public static void VolumeSphere()
  {
    double dRad;
    double dVolume;
    Scanner cin= new Scanner(System.in);
    DecimalFormat dfDPlace = new DecimalFormat("#,###.00");
    System.out.print("Enter radus of sphere ");
    dRad=cin.nextDouble();
    dVolume=(4*(Math.PI*(Math.pow(dRad,3))))/3;
    System.out.println("Volume of a sphere is "+dfDPlace.format(dVolume)+" cubic inches");
    
  }
  public static void VolumeCone()
  {
    double dRad;
    double dHeight;
    double dVolume;
    Scanner cin= new Scanner(System.in);
    DecimalFormat dfDPlace = new DecimalFormat("#,###.00");
    System.out.print("Enter radus of cone ");
    dRad=cin.nextDouble();
    System.out.print("Enter height of cone");
    dHeight=cin.nextDouble();
    dVolume=(Math.PI*(Math.pow(dRad,2))*dHeight)/3;
    System.out.println("Volume of a cone is "+dfDPlace.format(dVolume)+" cubic inches");
  }
  public static void VolumeRectangular()
  {
    double dWidth;
    double dHeight;
    double dLength;
    double dVolume;
    Scanner cin= new Scanner(System.in);
    DecimalFormat dfDPlace = new DecimalFormat("#,###.00");
    System.out.print("Enter width ");
    dWidth=cin.nextDouble();
    System.out.print("Enter height ");
    dHeight=cin.nextDouble();
    System.out.print("Enter length ");
    dLength=cin.nextDouble();
    dVolume=dWidth*dHeight*dLength;
    System.out.println("Volume of a rectangular solid is "+dfDPlace.format(dVolume)+" cubic inches");
  }
  public static void VolumeCylinder()
  {
    double dRad;
    double dHeight;
    double dVolume;
    Scanner cin= new Scanner(System.in);
    DecimalFormat dfDPlace = new DecimalFormat("#,###.00");
    System.out.print("Enter radus of cylinder ");
    dRad=cin.nextDouble();
    System.out.print("Enter radus of sphere ");
    dHeight=cin.nextDouble();
    dVolume=Math.PI*Math.pow(dRad,2)*dHeight;
    System.out.println("Volume of a cylinder is "+dfDPlace.format(dVolume)+" cubic inches");
  }
  public static void VolumePyramid()
  {
    double dWidth;
    double dHeight;
    double dLength;
    double dVolume;
    Scanner cin= new Scanner(System.in);
    DecimalFormat dfDPlace = new DecimalFormat("#,###.00");
    System.out.print("Enter width ");
    dWidth=cin.nextDouble();
    System.out.print("Enter height ");
    dHeight=cin.nextDouble();
    System.out.print("Enter length ");
    dLength=cin.nextDouble();
    dVolume=(dWidth*dLength*dHeight)/3;
    System.out.println("Volume of a pytamid is "+dfDPlace.format(dVolume)+" cubic inches");
  }
}



