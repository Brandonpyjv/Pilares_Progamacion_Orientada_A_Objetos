package polimorfismo.ejercicio4;

public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;
    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}
