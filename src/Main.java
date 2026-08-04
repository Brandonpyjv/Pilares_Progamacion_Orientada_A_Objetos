import Encapsulamiento.Ejercicio1.CuentaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("brandon", "brandon2", 200000);

        cuenta.depositar(100000);
        cuenta.retirar(100000);
        System.out.println(cuenta.getSaldo());





    }
}