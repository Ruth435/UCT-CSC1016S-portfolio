# Assignment 7: UML Modelling and Classes

**Course:** CSC1016S, University of Cape Town

**Topic:** UML class diagrams, and Java classes built through object composition

**Language:** Java

## Overview

This assignment is about modelling a system in UML and then building classes that contain and manipulate other objects. It is based on a timekeeping scenario for a company called Fynbos Flower, where employees are flexible about the hours they work. Employees sign in when they arrive and sign out when they leave, and every shift starts and ends within the same business week. A business week runs from Monday to Sunday, and week 1 of a year is the week containing the first Thursday.

The recorded shifts need to answer these questions:

- whether an employee is present
- whether an employee worked on a given day
- the details of the shift worked on a given day
- the total hours worked in a given week
- the shifts worked in a given week

The work has three parts: a UML class diagram of the whole design, then the `Shift` class, then the `Employee` class, which holds a collection of shifts.

## Provided vs. my work

The date, time and week classes were supplied by the course (as a ZIP on the Amathuba assignment page) and are included **unmodified**. The diagram and the two classes that complete the design are my work.

| File | Status | Exercise | Role |
|---|---|---|---|
| UML class diagram | **Written by me** | One | Diagram of all the classes, with their attributes, operations and relationships. |
| `Shift.java` | **Written by me** | Two | A work shift, from a start calendar time to a finish calendar time. |
| `Employee.java` | **Written by me** | Three | An employee's name and ID, with a log of their shifts. |
| `Week.java` | Provided | All | A business week, numbered within its year. |
| `CalendarTime.java` | Provided | All | A date together with a time of day. |
| `Date.java` | Provided | All | A Gregorian calendar date. |
| `Time.java` | Provided | All | A 24-hour clock reading. |
| `Duration.java` | Provided | All | A length of time with millisecond accuracy. |
| `TimeUnit.java` | Provided | All | Named time units such as hour, minute and week. |

## Exercise One: UML class diagram

**Task (from the brief):** study the class specifications and the supplied code, then draw a UML class diagram that:

- shows every class (`Employee`, `Shift`, `Week`, `CalendarTime`, `Date`, `Time`, `Duration` and `TimeUnit`)
- lists the public attributes and operations of each class, including static ones
- shows generalisation, association and aggregation relationships
- gives the multiplicity of every association and aggregation

## Exercise Two: `Shift`

**Task (from the brief):** implement the `Shift` class, which represents a work shift from a start date and time to a finish date and time. It has the constructor `Shift(CalendarTime start, CalendarTime finish)` and these methods:

- `start()` and `finish()` return the start and finish.
- `inWeek(Week w)` says whether the shift occurred within the given week.
- `includesDate(Date date)` says whether the shift at least partly occurred on the given date.
- `length()` returns the length of the shift.
- `toString()` returns the shift as a start and a finish, such as `1/9/2019%22:00:00 - 2/9/2019%06:00:00`.

**Example:**

```java
CalendarTime start = new CalendarTime("1/9/2019%22:00");
CalendarTime finish = new CalendarTime("2/9/2019%06:00");
Shift shift = new Shift(start, finish);
System.out.println(shift);
System.out.println(shift.includesDate(new Date("31/8/2019")));
System.out.println(shift.includesDate(new Date("1/9/2019")));
System.out.println(shift.inWeek(new Week("35/2019")));
System.out.println(shift.inWeek(new Week("36/2019")));
System.out.println(Duration.format(shift.length(), "minute"));
```

```
1/9/2019%22:00:00 - 2/9/2019%06:00:00
false
true
true
false
8 hours
```

## Exercise Three: `Employee`

**Task (from the brief):** implement the `Employee` class, which records an employee's name and ID and logs their sign-ins and sign-outs. Each employee keeps a collection of shifts. It has the constructor `Employee(String name, String uid)` and these methods:

- `name()` and `UID()` return the employee's name and ID.
- `signIn(Date d, Time t)` and `signOut(Date d, Time t)` record the start and end of a shift.
- `present()` says whether the employee has signed in and not yet signed out.
- `worked(Date d)` says whether the employee worked a shift that at least partly occurred on that date.
- `worked(Week w)` says whether the employee worked at least one shift in that week.
- `get(Date d)` returns the shifts that at least partly occurred on that date.
- `get(Week w)` returns the shifts worked in that week.
- `hours(Week w)` returns the total time worked in that week.

**Example:**

```java
Employee employee = new Employee("Sivuyile Ngesi", "01010125");
System.out.println(employee.name());
System.out.println(employee.UID());
System.out.println(employee.present());
employee.signIn(new Date(1, 9, 2019), new Time(6, 00));
System.out.println(employee.present());
employee.signOut(new Date(1, 9, 2019), new Time(18, 00));
System.out.println(employee.present());
for (Shift shift : employee.get(new Week(35, 2019))) { System.out.println(shift); }
System.out.println(Duration.format(employee.hours(new Week(35, 2019)), "minute"));
```

```
Sivuyile Ngesi
01010125
false
true
false
1/9/2019%06:00:00 - 1/9/2019%18:00:00
12 hours
```

## Build and run

Requires a JDK. These are classes rather than a complete program, so there is no `main` method. Compile them from this folder and try them out in `jshell` or a small test program, using the examples above:

```bash
javac *.java
jshell --class-path .
```
