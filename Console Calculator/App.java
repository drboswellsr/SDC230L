/**
 * Name: Darrien Raines-Boswell
 * Date: April 1,2026
 * Assignment: SDC230L Week 4 - Exception Handling Calculator
 * Description: This program divides two numbers and handles errors like division by zero and invalid input.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        // Title
        System.out.println("Darrien Raines-Boswell - SDC230L Week 4 Exception Handling Calculator\n");

        // Welcome message
        System.out.println("Welcome to the Division Calculator!");
        System.out.println("You can divide two numbers safely.");
        System.out.println("Type 'q' at any time to quit.\n");

        while (running) {
            try {
                // First number
                System.out.print("Enter first number: ");
                String firstInput = input.nextLine();

                if (firstInput.equalsIgnoreCase("q")) {
                    break;
                }

                double num1 = Double.parseDouble(firstInput);

                // Second number
                System.out.print("Enter second number: ");
                String secondInput = input.nextLine();

                if (secondInput.equalsIgnoreCase("q")) {
                    break;
                }

                double num2 = Double.parseDouble(secondInput);

                // Check divide by zero
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero!");
                }

                // Division
                double result = num1 / num2;
                System.out.println("Result: " + result + "\n");

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a non-zero second number.\n");

            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter numbers only.\n");
            }
        }

        // Closing message
        System.out.println("\nThank you for using the calculator. Defend Your Own.");
        input.close();
    }
}