public class DistanceRateTime
{
  public static double fdRate(double pdDistance, double pdTime)
  {
    double dRate;
    if (pdDistance == 0 || pdTime == 0)
    {
      return -1;
    }
    else
    {
    dRate = pdDistance/pdTime;
    return dRate;
    }
  }
  public static double fdDistance(double pdRate, double pdTime)
  {
     double dDistance;
     if (pdRate == 0 || pdTime == 0)
    {
      return -1;
    }
    else
    {
      dDistance = pdRate * pdTime;
     return dDistance;
    }
   
  }
    public static double fdTime(double pdRate, double pdDistance)
  {
      double dTime;
      if (pdDistance == 0 || pdRate == 0)
    {
      return -1;
    }
    else
    {
   dTime = pdDistance / pdRate;
      return dTime;
    }
      
  }
}