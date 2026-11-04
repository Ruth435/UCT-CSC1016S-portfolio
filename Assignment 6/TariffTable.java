// Ruth-ann Rudolph RDLRUT001
// 30/08/2023
//Assignment 6 - A TariffTable records parking tariffs for a pay-to-stay car park.
public class TariffTable
{   
   private int nextFree = 0;
   private ParkingTariff[] parkingTariffs = new ParkingTariff[20];
   
   public TariffTable(int maxSize) // Create a TariffTable with the given maximum number of entries.
   {
     //ParkingTariff[] parkingTariffs = new ParkingTariff[maxSize]; null pointer exception if i try to run this line after creating the array earlier without a set size?
   }
   
   public void addTariff(TimePeriod period, Money tariff) // Add the tariff for the given period to the table.
   {
      ParkingTariff pTariff = new ParkingTariff(period,tariff); //creates a new parking tariff object which may be added to the array
      if(nextFree == 0) //checks if this is the first one to be added to the array 
      {
         parkingTariffs[nextFree] = pTariff;
         nextFree++;
      }
      //if it is not the first but it is adjacent to the previous one, and is after the previous one
      else if (period.adjacent(parkingTariffs[nextFree-1].getRange()) && (parkingTariffs[nextFree-1].getRange()).adjacent(period) && (parkingTariffs[nextFree-1].getRange()).precedes(period))
      {
         parkingTariffs[nextFree] = pTariff;
         nextFree++;
      }
      //if the parking tariff to be added does not meet the conditions of being added (not follow or is not adjacent), then the Illegal Argument Exception is thrown
      else
      {
         throw new IllegalArgumentException("Tariff periods must be adjacent.");
      }
   }
   
   public Money getTariff(Duration lengthOfStay) // Obtain the tariff for the given length of stay (cost).
   {
      for (int i = 0; i <= parkingTariffs.length; i++) //loops over all tariffs in the array
      {
            TimePeriod range = parkingTariffs[i].getRange();
            if(range.includes(lengthOfStay)) //checks the relevant time period, if this is the correct tariff
            {
               return parkingTariffs[i].getCost(); 
            }
      }
      return null;
   }
   
   
   public String toString() // Obtain a String representation of this TariffTable in the form:
   {
      String out = "";
      for (int i = 0; i < parkingTariffs.length; i++) //loops through all the tariffs in the array
      {  
         if( i < nextFree-1) //checks that this is not the last tariff
         {
            out = out + parkingTariffs[i].toString() + "\n";
         }
         else if (i == nextFree-1) //if it is the last tariff
         {
            out = out + parkingTariffs[i].toString();
         }
      }
      return out; //returns the string of tariffs
   }
}