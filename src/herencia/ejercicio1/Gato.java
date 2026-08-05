package herencia.ejercicio1;


public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace Miau Miau");
    }

    public void ronronear() {
        System.out.println(nombre + " Pruuuuu");
    }
}
