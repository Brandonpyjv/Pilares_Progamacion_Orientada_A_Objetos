package herencia;

/**
 * Punto de entrada del pilar HERENCIA.
 * Ejecuta todos los ejercicios de este pilar, uno tras otro.
 * <p>
 * Para agregar un ejercicio nuevo:
 * 1. Crear el paquete herencia.ejercicioN con sus clases.
 * 2. Agregar aqui un metodo privado ejercicioN().
 * 3. Llamarlo desde main().
 */
public class MainHerencia {

    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", 4);
        Gato michi = new Gato("Michi", 2);
        firulais.comer(); // Heredado del padre        firulais.hacerSonido(); // Sobrescrito        firulais.perseguirCola(); // Propio de Perro        System.out.println("---");        michi.dormir(); // Heredado del padre        michi.hacerSonido(); // Sobrescrito        michi.ronronear(); // Propio de Gato
    }
}
