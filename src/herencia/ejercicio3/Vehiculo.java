package herencia.ejercicio3;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double precio;
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public void describir() {
        System.out.printf("%s %s - $%,.0f%n", marca, modelo, precio);
    }
}
