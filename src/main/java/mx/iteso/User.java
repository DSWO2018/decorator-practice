package mx.iteso;

/**
 * clase usuario.
 */
public abstract class User {

    /**
     * boolean abstract publish.
     * @return     */
    public abstract boolean publishing();

    /**
     * abstract boolean delete.
     * @return     */
    public abstract boolean deleting();
    /**
     * abstract boolean approve.
     * @return     */
    public abstract boolean approving();

    /**
     * abstract boolean coomment.
     * @return     */
    public abstract boolean commenting();
}

