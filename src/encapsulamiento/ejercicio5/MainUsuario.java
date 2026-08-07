package encapsulamiento.ejercicio5;

public class MainUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("carlos.dev", "clave1234");
        System.out.println("Usuario: " + u.getNombreUsuario());
        u.cambiarPassword("hola"); // Invalida
        System.out.println("Login OK? " + u.verificarPassword("clave1234"));
        System.out.println("Login mal? " + u.verificarPassword("otra"));
        u.cambiarPassword("nuevaClave9");
        System.out.println("Login nuevo? " + u.verificarPassword("nuevaClave9"));

        System.out.println("---");

        Usuario u2 = new Usuario("ana.dev", "clave5678");
        u2.verificarPassword("mala1"); // Fallo 1
        u2.verificarPassword("mala2"); // Fallo 2
        u2.verificarPassword("mala3"); // Fallo 3 - bloquea la cuenta
        System.out.println("Cuenta bloqueada? " + u2.isBloqueado());
        System.out.println("Login con clave correcta tras bloqueo? " +
                u2.verificarPassword("clave5678"));
    }
}
