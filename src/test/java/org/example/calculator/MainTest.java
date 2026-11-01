package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MainTest {

    @Test
    void testCorrectNumber() {
        assertEquals(5.5, Main.parseNumber("5.5"));
    }

    @Test
    void testTextInsteadOfNumber() {
        assertThrows(NumberFormatException.class, () -> Main.parseNumber("текст"));
    }
}