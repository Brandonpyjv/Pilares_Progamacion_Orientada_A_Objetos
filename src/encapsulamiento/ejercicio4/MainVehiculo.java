package encapsulamiento.ejercicio4;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("ABC123", "Renault", "Logan");
        System.out.println("Vehiculo: " + v.getMarca() + " " + v.getModelo());
        v.acelerar();
        v.acelerar();
        v.acelerar();
        v.frenar();
        System.out.println("Velocidad final: " + v.getVelocidad() + " km/h");
        System.out.printf("Kilometraje total: %.2f km%n", v.getKilometrajeTotal());

        System.out.println("---");
        v.reset();
        System.out.println("Velocidad tras reset: " + v.getVelocidad() + " km/h");
    }
}
