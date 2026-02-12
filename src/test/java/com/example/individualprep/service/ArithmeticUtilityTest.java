package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {
    private final ArithmeticUtility arithmetic = new ArithmeticUtility();

    @Test
    void testAdd() {
        // TODO: Implement test for add(o1, o2)
    }

    @Test
    void testSubtract() {
        // TODO: Implement test for subtract(o1, o2)
    }

    @Test
    void testMultiply() {
        assertEquals(50.0, arithmetic.multiply(10.0, 5.0), "10 * 5 harus 50");

        assertEquals(15.0, arithmetic.multiply(-3.0, -5.0), "-3 * -5 harus 15");
        assertEquals(-15.0, arithmetic.multiply(3.0, -5.0), "3 * -5 harus -15");

        assertEquals(0.0, arithmetic.multiply(0.0, 99.0), "0 * 99 harus 0");
        assertEquals(0.0, arithmetic.multiply(99.0, 0.0), "99 * 0 harus 0");

        assertEquals(0.25, arithmetic.multiply(0.5, 0.5), "0.5 * 0.5 harus 0.25");
    }

    @Test
    void testDivide() {
        // TODO: Implement test for divide(o1, o2)
        // Hint: divide by zero!
    }

    @Test
    void testExponent() {
        // TODO: Implement test for exponent(o1, n)
    }
}