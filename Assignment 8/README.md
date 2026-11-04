# Assignment 8: Arrays and Inheritance in Java

**Course:** CSC1016S, University of Cape Town

**Topic:** Static variables and methods, arrays, and the basics of inheritance

**Language:** Java

## Overview

This assignment covers three ideas. Class (`static`) variables and methods belong to a class rather than to an object, so no object needs to be created to use them, much like a Python module or `java.lang.Math`. Arrays are used to work with the digits of a number. Inheritance is used to build specialised classes on top of a general one.

The three questions build on each other in the first two cases:

- **NumberUtils:** a collection of static routines for working with the digits of integers.
- **CowsAndBulls:** the logic of a number-guessing game, built on `NumberUtils`.
- **Shape, Rectangle and Circle:** a small class hierarchy that demonstrates inheritance.

## Provided vs. my work

The game program, its helper classes and the Question 3 program were supplied by the course (via the Amathuba assignment page) and are included **unmodified**. The five classes I wrote are the ones submitted for marking.

| File | Status | Question | Role |
|---|---|---|---|
| `NumberUtils.java` | **Written by me** | One | Static routines for turning a number into an array of digits and comparing the digits of two numbers. |
| `CowsAndBulls.java` | **Written by me** | Two | The logic of the Cows and Bulls guessing game. |
| `NumberPicker.java` | Provided | Two | Generates the mystery number's digits from a randomisation seed. |
| `Result.java` | Provided | Two | Holds the outcome of a guess. |
| `Game.java` | Provided | Two | The program that completes the game by handling user interaction. |
| `Shape.java` | **Written by me** | Three | The general class, with a name and a colour. |
| `Rectangle.java` | **Written by me** | Three | A shape with a length and a width. |
| `Circle.java` | **Written by me** | Three | A shape with a radius. |
| `Question3.java` | Provided | Three | The program that creates and prints the three objects. |

## Question 1: `NumberUtils`

**Task (from the brief):** write a `NumberUtils` class that holds a collection of static routines for working with integers. It has no instance variables, and its private, empty constructor prevents objects from being created. The methods are:

- `toArray(int number)` maps the digits of a number to an array, so 5678 gives `{5, 6, 7, 8}`.
- `countMatches(int numberA, int numberB)` counts the digits that match in both value and position. For 39628 and 79324 there are 2 (the 9 and the 2).
- `countIntersect(int numberA, int numberB)` counts the digits the two numbers share, whatever their position. For 39628 and 97324 there are 3 (3, 9 and 2).

The numbers are assumed to be the same length and to have no repeated digits.

## Question 2: `CowsAndBulls`

**Task (from the brief):** write the `CowsAndBulls` class, which implements the logic of a game where the player tries to guess a mystery four-digit number with no repeated digits and no zero. Each guess is scored with *bulls*, the digits that are correct and in the right place, and *cows*, the digits that are correct but in the wrong place. For example, if the mystery number is 8657 and the guess is 4678, there is one bull (6) and two cows (7 and 8).

The class has the constants `NUM_DIGITS` (4), `MAX_VALUE` (9876), `MIN_VALUE` (1234) and `MAX_GUESSES` (10). Its constructor takes a randomisation seed, so the same seed always gives the same mystery number. It uses `NumberPicker` to generate the number, and `NumberUtils` to score guesses. The methods are:

- `guessesRemaining()` returns the number of guesses left.
- `guess(int guessNumber)` evaluates a guess, returns the outcome as a `Result` and uses up a guess.
- `giveUp()` ends the game and returns the secret number.
- `gameOver()` is true once the number has been guessed or the guesses have run out.

**Sample run of `Game`:**

```
Your challenge is to guess a secret 4 digit number.
Enter randomisation seed value:
10
Make a guess:
5678
Sorry that's incorrect.
You have 3 cows and 1 bull.
You have 9 guesses remaining
Make a guess:
5687
Sorry that's incorrect.
You have 2 cows and 2 bulls.
You have 8 guesses remaining
Make a guess:
8657
Correct !
```

## Question 3: `Shape`, `Rectangle` and `Circle`

**Task (from the brief):** demonstrate inheritance by creating and printing three simple objects, where the classes for the second and third inherit from the class for the first. The classes use constructors and overridden methods:

- `Shape` has a name and a colour.
- `Rectangle` is a `Shape` with a length and a width.
- `Circle` is a `Shape` with a radius.

**Output of `Question3`:**

```
Pentagon Blue
Circle Purple Radius 3.0
Rectangle Red Length 6.0 Width 8.0
```

## Build and run

Requires a JDK. From this folder:

```bash
javac *.java

# Question 2: the Cows and Bulls game
java Game

# Question 3: the inheritance demonstration
java Question3
```
