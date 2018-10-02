package mx.iteso.Decorators;

import mx.iteso.User;

/**
*clase principal de usuario.
 */
public class Admin extends User {

    /**
     * @return si el usuario puede o no publicar.
     */
    public final boolean publish() {
        return false;
    }

    /**
     * @return si el usuario puede o no comentar.
     */
    public final boolean comment() {
        return false;
    }

    /**
     * @return si el usuario puede o no eliminar comentarios.
     */
    public final boolean delete() {
        return false;
    }

    /**
     * @return si el usuario puede o no aprobar comentarios.
     */
    public final boolean approve() {
        return false;
    }
}
