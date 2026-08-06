package abstraccion.ejercicio1;

public class MainEjercicio1 {
    public static void main(String[] args) {

        // Figura f = new Figura("X"); ERROR: no se puede instanciar
        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(4, 6);
        Rectangulo r = new Rectangulo(3, 7);
        Cuadrado cu = new Cuadrado(4);
            c.mostrar();
            System.out.println("---");
            t.mostrar();
            System.out.println("---");
            r.mostrar();
            System.out.println("---");
            cu.mostrar();
    }
}
