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
        // TODO: Implement test for divide(o1, o2)
        // Hint: divide by zero!
    }

    @Test
    void testExponent() {
        assertEquals(100.0, arithmetic.exponent(10.0, 2), "10 ^ 2 harus 100");
        assertEquals(49.0, arithmetic.exponent(7.0, 2), "7 ^ 2 harus 49");
        assertEquals(0.5, arithmetic.exponent(2, -1), "2^-1 harus 0.5");
        assertEquals(0.25, arithmetic.exponent(2, -2), "2^-2 harus 0.25");
        assertEquals(1.0, arithmetic.exponent(1,0), "1^0 harus 1");
    }
}