# Assignment 1: Object-Oriented Fundamentals & Domain Modeling (CSC1016S)

## 📌 Overview
This assignment introduced object-oriented programming concepts in Java using jGRASP. It focused on designing and implementing custom classes to model real-world concepts (such as money, currency, time, and duration) and writing driver programs to compute totals, elapsed times, and financial calculations.

---

## 📁 Repository Structure & Program Details

### 🧩 Custom Classes
* **`Currency.java`**  
  Models currency types, conversions, or formatting rules.
* **`Money.java`**  
  Encapsulates monetary values and arithmetic operations.
* **`Time.java`**  
  Models time of day or time points with proper data encapsulation.
* **`Duration.java`**  
  Calculates and manages time intervals or elapsed durations.

### 💻 Driver & Application Programs
* **`CalculateDuration.java`**  
  An executable program utilizing the `Duration` and `Time` classes to compute time spans.
* **`SumCosts.java`**  
  An executable program utilizing `Money` and `Currency` classes to aggregate financial costs.
* **`Assignment1.gpj`**  
  The jGRASP project configuration file bundling the assignment files together.

---

## 🛠️ Key Skills & Concepts Emphasized
* **Object-Oriented Programming (OOP):** Designing multiple interacting classes with encapsulated state and methods.
* **Domain Modeling:** Translating real-world entities (money, time, currency) into clean Java class structures.
* **IDE Workflow:** Managing projects and compiling/running Java applications using jGRASP.

---

## 🚀 How to Compile and Run
Open the project file in jGRASP or compile via the command line:
```bash
javac *.java
java CalculateDuration
java SumCosts
```
