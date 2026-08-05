package herencia.ejercicio1;

public class Pajaro extends Animal {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad, "Pajaro");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace Pio pio!");
    }

    public void volar() {
        System.out.println(nombre + " esta volando");
    }
}
