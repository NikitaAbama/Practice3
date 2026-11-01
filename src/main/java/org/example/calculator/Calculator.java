package org.example.calculator;

public class Calculator {

    public double add(double a, double b) {
        checkInput(a, b);
        return a + b;
    }

    public double subtract(double a, double b) {
        checkInput(a, b);
        return a - b;
    }

    public double multiply(double a, double b) {
        checkInput(a, b);
        return a * b;
    }

    public double divide(double a, double b) {
        checkInput(a, b);
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе.");
        }
        return a / b;
    }

    private void checkInput(double a, double b) {
        if (!Double.isFinite(a) || !Double.isFinite(b)) {
            throw new InvalidInputException("Числа повинні бути скінченними.");
        }
    }
}