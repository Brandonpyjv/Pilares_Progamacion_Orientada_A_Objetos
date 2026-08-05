package herencia.ejercicio2;

public class MainEjercicio2 {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Ana Lopez", "1234", 1500000, 350000);
        Gerente g = new Gerente("Pedro Ruiz", "5678", 3000000, 800000);
        AprendizSena a = new AprendizSena("Juan Perez", "9012", 1160000);
        v.mostrarInfo();
        System.out.println("---");
        g.mostrarInfo();
        System.out.println("---");
        a.mostrarInfo();
    }
}
