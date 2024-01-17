public class MainSRP {
    // Clase con una única responsabilidad: manejar la lógica de impresión
    static class Impresor {
        public void imprimir(String mensaje) {
            System.out.println(mensaje);
        }
    }

    // Clase con otra responsabilidad: procesar datos
    static class ProcesadorDatos {
        public int sumar(int a, int b) {
            return a + b;
        }
    }

    // Función main para probar las clases
    public static void main(String[] args) {
        // Uso de la clase Impresor
        Impresor impresor = new Impresor();
        impresor.imprimir("Hola, este es un mensaje de prueba.");

        // Uso de la clase ProcesadorDatos
        ProcesadorDatos procesador = new ProcesadorDatos();
        int resultado = procesador.sumar(5, 3);
        System.out.println("La suma es: " + resultado);
    }

}
// Interfaz que define una operación
interface Operacion {
    int calcular(int a, int b);
}

// Clase que implementa la operación de suma
class Suma implements OperacionR {
    @Override
    public int calcular(int a, int b) {
        return a + b;
    }
}

// Clase que implementa la operación de multiplicación sin modificar la clase Suma
class Multiplicacion implements OperacionR {
    @Override
    public int calcular(int a, int b) {
        return a * b;
    }
}
