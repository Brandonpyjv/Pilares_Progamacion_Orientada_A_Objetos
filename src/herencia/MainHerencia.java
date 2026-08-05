package herencia;

import herencia.ejercicio1.Gato;
import herencia.ejercicio1.Pajaro;
import herencia.ejercicio1.Perro;


public class MainHerencia {

    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", 4);
        Gato michi = new Gato("Michi", 2);
        Pajaro piolin = new Pajaro("Piolin", 1);

        firulais.presentarse();
        firulais.comer();
        firulais.hacerSonido();
        firulais.perseguirCola();

        System.out.println("__________________________");

        michi.presentarse();
        michi.dormir();
        michi.hacerSonido();
        michi.ronronear();
        michi.comer();

        System.out.println("__________________________");

        piolin.presentarse();
        piolin.comer();
        piolin.hacerSonido();
        piolin.volar();
    }
}
