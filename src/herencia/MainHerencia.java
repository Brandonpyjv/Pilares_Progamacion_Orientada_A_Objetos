package herencia;

import herencia.ejercicio1.Gato;
import herencia.ejercicio1.Perro;


public class MainHerencia {

    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", 4);
        Gato michi = new Gato("Michi", 2);
        firulais.comer();
        firulais.hacerSonido();
        firulais.perseguirCola();

    }
}
