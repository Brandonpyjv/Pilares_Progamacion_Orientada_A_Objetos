package herencia.ejercicio1;

public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace Guau Guau");
    }

    public void perseguirCola() {
        System.out.println(nombre + " persigue cola");
    }



}