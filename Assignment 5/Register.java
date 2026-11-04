// Ruth-ann Rudolph RDLRUT001
// 18/08/2023
// Assignment 5 -store all the tickets that have been issued. 

public class Register
{
   public Ticket[] tickets = new Ticket[100];
   public int numTickets;
   
   //no-argument constructor
   public Register()
   {
      numTickets = 0;
   }
   
   // Store the given ticket in the register.
   public void add(Ticket ticket)
   {
      Ticket t = ticket;
      tickets[numTickets] = t;
      numTickets++;
   }
   
   // Determine whether a ticket with the given ID is in the collection.
   public boolean contains(String ticketID)
   {
      for (int i =0; i < numTickets; i++)
      {
         if ((tickets[i].ID()).equals(ticketID))
         {
            return true;
         }
      }
      return false;
   }
   
   // Get the Ticket with the given ID from the collection.
   public Ticket retrieve(String ticketID)
   {
      for (int i =0; i < numTickets; i++)
      {
         if ((tickets[i].ID()).equals(ticketID))
         {
            return tickets[i];
         }
      }
      return null;
   }
   
}