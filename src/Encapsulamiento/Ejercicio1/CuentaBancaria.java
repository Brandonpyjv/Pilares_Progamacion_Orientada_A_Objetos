package Encapsulamiento.Ejercicio1;

public class CuentaBancaria{

    //Atributos privados - encapsulamiento

    private String numeroCuenta;
    private String titular;
    private double saldo;


    public CuentaBancaria(String numeroCuenta, String titular) {
        this(numeroCuenta, titular, 0.0);
    }

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        // Ni siquiera el constructor puede dejar la cuenta en rojo
        this.saldo = (saldoInicial > 0) ? saldoInicial : 0.0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Solo lectura: NO existe setSaldo(). El saldo unicamente cambia
    // a traves de depositar(), retirar() y transferir().
    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double cantidad){
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a depositar debe ser positiva.");
            return false;
        }
        double saldoInicial = saldo;
        saldo += cantidad;
        System.out.println("Deposito exitoso | Saldo inicial: $" + saldoInicial +
                " | Depositado: $" + cantidad + " | Saldo total: $" + saldo);
        return true;
    }

    public boolean retirar(double cantidad){
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a retirar debe ser positiva.");
            return false;
        }
        if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente. Disponible: $" + saldo +
                    " | Solicitado: $" + cantidad);
            return false;
        }
        double saldoInicial = saldo;
        saldo -= cantidad;
        System.out.println("Retiro exitoso | Saldo inicial: $" + saldoInicial +
                " | Retirado: $" + cantidad + " | Saldo total: $" + saldo);
        return true;
    }

    /**
     * Mueve dinero de esta cuenta a la cuenta destino.
     * La operacion es atomica: o se retira Y se deposita, o no pasa nada.
     */
    public boolean transferir(CuentaBancaria destino, double cantidad) {
        if (destino == null) {
            System.out.println("Error: la cuenta destino no existe.");
            return false;
        }
        if (destino == this) {
            System.out.println("Error: no puedes transferirte dinero a ti mismo.");
            return false;
        }
        // depositar() y retirar() ya validan cantidad positiva y saldo suficiente,
        // asi que no repetimos esas reglas aqui.
        if (!retirar(cantidad)) {
            System.out.println("Transferencia cancelada: no se pudo retirar de " + numeroCuenta);
            return false;
        }
        if (!destino.depositar(cantidad)) {
            // Si el deposito fallara, devolvemos el dinero para no perderlo
            saldo += cantidad;
            System.out.println("Transferencia revertida: no se pudo depositar en " + destino.getNumeroCuenta());
            return false;
        }
        System.out.println("Transferencia exitosa de $" + cantidad +
                " | De: " + titular + " (" + numeroCuenta + ")" +
                " -> Para: " + destino.getTitular() + " (" + destino.getNumeroCuenta() + ")");
        return true;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
