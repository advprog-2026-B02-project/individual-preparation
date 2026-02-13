package com.example.individualprep.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {
    private final VectorUtility vector = new VectorUtility();

    @Test
    void testAdd() {
        // TODO: Implement test for add(v1, v2)
    }

    @Test
    void testSubtract() {
        // TODO: Implement test for subtract(v1, v2)
    }

    @Test
    void testMultiply() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] expected1 = {2.0, 4.0, 6.0};
        assertArrayEquals(expected1, vector.multiply(v1, 2), "vektor dikali skalar 2");

        double[] expected2 = {0.0, 0.0, 0.0};
        assertArrayEquals(expected2, vector.multiply(v1, 0), "vektor dikali skalar 0");

        double[] expected3 = {-1.0, -2.0, -3.0};
        assertArrayEquals(expected3, vector.multiply(v1, -1), "Vektor dikali skalar -1");

        double[] emptyV = {};
        assertArrayEquals(new double[]{}, vector.multiply(emptyV, 5), "vektor kosong dikali skalar");
    }

    @Test
    void testDotProduct() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};
        double result1 = vector.dotProduct(v1, v2);
        assertEquals(32.0, result1, 1e-9);

        double[] v3 = {};
        double[] v4 = {};
        double result2 = vector.dotProduct(v3, v4);
        assertEquals(0.0, result2, 1e-9);

        double[] v5 = {1.0};
        assertThrows(IllegalArgumentException.class, () -> vector.dotProduct(null, v5));

        double[] v6 = {1.0};
        assertThrows(IllegalArgumentException.class, () -> vector.dotProduct(v6, null));

        double[] v7 = {1.0, 2.0};
        double[] v8 = {3.0};
        assertThrows(IllegalArgumentException.class, () -> vector.dotProduct(v7, v8));
    }

    @Test
    void testNorm() {
        double[] v1 = {3.0, 4.0};
        assertEquals(5.0, vector.norm(v1), "Norm vektor {3, 4} harus 5");

        double[] v2 = {-3.0, -4.0};
        assertEquals(5.0, vector.norm(v2), "Norm vektor negatif {-3, -4} harus tetap 5");

        double[] vZero = {0.0, 0.0, 0.0};
        assertEquals(0.0, vector.norm(vZero), "Norm vektor nol harus 0");

        double[] v3 = {1.0, 2.0, 2.0};
        assertEquals(3.0, vector.norm(v3), "Norm vektor {1, 2, 2} harus 3");

        double[] emptyV = {};
        assertEquals(0.0, vector.norm(emptyV), "Norm vektor kosong harus 0");
    }
}