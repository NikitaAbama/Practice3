package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(8.0, calculator.add(5.0, 3.0));
    }

    @Test
    void testSubtraction() {
        assertEquals(2.0, calculator.subtract(5.0, 3.0));
    }

    @Test
    void testMultiplication() {
        assertEquals(15.0, calculator.multiply(5.0, 3.0));
    }

    @Test
    void testDivision() {
        assertEquals(2.5, calculator.divide(5.0, 2.0));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5.0, 0.0));
    }

    @Test
    void testInvalidAdditionInput() {
        assertThrows(InvalidInputException.class, () -> calculator.add(Double.NaN, 2.0));
    }

    @Test
    void testInvalidSubtractionInput() {
        assertThrows(InvalidInputException.class, () -> calculator.subtract(2.0, Double.POSITIVE_INFINITY));
    }

    @Test
    void testInvalidMultiplicationInput() {
        assertThrows(InvalidInputException.class, () -> calculator.multiply(Double.NaN, 2.0));
    }

    @Test
    void testInvalidDivisionInput() {
        assertThrows(InvalidInputException.class, () -> calculator.divide(Double.POSITIVE_INFINITY, 2.0));
    }
}