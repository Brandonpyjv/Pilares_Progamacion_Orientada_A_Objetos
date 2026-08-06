package abstraccion.ejercicio3;

public class Lavadora extends Electrodomestico {

    public Lavadora(String marca) {
        super(marca);
    }
    @Override
    public void funcionPrincipal() {
        if (encendido) {
            System.out.println("Lavando ropa a 40 grados C durante 45 minutos...");
        } else {
            System.out.println("Enciendala primero.");
        }
    }
    // Metodo propio - solo lo tiene la Lavadora
    public void centrifugar() {
        if (encendido) {
            System.out.println("Centrifugando ropa...");
        } else {
            System.out.println("Enciendala primero.");
        }
    }
}
