package com.github.sonarcloud.playground;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(11, calculator.add(5, 6));
    }

    @Test
    public void testOdd() {
        assertTrue(calculator.isOdd(5));
        assertFalse(calculator.isOdd(4));
    }
}
