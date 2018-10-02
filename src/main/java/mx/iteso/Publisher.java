package mx.iteso.Decorators;

import mx.iteso.User;

/**
 * usuario con privilegios.
 */

public class Publisher extends User {
    /**
     * usuario.
     */
    private User usuario;

    /**
     * @param user a complementar.
     */
    public Publisher(final User user) {
        this.usuario = user;
    }

    /**
     * @return si el usuario puede  publicar.
     */
    public final boolean publish() {
        return true;
    }

    /**
     * @return si el usuario puede  comentar.
     */
    public final boolean comment() {
        return usuario.comment();
    }

    /**
     * @return si el usuario puede  eliminar
     */
    public final boolean delete() {
        return usuario.delete();
    }

    /**
     * @return si el usuario puede aprobar.
     */
    public final boolean approve() {
        return usuario.approve();
    }
}
