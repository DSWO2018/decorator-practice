package mx.iteso.Decorators;

import mx.iteso.User;

/**
 * Clase
 */
public class Admin extends User {

    /**
     * Method.
     * @return true if its able to publish
     */
    public final boolean publish() {
        return false;
    }

    /**
     * Method.
     * @return true if its able to comment
     */
    public final boolean comment() {
        return false;
    }

    /**
     * Method.
     * @return true if its able to delete comments
     */
    public final boolean delete() {
        return false;
    }

    /**
     * Method.
     * @return true if its able to approve comments
     */
    public final boolean approve() {
        return false;
    }
}
