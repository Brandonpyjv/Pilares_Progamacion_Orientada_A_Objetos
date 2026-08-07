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

        System.out.println("---");

        CuentaBancaria destino = new CuentaBancaria("009-8765", "Ana Lopez");
        System.out.println("Saldo " + cuenta.getTitular() + ": $" + cuenta.getSaldo());
        System.out.println("Saldo " + destino.getTitular() + ": $" + destino.getSaldo());

        cuenta.transferir(destino, 100000);
        cuenta.transferir(destino, 999999999); // Debe fallar por saldo insuficiente
        cuenta.transferir(destino, -50000); // Debe fallar por cantidad negativa

        System.out.println("Saldo final " + cuenta.getTitular() + ": $" + cuenta.getSaldo());
        System.out.println("Saldo final " + destino.getTitular() + ": $" + destino.getSaldo());
    }
}
