package org.example.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.print("Введіть перше число: ");
            double a = parseNumber(scanner.nextLine());

            System.out.print("Введіть друге число: ");
            double b = parseNumber(scanner.nextLine());

            System.out.print("Введіть операцію (+, -, *, /): ");
            String operation = scanner.nextLine().trim();

            double result;
            switch (operation) {
                case "+":
                    result = calculator.add(a, b);
                    break;
                case "-":
                    result = calculator.subtract(a, b);
                    break;
                case "*":
                    result = calculator.multiply(a, b);
                    break;
                case "/":
                    result = calculator.divide(a, b);
                    break;
                default:
                    throw new InvalidInputException("Невідома операція.");
            }

            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Помилка: введіть коректні числа.");
        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (InvalidInputException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Обробку запиту завершено.");
        }
    }

    static double parseNumber(String input) {
        return Double.parseDouble(input.trim());
    }
}