package mx.iteso.Decorators;

import mx.iteso.User;

/**
 * clase.
 */
public class Editor extends User {

    /**
     * el usuario .
     */

    private User editor;
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
     * @return si el usuario puede o no eleminar.
     */
    public final boolean delete() {
        return false;
    }

    /**
     * @return tsi el usuario puede o no aprobar.
     */
    public final boolean approve() {
        return false;
    }
}
