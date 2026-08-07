package polimorfismo.ejercicio2;

public class Calculadora {

    // Suma de 2 enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Suma de 3 enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Suma de 2 decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // Concatenacion de cadenas
    public String sumar(String a, String b) {
        return a + " " + b;
    }

    // Suma de un entero con un decimal
    public double sumar(int a, double b) {
        return a + b;
    }

    // Suma total de un arreglo de enteros
    public int sumar(int[] numeros) {
        int total = 0;
        for (int n : numeros) {
            total += n;
        }
        return total;
    }
}
