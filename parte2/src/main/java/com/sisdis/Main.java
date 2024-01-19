package com.sisdis;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el radio del círculo:");
        Circulo circulo = new Circulo(5);
        System.out.println("El área del círculo es: " + circulo.calcularArea());

        System.out.println("Ingrese la base del triángulo:");
        double base = 5;
        System.out.println("Ingrese la altura del triángulo:");
        double altura = 5;
        Triangulo triangulo = new Triangulo(base, altura);
        System.out.println("El área del triángulo es: " + triangulo.calcularArea());

        System.out.println("Ingrese el lado del cuadrado:");
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
    }
}