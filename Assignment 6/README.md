# Assignment 6: Class Declarations with Encapsulation

**Course:** CSC1016S, University of Cape Town

**Topic:** Classes with fields, constructors, methods and access modifiers

**Language:** Java

## Overview

This assignment brings the car park scenario from Assignments 4 and 5 to its conclusion by adding the missing element: payment. The focus is a "tariff table" that works out the cost of a stay from its length. The classes are designed with encapsulation, so the access modifiers decide how each class is used from outside it. The class specifications describe behaviour only, and the choice of instance variables and data types is left to the implementer.

The new classes fit together as follows:

- **TimePeriod:** a range of durations, with an inclusive lower bound and an exclusive upper bound.
- **ParkingTariff:** associates a time period with the cost of a stay in that period.
- **TariffTable:** a series of parking tariffs in ascending order of time period, used to look up the cost of a stay.
- **CarParkSim:** the simulator from Assignment 5, extended with a `tariffs` command and a cost of stay on departure.

## Provided vs. my work

The supporting classes were supplied by the course (via the Amathuba assignment pages) and are included **unmodified**. `Ticket`, `Register` and the base of `CarParkSim` are my own solutions from Assignment 5, which this assignment continues.

| File | Status | Exercise | Role |
|---|---|---|---|
| `TimePeriod.java` | **Written by me** | One | A range of durations with an inclusive lower bound and an exclusive upper bound. |
| `ParkingTariff.java` | **Written by me** | Two | Associates a time period with a cost. |
| `TariffTable.java` | **Written by me** | Three | Stores parking tariffs in ascending order of time period and looks up the cost of a stay. |
| `CarParkSim.java` | **Extended by me** (from my Assignment 5 solution) | Four | The simulator, now with a tariff table, a `tariffs` command and a cost of stay on departure. |
| `Ticket.java` | My Assignment 5 solution, reused | Four | A car park ticket with a unique ID and a time of issue. |
| `Register.java` | My Assignment 5 solution, reused | Four | Stores issued tickets and retrieves them by ID. |
| `Time.java` | Provided | All | A 24-hour clock reading. |
| `Duration.java` | Provided | All | A length of time with millisecond accuracy, including string formatting. |
| `TimeUnit.java` | Provided | All | Time units used by `Time` and `Duration`. |
| `Money.java` | Provided | Two to Four | An amount of money in a given currency. |
| `Currency.java` | Provided | Two to Four | A currency's symbol, ISO 4217 code and minor units per major unit. |
| `Clock.java` | Provided | Four | Simulates the passing of time. |
| `UIDGenerator.java` | Provided | Four | Generates unique IDs for tickets. |

## Exercise One: `TimePeriod`

**Task (from the brief):** write a `TimePeriod` class representing a range of durations from an inclusive lower bound, *l*, to an exclusive upper bound, *u*. A duration *d* falls within the period if *l* ≤ *d* < *u*. It has the constructor `TimePeriod(Duration lowerBound, Duration upperBound)` and these methods:

- `lowerBound()` and `upperBound()` return the bounds.
- `includes(Duration duration)` says whether the duration falls within the period.
- `precedes(TimePeriod other)` says whether this period's upper bound is at or before the other's lower bound.
- `adjacent(TimePeriod other)` says whether the two periods meet end to end.
- `toString()` returns a string such as `[1 hour .. 2 hours]`, built with the `Duration` class's `format` method with minutes as the smallest unit.

## Exercise Two: `ParkingTariff`

**Task (from the brief):** write a `ParkingTariff` class that associates a time period with the cost of parking for a stay in that period. This avoids keeping separate arrays of periods and costs in a tariff table, where the two could get out of step. The class is designed with its own instance variables, constructors and methods. The brief asks for methods that offer more than simple getters and setters, by delegating work from the tariff table to the tariffs.

## Exercise Three: `TariffTable`

**Task (from the brief):** write a `TariffTable` class that records the parking tariffs for a pay-to-stay car park. It has the constructor `TariffTable(int maxSize)` and these methods:

- `addTariff(TimePeriod period, Money tariff)` adds a tariff. The period must directly follow, and be adjacent to, the previous tariff's period. Otherwise it throws an `IllegalArgumentException`.
- `getTariff(Duration lengthOfStay)` returns the cost for a stay of the given length.
- `toString()` returns one line per tariff in the form `<period> : <tariff>`.

## Exercise Four: `CarParkSim`

**Task (from the brief):** extend the simulator from Assignment 5 so that it:

- creates and fills a `TariffTable`
- prints the cost of a stay after the duration when a vehicle departs
- supports a new `tariffs` command that lists the parking tariffs

**Sample run:**

```
Car Park Simulator
The current time is 00:00:00.
Commands: tariffs, advance {minutes}, arrive, depart, quit.
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
Cost of stay : R10.00.
>depart 80000006
Invalid ticket ID.
>depart 80000001
Ticket details: Ticket[id=80000001, time=00:10:00].
Current time: 00:11:00.
Duration of stay: 1 minute.
Cost of stay : R10.00.
>tariffs
[0 minutes .. 30 minutes] : R10.00
[30 minutes .. 1 hour] : R15.00
[1 hour .. 3 hours] : R20.00
[3 hours .. 4 hours] : R30.00
[4 hours .. 5 hours] : R40.00
[5 hours .. 6 hours] : R50.00
[6 hours .. 8 hours] : R60.00
[8 hours .. 10 hours] : R70.00
[10 hours .. 12 hours] : R90.00
[12 hours .. 1 day] : R100.00
>quit
Goodbye.
```

## Build and run

Requires a JDK. From this folder:

```bash
javac *.java
java CarParkSim
```
