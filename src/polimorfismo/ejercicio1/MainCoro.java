package polimorfismo.ejercicio1;

public class MainCoro {
    public static void main(String[] args) {
        // POLIMORFISMO: arreglo del tipo padre con objetos hijos
        Animal[] animales = {
                new Perro("Firulais"),
                new Gato("Michi"),
                new Vaca("Lola"),
                new Loro("Pepito"),
                new Loro("Coco")
        };
        // Un solo bucle sirve para TODOS los tipos de animal, incluido Loro
        for (Animal a : animales) {
            a.hacerSonido(); // Java elige la version correcta
        }
    }
}
