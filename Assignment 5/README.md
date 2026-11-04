# Assignment 5: Simple Classes with Constructors, Fields and Methods

**Course:** CSC1016S, University of Cape Town

**Topic:** Writing classes with instance variables, constructors and methods

**Language:** Java

## Overview

This assignment continues the car park scenario from Assignment 4: a pay-to-stay car park with a ticket machine at the entrance and a cashier at the exit. A driver receives a ticket stamped with the arrival time on entry. On exit, the ticket is handed in, the length of the stay is worked out and the driver pays accordingly.

The three exercises build on each other. Each class written in one exercise is used by the next, ending in a complete command-driven car park simulator:

- **Ticket:** a car park ticket with a unique ID and a time of issue.
- **Register:** stores every ticket issued and finds a ticket by its ID.
- **CarParkSim:** the simulator program that brings the classes together.

## Provided vs. my work

The supporting classes and the skeleton of the simulator were supplied by the course (via the Amathuba assignment page) and are included **unmodified**, apart from the skeleton, which I filled in. The three files I wrote are the ones submitted for marking.

| File | Status | Exercise | Role |
|---|---|---|---|
| `Ticket.java` | **Written by me** | One | A car park ticket with a unique ID and a time of issue. |
| `Register.java` | **Written by me** | Two | Stores issued tickets in an array and retrieves them by ID. |
| `CarParkSim.java` | Skeleton provided, **completed by me** | Three | The car park simulator, which reads commands and reports on tickets and stays. |
| `Time.java` | Provided | All | A 24-hour clock reading. |
| `Duration.java` | Provided | All | A length of time with millisecond accuracy, including string formatting. |
| `TimeUnit.java` | Provided | All | Time units used by `Time` and `Duration`. |
| `Clock.java` | Provided | Three | Simulates the passing of time. It stores a time that can be advanced. |
| `UIDGenerator.java` | Provided | Three | Generates unique IDs for tickets. |

## Exercise One: `Ticket`

**Task (from the brief):** write a `Ticket` class with the instance variables `String id` and `Time issueTime`. It has one constructor, `Ticket(Time currentTime, String ID)`, and these methods:

- `ID()` returns the ticket's ID.
- `age(Time currentTime)` returns the ticket's age, the issue time subtracted from the given time.
- `toString()` returns a string in the form `Ticket[id=8005A3, time=06:50:00]`.

## Exercise Two: `Register`

**Task (from the brief):** write a `Register` class that stores a collection of tickets in an array and finds a ticket from its ID. It has the instance variables `Ticket[] tickets` and `int numTickets`, where `numTickets` is the index of the next free space. The array has length 100. Its methods are:

- `add(Ticket ticket)` stores a ticket in the next free space.
- `contains(String ticketID)` says whether a ticket with the given ID is stored.
- `retrieve(String ticketID)` returns the ticket with the given ID.

## Exercise Three: `CarParkSim`

**Task (from the brief):** fill in the supplied `CarParkSim` skeleton to complete the simulator, using `Ticket`, `Register`, `Clock`, `Time`, `Duration` and `UIDGenerator`. Time is simulated and starts at midnight. The program accepts these commands:

- `advance {minutes}` moves the current time forward.
- `arrive` issues a ticket and records it in the register.
- `depart {ticket ID}` finds the ticket and reports the duration of the stay, or reports `Invalid ticket ID.` if there is no such ticket.
- `quit` ends the program.

**Sample run:**

```
Car Park Simulator
The current time is 00:00:00.
Commands: advance {minutes}, arrive, depart, quit.
>advance 10
The current time is 00:10:00.
>arrive
Ticket issued: Ticket[id=80000001, time=00:10:00].
>advance 1
The current time is 00:11:00.
>arrive
Ticket issued: Ticket[id=80000002, time=00:11:00].
>arrive
Ticket issued: Ticket[id=80000003, time=00:11:00].
>depart 80000003
Ticket details: Ticket[id=80000003, time=00:11:00].
Current time: 00:11:00.
Duration of stay: 0 minutes.
>depart 8000006
Invalid ticket ID.
>depart 80000001
Ticket details: Ticket[id=80000001, time=00:10:00].
Current time: 00:11:00.
Duration of stay: 1 minute.
>quit
Goodbye.
```

## Build and run

Requires a JDK. From this folder:

```bash
javac *.java
java CarParkSim
```
