package mx.iteso;

/**
 * clase publisher.
 */
public class Publisher extends User {

    /**
     * User usuario.
     */
    private User usuario;

    /**
     * constructor de publisher.
     * @param user     */
    public Publisher(final User user) {
        this.usuario = user;
    }

    /**
     * boolean publsh.
     * @return     */
    public final boolean publishing() {
        return true;
    }

    /**
     * boolean deleting.
     * @return     */
    public final boolean deleting() {
        return usuario.deleting();
    }

    /**
     * boolean approve.
     * @return     */
    public final boolean approving() {
        return usuario.approving();
    }

    /**
     * boolean comment.
     * @return     */
    public final boolean commenting() {
        return usuario.commenting();
    }
}

