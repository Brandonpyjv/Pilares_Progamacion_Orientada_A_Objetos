package herencia.ejercicio4;

public class MainFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        Triangulo t = new Triangulo("Verde", 6, 4);
        c.describir();
        r.describir();
        t.describir();
    }
}
