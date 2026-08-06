package abstraccion.ejercicio1;

// Error del compilador al no implementar calcularArea():
// "Cuadrado is not abstract and does not override abstract method calcularArea() in Figura"
// Java obliga a las clases concretas a implementar todos los metodos abstractos heredados.
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
