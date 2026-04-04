/*
 * Darrien Raines-Boswell
 * Course: SDC230
 * Assignment: 5.2 Project Application Delivery
 * Description: Calculator class for math operations.
 */

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot use negative number.");
        }
        return Math.sqrt(num);
    }
}
