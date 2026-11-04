/** Ruth-ann Rudolph RDLRUT001
    02/09/2023
   Assignment 6 - A Tariff is an object with a time range (time period) and a cost, which will be applied to a pay-to-stay parking area
*/

public class ParkingTariff
{
   final Currency currency = new Currency("R", "ZAR", 100);
   private TimePeriod range;
   private Money cost;
   
   public ParkingTariff(TimePeriod range, Money cost) //constructor, creates the Parking Tariff object
   {
      this.range = range;
      this.cost = cost;
   }
   
   public TimePeriod getRange() // returns the time period of the Parking Tariff
   {
      return range;
   }
   
   public Money getCost() // returns the cost of the parking tariff (a money value)
   {
      return cost;
   }
   
   public String toString() // Obtain a String representation of this ParkingTariff object
   {
      return range.toString() + " : " + cost;
   }
}