# Assignment 3: Creating a Basic Class

**Course:** CSC1016S, University of Cape Town
**Topic:** Class declarations, public instance variables and dot notation
**Language:** Java

## Overview

This assignment is about declaring your own classes and using them. The classes contain public instance variables only (constructors and methods come in later assignments), and their fields are accessed with dot notation. The work builds up in two steps: first a `Seller` class modelling a shop, then a marketplace program that loads many sellers from a CSV file into an array and searches them.

## Provided vs. my work

The assignment builds on the `Money` and `Currency` classes supplied in an earlier assignment, and on a program skeleton supplied for the second exercise. The course lecturer is the author of the supplied classes.

| File | Status | Exercise | Role |
|---|---|---|---|
| `Seller.java` | **Written by me** | One | Class modelling a shop, with one public instance variable per attribute. |
| `TestSeller.java` | **Written by me** | One | Asks for a seller's details, creates a `Seller`, then prints the details back. |
| `MarketPlace.java` | Skeleton provided, **completed by me** | Two | Loads sellers from a CSV file into an array, then finds those matching a product, quantity and maximum price. |
| `Money.java` | Provided (from an earlier assignment) | One and Two | An amount of money in a given currency, used for unit prices and price comparison. |
| `Currency.java` | Provided (from an earlier assignment) | One and Two | A currency's symbol, ISO 4217 code and minor units per major unit. |

## Exercise One: `Seller` and `TestSeller`

**Task (from the brief):** write a `Seller` class with one public instance variable for each attribute below, each named exactly as the attribute. The types are chosen to suit the sample values. Then write `TestSeller` to read in the details, store them in a `Seller` object and print them back out.

- `ID`: a unique key for the seller, e.g. `PNP01`
- `Name`: the name of the seller, e.g. `Pic n pay`
- `Location`: where the seller is, e.g. `Rondebosch`
- `Product`: the product on sale
- `unit_price`: the price per unit, e.g. `R49.99`
- `number_of_units`: the number of units available, e.g. `1000`

**Sample run:**

```
Please enter the details of the seller.
ID: UCT01
Name: UCT
Location: Rondebosch
Product: UCT T-shirts
Price: R300.00
Units: 120
The seller has been successfully created:
ID of the seller: UCT01
Name of the seller: UCT
Location of the seller: Rondebosch
The product to sell: UCT T-shirts
Product unit price: R300.00
The number of available units: 120
```

## Exercise Two: `MarketPlace`

**Task (from the brief):** complete the supplied `MarketPlace` skeleton so that it:

1. Asks for the name of a CSV file. The first line holds the number of sellers, N, and each following line holds one seller's details.
2. Reads the data into an array of `Seller` objects.
3. Asks for a product name, the quantity required and the maximum price per unit.
4. Searches the array and prints the sellers that can meet the requirements, or `None found.` if there are none. If the file holds no seller data, it reports that instead.

This exercise uses Java arrays and `Scanner` objects for reading from a file and for splitting each line on commas.

**Example CSV file:**

```
8
KP01, Kwik Pic, Bolton Hill, Cauliflower, R10.00, 120
FM01, Farmers’ Market, Imizamo Yethu, Lettuce, R11.25, 132
BAL01, Buy-A-lot, Salt River, Concrete Block, R3, 900
NA01, NotAllot, Claremont, Hot Air, R99.99, 0
STWD01, ShopTillWeDrop, Cape Town CBD, Lettuce, R10.00, 100
24S01, 24-Seven, Milnerton, Fish fillets, R21.50, 132
MM01, Mega Mart, Phillipi, Lettuce, R13.00, 132
GNG01, GetnGo, Rantanga Junction, Lettuce, R9.00, 50
```

**Sample run (no match):**

```
Enter the name of a "Comma Separated Values" (CSV) file:
shops.csv
Enter the name of a product:
Fire lighters
Enter the number of units required:
10
Enter the maximum unit price:
R5.00
None found.
```

## Build and run

Requires a JDK. From this folder:

```bash
javac *.java
java TestSeller
java MarketPlace
```

`MarketPlace` expects the path of a CSV file in the format above when it runs.
