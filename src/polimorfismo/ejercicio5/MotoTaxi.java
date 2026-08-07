package polimorfismo.ejercicio5;

public class MotoTaxi extends Vehiculo {
    public MotoTaxi(String placa) { super(placa); }
    @Override
    public void mover() {
        System.out.println("MotoTaxi " + placa +
                " avanza esquivando el trafico a 40 km/h.");
    }
    // Metodo propio de MotoTaxi
    public void recogerPasajero() {
        System.out.println("MotoTaxi " + placa + ": pasajero recogido.");
    }
}
