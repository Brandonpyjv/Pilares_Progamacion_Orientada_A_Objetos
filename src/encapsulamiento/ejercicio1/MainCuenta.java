package encapsulamiento.ejercicio1;

public class MainCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("001-2345", "Carlos Perez");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());
        cuenta.depositar(500000);
        cuenta.retirar(150000);
        cuenta.retirar(1000000); // Debe fallar por saldo insuficiente
        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }
}
