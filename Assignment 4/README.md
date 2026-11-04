# Assignment 4: Simple Java Classes and JUnit

**Course:** CSC1016S, University of Cape Town

**Topic:** Writing simple class declarations, using predefined classes and unit testing with JUnit

**Language:** Java

## Overview

This assignment reinforces object-oriented ideas by using, testing and writing classes. A programmer often works with predefined components, develops components rather than whole programs, and needs ways to check that those components work. The three exercises cover each of these in turn:

- writing a JUnit test suite for supplied classes
- writing a program that drives supplied classes
- writing a class so that a supplied test program passes

The assignment is also the start of a car park scenario (a ticket machine at the entrance and a cashier at the exit) that continues in the next assignment. That is why `Clock` and `TimeUnit` are supplied here.

## Provided vs. my work

Most of the code was supplied by the course (via the Amathuba assignment page). The supplied classes are included here **unmodified**. The files I wrote are the three submitted for marking.

| File | Status | Exercise | Role |
|---|---|---|---|
| `TestOfTime.java` | **Written by me** | One | JUnit test class with seven tests of `Time` and `Duration`. |
| `Time.java` | Provided | One | A 24-hour clock reading. A tweaked version of the class from an earlier assignment. |
| `Duration.java` | Provided | One | A length of time with millisecond accuracy. A tweaked version, with added string formatting. |
| `TimeUnit.java` | Provided | One | Time units, new in this assignment. |
| `Clock.java` | Provided | Scenario | Simulates the passing of time for the car park design, which continues in the next assignment. |
| `Money.java` | Provided | JGrasp demo | An amount of money in a given currency, used in the brief's interactive demonstration. |
| `Currency.java` | Provided | JGrasp demo | A currency's symbol, ISO 4217 code and minor units per major unit. |
| `TestShoppingCart.java` | **Written by me** | Two | Reads item details from the user and prints an invoice. |
| `Item.java` | Provided | Two | A product being purchased: name, unit price and quantity. |
| `ShoppingCart.java` | Provided | Two | Holds items and works out the total, discount, tax and payable amount. |
| `Student.java` | **Written by me** | Three | A student's first, middle and last name. |
| `TestStudent.java` | Provided | Three | The supplied test program used to develop `Student`. |

## Exercise One: `TestOfTime`

**Task (from the brief):** write a JUnit test class called `TestOfTime` containing seven tests of the supplied `Time` and `Duration` classes:

1. A `Time` object stores the value given when it is created (checked with `toString`).
2. Subtracting an earlier `Time` from a later one gives a `Duration` of the correct length.
3. Subtracting a `Time` from itself gives a zero `Duration`.
4. `Duration.intValue` works with `"millisecond"`.
5. `Duration.intValue` works with `"second"`.
6. `Duration.intValue` works with `"minute"`.
7. `Duration.intValue` works with `"hour"`.

## Exercise Two: `TestShoppingCart`

**Task (from the brief):** use the supplied `Item` and `ShoppingCart` classes to write `TestShoppingCart`, a program with a `main` method that lets the user enter the details of the items purchased and then prints an invoice. A 20% discount applies with the coupon `WELCOME20`.

**Sample run:**

```
How many items would you like to add to your Shopping Cart?:
2
Enter the Product Name:
Milk
Enter the Quantity:
16
Enter the Unit Cost:
16.99
Enter the Product Name:
Eggs
Enter the Quantity:
90
Enter the Unit Cost:
1.29
The Shopping Cart has the following items:
Milk: 16
Eggs: 90
--- Shopping Cart with all items ---
Milk 16 16.99 271.84
Eggs 90 1.29 116.10
  Total    :387.94
  Discount :77.59
  Tax      :43.45
  Total    :353.80
```

If the user enters `0` items, the program prints `Your Shopping Cart is empty.`

## Exercise Three: `Student`

**Task (from the brief):** write a `Student` class that models a student's name, using the supplied `TestStudent` program to drive the work. The class has two methods:

- `setNames(String first, String middle, String last)` sets the three names.
- `getFullName()` returns the full name with the middle name shortened to an initial.

`TestStudent` checks three requirements using two tests. The first test covers the requirements that `setNames` stores the names and that `getFullName` returns the right format. The second checks that `getFullName` does not change any stored value. The suggested instance variables are the private strings `firstName`, `middleName` and `lastName`.

## Build and run

Requires a JDK and the JUnit and Hamcrest jar files (`junit.jar` and `hamcrest-core.jar`), which were provided on the course site and are not included here. From this folder:

```bash
# Compile everything
javac -cp junit.jar:hamcrest-core.jar:. *.java

# Exercise One: run the JUnit tests
java -cp junit.jar:hamcrest-core.jar:. org.junit.runner.JUnitCore TestOfTime

# Exercise Two
java TestShoppingCart

# Exercise Three
java TestStudent
```

On Windows, use `;` instead of `:` in the classpath.
