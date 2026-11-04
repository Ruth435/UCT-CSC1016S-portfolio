import java.util.Scanner;
/**
 * The CarParkSim class contains the main car park simulation method.
 * It creates and manipulates the main objects, and handles user I/O.
 *
 * @author Stephan Jamieson and Ruth-ann Rudolph RDLRUT001
 * @version 04/09/2023
 */
public class CarParkSim {
        
    public static void main(final String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        Clock c = new Clock(new Time("00:00"));
        Register reg = new Register();
        final TariffTable table = new TariffTable(10);
        final Currency currency = new Currency("R", "ZAR", 100);
        // Declare variables to store a Clock, a Register object, TariffTable, currency. create the relevant objects and assign them. 
        
        //creates all the time periods for the tariffs to be added
        final TimePeriod pOne = new TimePeriod(new Duration("minute", 0), new Duration("minute", 30));
        final TimePeriod pTwo = new TimePeriod(new Duration("minute", 30), new Duration("hour", 1));
        final TimePeriod pThree = new TimePeriod(new Duration("hour", 1), new Duration("hour", 3));
        final TimePeriod pFour = new TimePeriod(new Duration("hour", 3), new Duration("hour", 4));
        final TimePeriod pFive = new TimePeriod(new Duration("hour", 4), new Duration("hour", 5));
        final TimePeriod pSix = new TimePeriod(new Duration("hour", 5), new Duration("hour", 6));
        final TimePeriod pSeven = new TimePeriod(new Duration("hour", 6), new Duration("hour", 8));
        final TimePeriod pEight = new TimePeriod(new Duration("hour", 8), new Duration("hour", 10));
        final TimePeriod pNine = new TimePeriod(new Duration("hour", 10), new Duration("hour", 12));
        final TimePeriod pTen = new TimePeriod(new Duration("hour", 12), new Duration("Day", 1));
        
        //adds the tariffs to the table
        table.addTariff(pOne, new Money("R10", currency));
        table.addTariff(pTwo, new Money("R15", currency));
        table.addTariff(pThree, new Money("R20", currency));
        table.addTariff(pFour, new Money("R30", currency));
        table.addTariff(pFive, new Money("R40", currency));
        table.addTariff(pSix, new Money("R50", currency));
        table.addTariff(pSeven, new Money("R60", currency));
        table.addTariff(pEight, new Money("R70", currency));
        table.addTariff(pNine, new Money("R90", currency));
        table.addTariff(pTen, new Money("R100", currency));
        
        System.out.println("Car Park Simulator");
        // Print current time.
        Time currentTime = c.examine();
        System.out.println("The current time is " + currentTime.toString() + ".");
        
        System.out.println("Commands: tariffs, advance {minutes}, arrive, depart, quit.");
        System.out.print(">");
        String input = keyboard.next().toLowerCase();
        
        //loops until the program is exited by the user
        while (!input.equals("quit")) {
            if (input.equals("advance")) { // Advance the clock, print the current time.
                 int advanceBy = keyboard.nextInt();
                 c.advance(new Duration("minute", advanceBy));
                 currentTime = c.examine();
                 System.out.println("The current time is "+currentTime.toString()+".");
            }
            
            else if (input.equals("arrive")) { // Create a new ticket, add it to the register, print details of ticket issued.
               Ticket newTicket = new Ticket(c.examine());
               reg.add(newTicket);
               System.out.println("Ticket issued: " + newTicket.toString() + ".");
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
                  System.out.println("Cost of stay : " + table.getTariff(d) + ".");
                }
                else // If not valid, print error message.
                {
                  System.out.println("Invalid ticket ID.");
                }
            }
            
            else if (input.equals("tariffs")){ //print the tariff table
               System.out.println(table.toString());
            }
            
            else { //if no valid command is entered, give an error message and the comands again
                System.out.println("That command is not recognised.");
                System.out.println("Commands: tariffs, advance {minutes}, arrive, depart, quit.");
            }            
            System.out.print(">");
            input = keyboard.next().toLowerCase();
        }            
        System.out.println("Goodbye.");//when the user gives the command to exit the program
    }

}
