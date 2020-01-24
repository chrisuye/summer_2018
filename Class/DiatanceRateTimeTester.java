public class DiatanceRateTimeTester
{
  public static void main(String[] args)
  {
    DistanceRateTime drt = new DistanceRateTime();
    
    System.out.println(drt.fdRate(0 , 8.9));
    System.out.println(drt.fdDistance(6.7 , 8.9));
    System.out.println(drt.fdTime(6.7 , 8.9));
  }
}