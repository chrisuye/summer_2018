import java.util.*;
public class eg
{
  public static void main(String[] args)
  {
    int iNum;
    Random rand = new Random();
    iNum = rand.nextInt((10-1)+1)+1;
    System.out.println(iNum);
  }
  }