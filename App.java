/*
 * Darrien Raines-Boswell
 * Date: 04/03/2026
 * Course: SDC230
 * Assignment: 5.2 Project Application Delivery
 * Description: Final calculator application using menu,
 * exception handling, methods, collections, and loops.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        ArrayList<String> history = new ArrayList<>();

        String choice = "";

        System.out.println("=====================================");
        System.out.println("5.2 PROJECT APPLICATION DELIVERY");
        System.out.println("Calculator Application");
        System.out.println("Darrien Raines-Boswell");
        System.out.println("=====================================");

        while (!choice.equalsIgnoreCase("q")) {

            displayMenu();
            System.out.print("Enter choice: ");
            choice = input.nextLine();

            try {

                switch (choice) {

                    case "1":
                        double a = getNumber(input, "Enter first number: ");
                        double b = getNumber(input, "Enter second number: ");
                        save(history, a + " + " + b + " = " + calc.add(a, b));
                        break;

                    case "2":
                        double s1 = getNumber(input, "Enter first number: ");
                        double s2 = getNumber(input, "Enter second number: ");
                        save(history, s1 + " - " + s2 + " = " + calc.subtract(s1, s2));
                        break;

                    case "3":
                        double m1 = getNumber(input, "Enter first number: ");
                        double m2 = getNumber(input, "Enter second number: ");
                        save(history, m1 + " * " + m2 + " = " + calc.multiply(m1, m2));
                        break;

                    case "4":
                        double d1 = getNumber(input, "Enter first number: ");
                        double d2 = getNumber(input, "Enter second number: ");
                        save(history, d1 + " / " + d2 + " = " + calc.divide(d1, d2));
                        break;

                    case "5":
                        double base = getNumber(input, "Enter base: ");
                        double exp = getNumber(input, "Enter exponent: ");
                        save(history, base + "^" + exp + " = " + calc.power(base, exp));
                        break;

                    case "6":
                        double num = getNumber(input, "Enter number: ");
                        save(history, "sqrt(" + num + ") = " + calc.squareRoot(num));
                        break;

                    case "7":
                        showHistory(history);
                        break;

                    case "8":
                        history.clear();
                        System.out.println("History cleared.");
                        break;

                    case "q":
                        System.out.println("Program ended.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println();
        }

        input.close();
    }

    public static void displayMenu() {
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Power");
        System.out.println("6. Square Root");
        System.out.println("7. View History");
        System.out.println("8. Clear History");
        System.out.println("Q. Quit");
    }

    public static double getNumber(Scanner input, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(input.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    public static void save(ArrayList<String> history, String entry) {
        System.out.println("Result: " + entry);
        history.add(entry);
    }

    public static void showHistory(ArrayList<String> history) {
        if (history.isEmpty()) {
            System.out.println("No history yet.");
        } else {
            System.out.println("---- History ----");
            for (String h : history) {
                System.out.println(h);
            }
        }
    }
}
