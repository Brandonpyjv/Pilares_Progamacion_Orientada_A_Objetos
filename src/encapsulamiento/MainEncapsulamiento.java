package encapsulamiento;

import encapsulamiento.ejercicio1.CuentaBancaria;

/**
 * Punto de entrada del pilar ENCAPSULAMIENTO.
 * Ejecuta todos los ejercicios de este pilar, uno tras otro.
 *
 * Para agregar un ejercicio nuevo:
 *   1. Crear el paquete encapsulamiento.ejercicioN con sus clases.
 *   2. Agregar aqui un metodo privado ejercicioN().
 *   3. Llamarlo desde main().
 */
public class MainEncapsulamiento {

    public static void main(String[] args) {
        ejercicio1();
    }

    /**
     * Ejercicio 1 - Cuenta bancaria.
     * El saldo es privado y solo se modifica por depositar(), retirar() y transferir(),
     * que validan las reglas del negocio. No existe setSaldo().
     */
    private static void ejercicio1() {
        System.out.println("##### EJERCICIO 1: CUENTA BANCARIA #####");

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
