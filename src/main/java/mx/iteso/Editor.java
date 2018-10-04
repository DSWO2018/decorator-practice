package mx.iteso;

/**
 * clase editor.
 */
public class Editor extends User {

    /**
     * User usuario.
     */
    private User usuario;

    /**
     * constrctor.
     * @param user     */
    public Editor(final User user) {
        this.usuario = user;
    }

    /**
     *boolean publish.
     * @return     */
    public final boolean publishing() {
        return usuario.publishing();
    }

    /**
     * delete.
     * @return     */
    public final boolean deleting() {
        return usuario.deleting();
    }

    /**
     * approve.
     * @return     */
    public final boolean approving() {
        return usuario.approving();
    }

    /**
     * comment.
     * @return     */
    public final boolean commenting() {
        return true;
    }
}

