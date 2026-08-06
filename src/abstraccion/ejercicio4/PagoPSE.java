package abstraccion.ejercicio4;

public class PagoPSE extends MedioPago {
    private String banco;
    public PagoPSE(double monto, String banco) {
        super(monto);
        this.banco = banco;
    }
    @Override
    public void procesarPago() {
        System.out.println("Redirigiendo al portal de " + banco + "...");
        System.out.println("Esperando confirmacion del banco...");
        System.out.println("Pago de $" + monto + " confirmado por " + banco + ".");
    }
}
