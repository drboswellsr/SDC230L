// SDC230 Week 2 Project
// Software Design - Console Calculator
// Darrien Raines-Boswell
// March 18, 2026

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;

        System.out.println("SDC230 Week 2 Project - Console Calculator");
        System.out.println("Created by: Darrien Raines-Boswell");
        System.out.println("Welcome to the Calculator Program!");
        System.out.println("This program allows you to perform basic math operations.");
        System.out.println("Follow the prompts to enter numbers and view results.\n");

        do {
            System.out.println("===== Calculator Menu =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the first number: ");
                double num1 = input.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = input.nextDouble();

                double result = 0;

                switch (choice) {
                    case 1:
                        result = calc.add(num1, num2);
                        System.out.println("\nAddition Result");
                        System.out.println(num1 + " + " + num2 + " = " + result);
                        break;

                    case 2:
                        result = calc.subtract(num1, num2);
                        System.out.println("\nSubtraction Result");
                        System.out.println(num1 + " - " + num2 + " = " + result);
                        break;

                    case 3:
                        result = calc.multiply(num1, num2);
                        System.out.println("\nMultiplication Result");
                        System.out.println(num1 + " * " + num2 + " = " + result);
                        break;

                    case 4:
                        if (num2 == 0) {
                            System.out.println("\nError: Division by zero is not allowed.");
                        } else {
                            result = calc.divide(num1, num2);
                            System.out.println("\nDivision Result");
                            System.out.println(num1 + " / " + num2 + " = " + result);
                        }
                        break;
                }

                System.out.println();
            } else if (choice != 5) {
                System.out.println("Invalid choice. Please select a valid menu option.\n");
            }

        } while (choice != 5);

        System.out.println("Thank you for using the Calculator Program!");
        System.out.println("Program complete.");

        input.close();
    }
}