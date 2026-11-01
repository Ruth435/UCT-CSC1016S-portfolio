# Assignment 2: Basic Syntax

**Course:** CSC1016S, University of Cape Town
**Topic:** Introduction to objects and Java, mapping Python knowledge to Java
**Language:** Java

## Overview

This assignment introduces Java and object-oriented thinking. Instead of passing strings and numbers around, the programs work with objects that represent the things being talked about: times, durations, money and currencies. Two small console programs were written, each using a set of supplied classes exactly as specified in the brief.

## Provided vs. my work

The four supplied classes came from the course (via the Amathuba assignment page) and are included **unmodified**. They are the work of the course lecturer, Stephan Jamieson, whose author tags are left in the files. The two programs are the part I wrote.

| File | Status | Exercise | Role |
|---|---|---|---|
| `Time.java` | Provided | One | A 24-hour clock reading (hours, minutes, seconds). |
| `Duration.java` | Provided | One | A length of time with millisecond accuracy. |
| `CalculateDuration.java` | **Written by me** | One | Reads two 24-hour clock times and prints the period between them in minutes. |
| `Money.java` | Provided | Two | An amount of money in a given currency. |
| `Currency.java` | Provided | Two | A currency's symbol, ISO 4217 code and minor units per major unit. |
| `SumCosts.java` | **Written by me** | Two | Reads Rand amounts until the user enters `D`, then prints the total. |

## Exercise One: `CalculateDuration`

**Task (from the brief):** read two 24-hour clock times, calculate the period between them and print it as a number of minutes. The second time can be assumed to be at or after the first. The program must use all the specified constructors and methods: `Time(String)`, `Time.subtract(Time)`, `Time.toString()` and `Duration.intValue(String)`.

**Sample run:**

```
Enter time A:
3:09
Enter time B:
16:59
The time 16:59:00 occurs 830 minutes after the time 03:09:00.
```

## Exercise Two: `SumCosts`

**Task (from the brief):** repeatedly ask for Rand amounts, sum them, and print the total when the user enters `D`. Uses `Currency(String, String, int)`, `Money(String, Currency)`, `Money.add(Money)` and `Money.toString()`, with a `while` loop.

**Sample run:**

```
Enter an amount or '[D]one' to quit:
R0.99
Enter an amount or '[D]one' to print the sum and quit:
R15
Enter an amount or '[D]one' to print the sum and quit:
R17.95
Enter an amount or '[D]one' to print the sum and quit:
D
Total: R33.94
```

## Build and run

Requires a JDK. From this folder:

```bash
javac *.java
java CalculateDuration
java SumCosts
```
