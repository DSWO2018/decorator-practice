
package mx.iteso;
//package info.java;

/**
 * clase admin.
 *
 */
public class Admin extends User {
    /**
     * Usuario.
     */
    private User usuario;

    /**
     * Admin.
     * @param user     */
    public Admin(final User user) {
        this.usuario = user;
    }

    /**
     *boolean publishing.
     * @return     */
    public final boolean publishing() {
        return usuario.publishing();
    }

    /**
     * boolean delete.
     * @return     */
    public final boolean deleting() {
        return true;
    }

    /**
     * booleab approve.
     * @return     */
    public final boolean approving() {
        return true;
    }

    /**
     * boolean comentar.
     * @return     */
    public final boolean commenting() {
        return usuario.commenting();
    }
}

