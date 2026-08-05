import Encapsulamiento.Ejercicio1.CuentaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuentaBrandon = new CuentaBancaria("001-2345", "Brandon Restrepo", 200000);
        CuentaBancaria cuentaCarlos  = new CuentaBancaria("001-9876", "Carlos Perez");

        System.out.println("=== ESTADO INICIAL ===");
        System.out.println(cuentaBrandon);
        System.out.println(cuentaCarlos);

        System.out.println("\n=== DEPOSITOS Y RETIROS ===");
        cuentaBrandon.depositar(100000);
        cuentaBrandon.depositar(-5000);   // Debe fallar: cantidad negativa
        cuentaBrandon.retirar(100000);
        cuentaBrandon.retirar(1000000);   // Debe fallar: saldo insuficiente

        System.out.println("\n=== TRANSFERENCIAS ===");
        cuentaBrandon.transferir(cuentaCarlos, 150000);   // OK
        cuentaBrandon.transferir(cuentaCarlos, 999999);   // Debe fallar: saldo insuficiente
        cuentaBrandon.transferir(cuentaCarlos, -1000);    // Debe fallar: cantidad negativa
        cuentaBrandon.transferir(cuentaBrandon, 1000);    // Debe fallar: misma cuenta
        cuentaBrandon.transferir(null, 1000);             // Debe fallar: destino inexistente

        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Saldo " + cuentaBrandon.getTitular() + ": $" + cuentaBrandon.getSaldo());
        System.out.println("Saldo " + cuentaCarlos.getTitular() + ": $" + cuentaCarlos.getSaldo());
        System.out.println("Suma de los dos saldos: $" + (cuentaBrandon.getSaldo() + cuentaCarlos.getSaldo()));

        // cuentaBrandon.saldo = -999;        // No compila: el atributo es private
        // cuentaBrandon.setSaldo(-999);      // No compila: el metodo no existe
    }
}
