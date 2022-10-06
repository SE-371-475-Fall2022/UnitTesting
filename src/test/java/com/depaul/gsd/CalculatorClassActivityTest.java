package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorClassTest {
    CalculatorClassActivity calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    void initValue() {
        assertEquals(0, calculator.getValue(), "Initial value should be 0");
    }

    @Test
    @DisplayName("Ensure correct handling of zero")
    void addSeven() {
        calculator.add(7);
        assertEquals(7, calculator.getValue(), "Adding seven to zero should be seven");
    }

    @Test
    @DisplayName("Ensure correct handling of zero")
    void subTen() {
        calculator.subtract(10);
        assertEquals(-10, calculator.getValue(), "Subtracting ten from zero should be negative 10");
    }
}