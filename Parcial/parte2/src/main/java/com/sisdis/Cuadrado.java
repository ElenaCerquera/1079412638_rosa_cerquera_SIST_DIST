package com.sisdis;

public class Cuadrado implements FiguraGeometrica {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

}
