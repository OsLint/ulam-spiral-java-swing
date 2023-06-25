# Ulam Spiral :cyclone:

A Java program that generates and visualizes the Ulam Spiral using Swing.:cyclone:

## Description

The Ulam Spiral is a graphical representation of prime numbers in a spiral pattern. This program generates the Ulam Spiral and displays it using Java's Swing library.

## Usage

1. Clone the repository.
2. Compile and run the `Main.java` file.
3. The Ulam Spiral will be displayed in a window.

## Requirements

- Java Development Kit (JDK)
- Swing library

## How it works

1. The program generates prime numbers using the `generatePrimes()` method.
2. It initializes a window using `JFrame` and sets up the necessary properties.
3. The `paint()` method is overridden to draw the Ulam Spiral.
4. For each number in the `primes` array, it checks if the number is prime.
5. Based on the current direction, it updates the coordinates and fills a rectangle with the corresponding color.
6. The Ulam Spiral is drawn on the window.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

