package com.depaul.gsd;

import org.junit.jupiter.api.*;

//Static import helps to use assert methods directly, instead of e.g. Assert.assertEquals()
import static org.junit.jupiter.api.Assertions.*;


class CalculatorTestKatieRuane {

    CalculatorClassActivity calculatorActivity;

    @BeforeEach
    void setUp() {
        calculatorActivity = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Initialize to zero")
//    @Disabled("The method changed - Fix later")  //marks a test to be disabled.
    void calcGetValue() {

//      This is an assert statement which validates that expected and actual value is the same, if not the message at the end of the method is shown
        assertEquals(0, calculatorActivity.getValue(), "Initial value is zero");

    }

    @Test
    @DisplayName("Adding 7 from initial value")
//    @Disabled("The method changed - Fix later")  //marks a test to be disabled.
    void addSeven() {
        calculatorActivity.add(7);
//      This is an assert statement which validates that expected and actual value is the same, if not the message at the end of the method is shown
        assertEquals(7, calculatorActivity.getValue(), "Regular addition should work");

    }

    @Test
    @DisplayName("Subtracting 10 from initial value")
//    @Disabled("The method changed - Fix later")  //marks a test to be disabled.
    void subtractTen() {
        calculatorActivity.subtract(10);
//      This is an assert statement which validates that expected and actual value is the same, if not the message at the end of the method is shown
        assertEquals(-10, calculatorActivity.getValue(), "Regular subtraction should work");

    }
}