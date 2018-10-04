/**
 * Paquete de User.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.User;

import mx.iteso.User.ext.privileges.Publish;
import mx.iteso.User.ext.privileges.Delete;
import mx.iteso.User.ext.privileges.Approve;
import mx.iteso.User.ext.Publisher;
import mx.iteso.User.ext.Privileges;

/**
 * Clase main.
 */
public final class MyUsers {
    /**
     * Constructor.
     */
    private MyUsers() {
    }

    /**
     * Main class.
     *
     * @param args argumentos.
     */
    public static void main(final String[] args) {
        User user = new Publisher();
        System.out.println(user);
        user = new Delete(user);
        System.out.println(user);
        user = ((Privileges) user).getUser();
        System.out.println(user);
        user = new Approve(user);
        System.out.println(user);
        user = new Publish(user);
        System.out.println(user);

    }
}
