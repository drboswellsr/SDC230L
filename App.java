/*
 * Darrien Raines-Boswell
 * Date: 03/23/2026
 * Assignment: SDC230 Week 3 - Arrays and Lists
 * Description: Console calculator with memory and array features
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =========================
        // TITLE + WELCOME
        // =========================
        System.out.println("SDC230 Week 3 Project - Arrays and Lists");
        System.out.println("Created by: Darrien Raines-Boswell\n");

        System.out.println("Welcome to the Calculator Program!");
        System.out.println("This program allows you to store values and perform calculations.\n");

        // =========================
        // MEMORY VARIABLES
        // =========================
        double memoryValue = 0;
        boolean hasValue = false;

        ArrayList<Integer> numbers = new ArrayList<>();

        int choice;

        do {
            // =========================
            // MENU
            // =========================
            System.out.println("\n===== MENU =====");
            System.out.println("1. Store single value");
            System.out.println("2. Retrieve value");
            System.out.println("3. Clear value");
            System.out.println("4. Replace value");

            System.out.println("\n--- Array Options ---");
            System.out.println("5. Add number (max 10)");
            System.out.println("6. Display all numbers");
            System.out.println("7. Count numbers");
            System.out.println("8. Remove a number");

            System.out.println("\n--- Calculations ---");
            System.out.println("9. Sum");
            System.out.println("10. Average");
            System.out.println("11. Difference (first - last)");

            System.out.println("\n12. Quit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {

                // =========================
                // SINGLE MEMORY
                // =========================
                case 1:
                    System.out.print("Enter value to store: ");
                    memoryValue = input.nextDouble();
                    hasValue = true;
                    System.out.println("Value stored.");
                    break;

                case 2:
                    if (hasValue)
                        System.out.println("Stored value: " + memoryValue);
                    else
                        System.out.println("No value stored.");
                    break;

                case 3:
                    memoryValue = 0;
                    hasValue = false;
                    System.out.println("Memory cleared.");
                    break;

                case 4:
                    if (hasValue) {
                        System.out.print("Enter new value: ");
                        memoryValue = input.nextDouble();
                        System.out.println("Value replaced.");
                    } else {
                        System.out.println("No value to replace.");
                    }
                    break;

                // =========================
                // ARRAY FEATURES
                // =========================
                case 5:
                    if (numbers.size() < 10) {
                        System.out.print("Enter number: ");
                        numbers.add(input.nextInt());
                        System.out.println("Added.");
                    } else {
                        System.out.println("Array is full (max 10).");
                    }
                    break;

                case 6:
                    if (numbers.isEmpty()) {
                        System.out.println("No values stored.");
                    } else {
                        System.out.println("Values: " + numbers);
                    }
                    break;

                case 7:
                    System.out.println("Count: " + numbers.size());
                    break;

                case 8:
                    if (!numbers.isEmpty()) {
                        System.out.print("Enter index to remove (0 - " + (numbers.size()-1) + "): ");
                        int index = input.nextInt();

                        if (index >= 0 && index < numbers.size()) {
                            numbers.remove(index);
                            System.out.println("Removed.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("Array is empty.");
                    }
                    break;

                // =========================
                // CALCULATIONS
                // =========================
                case 9:
                    int sum = 0;
                    for (int num : numbers) {
                        sum += num;
                    }
                    System.out.println("Sum: " + sum);
                    break;

                case 10:
                    if (!numbers.isEmpty()) {
                        int total = 0;
                        for (int num : numbers) {
                            total += num;
                        }
                        double avg = (double) total / numbers.size();
                        System.out.println("Average: " + avg);
                    } else {
                        System.out.println("No values.");
                    }
                    break;

                case 11:
                    if (numbers.size() >= 2) {
                        int first = numbers.get(0);
                        int last = numbers.get(numbers.size() - 1);
                        System.out.println("Difference: " + (first - last));
                    } else {
                        System.out.println("Need at least 2 values.");
                    }
                    break;

                case 12:
                    System.out.println("\nThank you for using the program!");
                    System.out.println("Defend Your Own.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 12);

        input.close();
    }
}