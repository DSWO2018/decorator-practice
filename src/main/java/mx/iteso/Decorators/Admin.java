package mx.iteso.Decorators;

import mx.iteso.User;

/**
 * Clase
 */
public class Admin extends User {
    /**
     *
     */
    private User admin;

    /**
     * Method.
     * @param user Admint to complement
     */
    public Admin(final User user) {
        this.admin = user;
    }

    /**
     * Method.
     * @return true if its able to publish
     */
    public final boolean publish() {
        return admin.publish();
    }

    /**
     * Method.
     * @return true if its able to comment
     */
    public final boolean comment() {
        return admin.comment();
    }

    /**
     * Method.
     * @return true if its able to delete comments
     */
    public final boolean delete() {
        return true;
    }

    /**
     * Method.
     * @return true if its able to approve comments
     */
    public final boolean approve() {
        return true;
    }
}
