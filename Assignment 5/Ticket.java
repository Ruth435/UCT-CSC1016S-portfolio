// Ruth-ann Rudolph RDLRUT001
// 18/08/2023
// Assignment 5 - A Ticket object represents a car park ticket. It has a unique ID and time of issue (24-hour clock).

public class Ticket
{
   public String id;
   public Time issueTime;
   
   //constructor for the new ticket object
   public Ticket(Time currentTime, String ID)
   {
      id = ID;
      issueTime = currentTime;
   }
   
   //method to get the ID of the ticket
   public String ID()
   {
      return id;
   }
   
   //Method to get the age of the ticket, as a duration from creation to input time
   public Duration age(Time currentTime)
   {
      return currentTime.subtract(issueTime);
   }
   
   //Method to return the ticket details as a string.
   public String toString()
   {
      return "Ticket[id=" + id + ", time=" + issueTime +"]";
   }
}