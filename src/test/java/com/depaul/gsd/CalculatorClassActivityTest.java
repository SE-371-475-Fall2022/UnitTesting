package com.depaul.gsd;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.depaul.gsd.CalculatorClassActivity;

public class CalculatorClassActivityTest {
    CalculatorClassActivity calculator2;

    //  The method annotated with @BeforeEach runs before each test
    @BeforeEach
    void setUp() {
        calculator2 = new CalculatorClassActivity();
    }
    @Test
    void testAdd() {
        calculator2.add(4);
        assertEquals(4, calculator2.getValue()); 
    }
    
    @Test
    void testGetValue() {
        assertEquals(0, calculator2.getValue());
    }

    @Test
    void testSubtract() {
        calculator2.subtract(5);
        assertEquals(-5, calculator2.getValue()); 

    }
}
