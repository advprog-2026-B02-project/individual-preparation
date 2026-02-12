package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {
    
    public double[] add(double[] v1, double[] v2) {
        int maxLength = Math.max(v1.length, v2.length);
        double[] result = new double[maxLength];

        for (int i = 0; i < maxLength; i++) {
            double val1 = (i < v1.length) ? v1[i] : 0;
            double val2 = (i < v2.length) ? v2[i] : 0;
            result[i] = val1 + val2;
        }
        return result;
    }
    public double[] subtract(double[] v1, double[] v2) {
        // TODO: Implement me properly!
        return new double[] { 0.0, 0.0, 0.0 };
    }

    public double[] multiply(double[] v1, int x) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] * x;
        }
        return result;
    }

    public double dotProduct(double[] v1, double[] v2) {
        if (v1 == null || v2 == null) {
            throw new IllegalArgumentException();
        }
        if (v1.length != v2.length) {
            throw new IllegalArgumentException();
        }

        double sum = 0.0;
        for (int i = 0; i < v1.length; i++) {
            sum += v1[i] * v2[i];
        }
        return sum;
    }
    
    public double norm(double[] v1) {
        double sum = 0;
        for(int i = 0; i < v1.length; i++){
            sum += v1[i] * v1[i];
        }
        return Math.sqrt(sum);
    }
}