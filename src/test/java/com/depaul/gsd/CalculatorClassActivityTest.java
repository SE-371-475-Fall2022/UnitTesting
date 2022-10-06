package com.depaul.gsd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {
    CalculatorClassActivity test;
    @BeforeEach
    void setUp() {
        test = new CalculatorClassActivity();
    }

   /* @AfterEach
    void tearDown() {
    }*/

    @Test
    void add() {
        test.add(7);
        assertEquals(7, test.getValue());
    }

    @Test
    void subtract() {
        test.subtract(10);
        assertEquals(-10,test.getValue());
    }

    @Test
    void getValue() {
        int value = test.getValue();
        int expected = 0;
        assertEquals(expected,value);
    }
}