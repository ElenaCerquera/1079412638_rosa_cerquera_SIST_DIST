// Interfaz que define una operación
interface OperacionR {
    int calcular(int a, int b);
}

// Clase que implementa la operación de suma
class SumaR implements OperacionR {
    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
}

// Clase que implementa la operación de multiplicación sin modificar la clase Suma
class Multiplicacionr implements OperacionR {
    @Override
    public int calcular(int a, int b) {
        return a * b;
    }
}

// Clase principal con la función main para probar las clases
public class MainOCP {
    public static void main(String[] args) {
        // Uso de la interfaz Operacion con la implementación Suma
        OperacionR suma = new SumaR();
        int resultadoSuma = suma.calcular(10, 20);
        System.out.println("Resultado de la suma: " + resultadoSuma);

        // Uso de la interfaz Operacion con la implementación Multiplicacion
        OperacionR multiplicacion = new Multiplicacionr();
        int resultadoMultiplicacion = multiplicacion.calcular(5, 4);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
    }
}