package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {
    private final ArithmeticUtility arithmetic = new ArithmeticUtility();

    @Test
    void testAdd() {
        assertEquals(15.0, arithmetic.add(10.0, 5.0), "10 + 5 harus 15");

        assertEquals(-8.0, arithmetic.add(-3.0, -5.0), "-3 + -5 harus -8");

        assertEquals(5.0, arithmetic.add(10.0, -5.0), "10 + -5 harus 5");
        assertEquals(-2.0, arithmetic.add(3.0, -5.0), "3 + -5 harus -2");

        assertEquals(99.0, arithmetic.add(99.0, 0.0), "99 + 0 harus 99");
        assertEquals(0.0, arithmetic.add(0.0, 0.0), "0 + 0 harus 0");

        assertEquals(0.75, arithmetic.add(0.5, 0.25), "0.5 + 0.25 harus 0.75");
    }

    @Test
    void testSubtract() {
        assertEquals(5.0, arithmetic.subtract(10.0, 5.0), "10 - 5 harus 5");

        assertEquals(2.0, arithmetic.subtract(-3.0, -5.0), "-3 - (-5) harus 2");

        assertEquals(15.0, arithmetic.subtract(10.0, -5.0), "10 - (-5) harus 15");
        assertEquals(8.0, arithmetic.subtract(3.0, -5.0), "3 - (-5) harus 8");

        assertEquals(99.0, arithmetic.subtract(99.0, 0.0), "99 - 0 harus 99");
        assertEquals(0.0, arithmetic.subtract(0.0, 0.0), "0 - 0 harus 0");

        assertEquals(0.25, arithmetic.subtract(0.5, 0.25), "0.5 - 0.25 harus 0.25");
    }

    @Test
    void testMultiply() {
        assertEquals(50.0, arithmetic.multiply(10.0, 5.0), "10 * 5 harus 50");

        assertEquals(15.0, arithmetic.multiply(-3.0, -5.0), "-3 * -5 harus 15");
        assertEquals(-15.0, arithmetic.multiply(3.0, -5.0), "3 * -5 harus -15");

        assertEquals(0.0, arithmetic.multiply(0.0, 99.0), "0 * 99 harus 0");
        assertEquals(0.0, arithmetic.multiply(99.0, 0.0), "99 * 0 harus 0");

        assertEquals(0.25, arithmetic.multiply(0.5, 0.5), 1e-9, "0.5 * 0.5 harus 0.25");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, arithmetic.divide(10.0, 5.0), "10 / 5 harus 2");

        assertEquals(-2.0, arithmetic.divide(-10.0, 5.0), "-10 / 5 harus -2");
        assertEquals(2.0, arithmetic.divide(-10.0, -5.0), "-10 / -5 harus 2");

        assertEquals(0.0, arithmetic.divide(0.0, 5.0), "0 / 5 harus 0");
        assertEquals(0.5, arithmetic.divide(1.0, 2.0), "1 / 2 harus 0.5");

        assertEquals(Double.POSITIVE_INFINITY, arithmetic.divide(10.0, 0.0), "10 / 0 harus infinity");
        assertEquals(Double.NEGATIVE_INFINITY, arithmetic.divide(-10.0, 0.0), "-10 / 0 harus -infinity");
        assertTrue(Double.isNaN(arithmetic.divide(0.0, 0.0)), "0 / 0 harus NaN");
    }

    @Test
    void testExponent() {
        // TODO: Implement test for exponent(o1, n)
    }
}