package Encapsulamiento.Ejercicio1;

public class CuentaBancaria{

    //Atributos privados - encapsulamiento

    private String numeroCuenta;
    private String titular;
    private double saldo;


    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        if(cantidad>0) {
            double saldoini = saldo;
            double valor = (this.saldo += cantidad);
            System.out.println("Saldo inicial: " + saldoini + " | Saldo depositado: " + cantidad + " | Saldo total: " + valor);
        }
    }
    public void retirar(double cantidad){
        if(cantidad<saldo) {
            double saldoini = saldo;
            double valor = this.saldo -= cantidad;
            System.out.println("Saldo inicial: " + saldoini + " | Saldo retirado: " + cantidad + " | Saldo total: " + valor);
        }

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


