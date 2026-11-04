// Ruth-ann Rudolph RDLRUT001
// 30/08/2023
// Assignment 6 - A TimePeriod is a Duration range. It has an inclusive lower bound, l, and an exclusive upper bound, u. A Duration, d, falls within the range if l<=d<u.

public class TimePeriod
{
   private Duration lowerBound;
   private Duration upperBound;
   
   public TimePeriod(Duration lowerBound, Duration upperBound) // Create a TimePeriod with the given inclusive lower bound and exclusive upper bound.
   {
      this.lowerBound = lowerBound;
      this.upperBound = upperBound;
   }
   
   public Duration lowerBound() // Obtain the lower bound for this time period.
   {
      return lowerBound;
   }
   
   public Duration upperBound() // Obtain the upper bound for this time period.
   {
      return upperBound;
   }
   
   public boolean includes(Duration duration) // Determine whether the given duration falls within this time period
   {
      long upper = upperBound.intValue("minute");
      long low = lowerBound.intValue("minute");
      long check = duration.intValue("minute");
      if (check >= low && check < upper) //compare the durations to see if this is the correct time period
      {
         return true;
      }
      return false;
   }
   
   public boolean precedes(TimePeriod other) // Determine whether this time period precedes the other time period
   {
      if(this.upperBound().compareTo(other.lowerBound()) <= 0) //checks if the upperbound of the previous is below the lower bound of the current
      {
         return true;
      }
      return false;
   }
   
   public boolean adjacent(TimePeriod other) // Determine whether this time period is adjacent to the other time period
   {
      if(upperBound.equals(other.lowerBound()) || lowerBound.equals(other.upperBound()))
      {
         return true;
      }
      return false;
   }
   
   public String toString() // Obtain a String representation of this TimePeriod object
   {
      if(lowerBound.compareTo(upperBound) <= 0)
      {
         return "[" + lowerBound.format(lowerBound, "minute") + " .. " + upperBound.format(upperBound, "minute") + "]";
      }
      return "Invalid range";
   }
}