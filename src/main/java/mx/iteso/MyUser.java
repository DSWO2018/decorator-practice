package mx.iteso;

import mx.iteso.userType.Admin;
import mx.iteso.userType.Editor;

/**
 * Class for main.
 */
final class MyUser {
    /**Constructor. */
    private MyUser() {
    }
    /**
     * @param args .
     */
    public static void main(final String[] args) {
        User usuario = new Publisher();
        System.out.println(usuario.getDescription() + " Privilegios: ");
        System.out.println(usuario.approve());
        System.out.println(usuario.comment());
        System.out.println(usuario.delete());
        System.out.println(usuario.publish());

        System.out.println();
        usuario = new Editor(usuario);
        System.out.println(usuario.getDescription() + " Privilegios: ");
        System.out.println(usuario.approve());
        System.out.println(usuario.comment());
        System.out.println(usuario.delete());
        System.out.println(usuario.publish());

        System.out.println();
        usuario = new Admin(usuario);
        System.out.println(usuario.getDescription() + " Privilegios: ");
        System.out.println(usuario.approve());
        System.out.println(usuario.comment());
        System.out.println(usuario.delete());
        System.out.println(usuario.publish());

    }
}
