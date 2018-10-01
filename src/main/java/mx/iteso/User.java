package mx.iteso;

/**
 * usuario.
 */
public abstract class User {
    /**
     * Metodo.
     * @return Si el usuario puede, o no, publicar
     */
    public abstract boolean publish();

    /**
     * Metodo.
     * @return Si el usuario puede, o no, borrar comentarios
     */
    public abstract boolean delete();

    /**
     * Metodo.
     * @return Si el usuario puede, o no, aprobar comentarios
     */
    public abstract boolean approve();

    /**
     * Metodo.
     * @return Si el usuario puede, o no, comentar
     */
    public abstract boolean comment();
}
