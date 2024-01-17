package ejercicio2.app.src.main.java.ejercicio2.sisdis;

public class Main {

    public static void main(String[] args) {

        // Crear una instancia de la interfaz IValidarDatos usando la implementación ValidarDatos
        IValidarDatos validarDatos = new ValidarDatos();

        // Validar y mostrar texto
        System.out.println("Ingrese una cadena de solo texto:");
        String texto = validarDatos.validarSoloTexto();
        System.out.println("El texto ingresado es: " + texto);

        // Validar y mostrar número entero
        System.out.println("Ingrese un número entero:");
        int entero = validarDatos.validarEntero();
        System.out.println("El número entero ingresado es: " + entero);

        // Validar y mostrar número entero dentro de un rango
        System.out.println("Ingrese un número entero dentro de un rango:");
        int enteroConRango = validarDatos.validarEnteroConRango();
        System.out.println("El número entero ingresado es: " + enteroConRango);

        // Validar y mostrar número entero positivo mayor a 0
        System.out.println("Ingrese un número entero positivo mayor a 0:");
        int enteroPositivo = validarDatos.validarEnteroPositivo();
        System.out.println("El número entero positivo ingresado es: " + enteroPositivo);

        // Validar y mostrar número entero negativo menor a 0
        System.out.println("Ingrese un número entero negativo menor a 0:");
        int enteroNegativo = validarDatos.validarEnteroNegativo();
        System.out.println("El número entero negativo ingresado es: " + enteroNegativo);

        // Validar y mostrar número decimal
        System.out.println("Ingrese un número decimal:");
        double decimal = validarDatos.validarDecimal();
        System.out.println("El número decimal ingresado es: " + decimal);

        // Validar y mostrar número decimal dentro de un rango
        System.out.println("Ingrese un número decimal dentro de un rango:");
        double decimalConRango = validarDatos.validarDecimalConRango();
        System.out.println("El número decimal ingresado es: " + decimalConRango);

        // Validar y mostrar número decimal positivo mayor a 0
        System.out.println("Ingrese un número decimal positivo mayor a 0:");
        double decimalPositivo = validarDatos.validarDecimalPositivo();
        System.out.println("El número decimal positivo ingresado es: " + decimalPositivo);

        // Validar y mostrar número decimal negativo menor a 0
        System.out.println("Ingrese un número decimal negativo menor a 0:");
        double decimalNegativo = validarDatos.validarDecimalNegativo();
        System.out.println("El número decimal negativo ingresado es: " + decimalNegativo);
    }
}
