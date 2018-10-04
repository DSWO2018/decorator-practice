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
    /**
     * Variable para usuario.
     */
    private User user;
    /**
     * Se retorna al usuario almacenado.
     *
     * @return  usuario.
     */
    public final User getUser() {
        return user;
    }
    /**
     * Se da el tipo de user.
     *
     * @param userV da el tipo a user.
     */
    public final void setUser(final User userV) {
        this.user = userV;
    }

    /**
     * Se modifican los tipo de privilegios.
     */
    @Override
    public abstract void setPrivilegs();
}
