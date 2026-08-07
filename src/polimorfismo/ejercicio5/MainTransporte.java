package polimorfismo.ejercicio5;

public class MainTransporte {
    public static void main(String[] args) {
        Vehiculo[] flota = {
                new Bus("BUS-001"),
                new Taxi("TAX-555"),
                new Bicicleta("BIC-777"),
                new Bus("BUS-002"),
                new MotoTaxi("MTX-111"),
                new MotoTaxi("MTX-222")
        };

        // Polimorfismo: cada uno responde a su manera
        for (Vehiculo v : flota) {
            v.mover();

            // instanceof + casting para acceder a metodos propios de Bus
            if (v instanceof Bus) {
                Bus b = (Bus) v;
                b.abrirPuertas();
            }

            // instanceof + casting para acceder a metodos propios de MotoTaxi
            if (v instanceof MotoTaxi) {
                MotoTaxi m = (MotoTaxi) v;
                m.recogerPasajero();
            }
        }
    }
}
