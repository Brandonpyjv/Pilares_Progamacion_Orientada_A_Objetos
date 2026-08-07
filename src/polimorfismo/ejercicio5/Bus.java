package polimorfismo.ejercicio5;

public class Bus extends Vehiculo {
    public Bus(String placa) { super(placa); }
    @Override
    public void mover() {
        System.out.println("Bus " + placa +
                " avanza con 40 pasajeros a 60 km/h.");
    }
    // Metodo propio de Bus (no lo tienen los otros)
    public void abrirPuertas() {
        System.out.println("Bus " + placa + ": puertas abiertas.");
    }
}
