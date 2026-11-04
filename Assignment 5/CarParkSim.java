import java.util.Scanner;
/**
 * The CarParkSim class contains the main car park simulation method.
 * It creates and manipulates the main objects, and handles user I/O.
 *
 * @author Stephan Jamieson and Ruth-ann Rudolph RDLRUT001
 * @version 18/08/2023
 */
public class CarParkSim {
        
    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        Clock c = new Clock(new Time("00:00"));
        Register reg = new Register();
        // Declare variables to store a Clock and a Register object, create the relevant objects and assign them. 
        
        System.out.println("Car Park Simulator");
        Time currentTime = c.examine();
        System.out.println("The current time is " + currentTime.toString() + ".");
        // Print current time.
        System.out.println("Commands: advance {minutes}, arrive, depart, quit.");
        System.out.print(">");
        String input = keyboard.next().toLowerCase();
        while (!input.equals("quit")) {
            if (input.equals("advance")) {
                 int advanceBy = keyboard.nextInt();
                 c.advance(new Duration("minute", advanceBy));
                 currentTime = c.examine();
                 System.out.println("The current time is "+currentTime.toString()+".");
                // Advance the clock, print the current time.
            }
            else if (input.equals("arrive")) {
               String UID_One = UIDGenerator.makeUID();
               Ticket newTicket = new Ticket(c.examine(), UID_One);
               String ID_One = newTicket.ID();
               reg.add(newTicket);
               System.out.println("Ticket issued: " + newTicket.toString() + ".");
                // Create a new ticket, add it to the register, print details of ticket issued.
            }
            else if (input.equals("depart")) {
                String checkTicket = keyboard.next();
                boolean valid = reg.contains(checkTicket); // Determine if ticket is valid, i.e. in the register.
                if (valid) // If yes, retreive it, calculate duration of stay and print it.
                {
                  Ticket depart = reg.retrieve(checkTicket);
                  Duration d = depart.age(c.examine());
                  System.out.println("Ticket details: " + depart.toString() + ".");
                  System.out.println("Current time: " + c.examine() + ".");
                  System.out.println("Duration of stay: "+ d.format(d, "minute") + ".");
                }
                else // If not, print error message.
                {
                  System.out.println("Invalid ticket ID.");
                }
            }
            else {
                System.out.println("That command is not recognised.");
                System.out.println("Commands: advance <minutes>, arrive, depart, quit.");
            }            
            System.out.print(">");
            input = keyboard.next().toLowerCase();
        }            
        System.out.println("Goodbye.");
    }

}
