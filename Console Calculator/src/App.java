// SDC230 Week 1 Project
// Console Calculator
// Darrien Raines-Boswell
// March 8, 2026

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Project Title
        System.out.println("SDC230 Week 1 Project – Console Calculator");
        System.out.println("Created by: Darrien Raines-Boswell\n");

        // Welcome Message
        System.out.println("Welcome to the Calculator Program!");
        System.out.println("This program will perform addition and subtraction.\n");

        // Integer Addition
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("\nAddition Result");
        System.out.println(num1 + " + " + num2 + " = " + sum);

        // Floating Point Subtraction
        System.out.print("\nEnter the first decimal number: ");
        double dec1 = input.nextDouble();

        System.out.print("Enter the second decimal number: ");
        double dec2 = input.nextDouble();

        double result = dec1 - dec2;

        System.out.println("\nSubtraction Result");
        System.out.println(dec1 + " - " + dec2 + " = " + result);

        // Closing Message
        System.out.println("\nThank you for using the Calculator Program!");

        input.close();
    }
}