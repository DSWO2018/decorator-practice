/**
 * Paquete de edxtends.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.User.ext;

import mx.iteso.User.User;

/**
 * Clase privileges.
 */
public abstract class Privileges extends User {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public abstract void setPrivilegs();
}
