package com.softtek.pruebasunitarias1.ejercicio1.model;

public class Calculadora {

    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplica(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a / b;
    }
}
