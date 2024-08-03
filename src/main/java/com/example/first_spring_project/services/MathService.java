package com.example.first_spring_project.services;

public class MathService {
    public double sum(double n1, double n2) {
        return n1 + n2;
    }

    public double subtract(double n1, double n2) {
        return n1 - n2;
    }

    public double pow(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    public double multiply(double n1, double n2) {
        return n1 * n2;
    }

    public double divide(double n1, double n2) {
        return n1 / n2;
    }
}
