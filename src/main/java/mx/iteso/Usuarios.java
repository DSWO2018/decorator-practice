package mx.iteso;

import mx.iteso.complements.Admin;
import mx.iteso.complements.Editor;
import mx.iteso.complements.Publisher;

/**
 * Clase para testear permisos.
 */
public final class Usuarios {

    /**
     * Necesario para que checkstyle no llore.
     */
    private Usuarios() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
    }
    /**
     *
     * @param args argumentos.
     */
    public static void main(final String[] args) {
        User joaquinPerez;
        joaquinPerez = new UsuarioBase();

        printPermisos(joaquinPerez);

        joaquinPerez = new Admin(joaquinPerez);

        printPermisos(joaquinPerez);

        joaquinPerez = new Publisher(joaquinPerez);

        joaquinPerez.comment();

        printPermisos(joaquinPerez);

        joaquinPerez = new Editor(joaquinPerez);

        printPermisos(joaquinPerez);

    }

    /**
     * Imprimir permisos.
     * @param user usuario
     */
    public static void printPermisos(final User user) {
        System.out.println("El usuario tiene los siguiente permisos");
        if (user.publish()) {
            System.out.println("Puede publicar");
        } else {
            System.out.println("No puede publicar");
        }

        if (user.comment()) {
            System.out.println("Puede comentar");
        } else {
            System.out.println("No puede comentar");
        }

        if (user.delete()) {
            System.out.println("Puede borrar comentarios");
        } else {
            System.out.println("No puede borrar comentarios");
        }

        if (user.approve()) {
            System.out.println("Puede aprobar comentarios");
        } else {
            System.out.println("No puede aprobar comentarios");
        }

        System.out.println("");
    }
}
