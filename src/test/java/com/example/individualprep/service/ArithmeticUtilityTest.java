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