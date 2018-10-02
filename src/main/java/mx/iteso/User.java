package mx.iteso;

/**
* clase usuario.
 * */

public abstract class User {

    /**
     * @return si el usuario puede no publicar.
     */
    public abstract boolean publish();

    /**
     * @return si el usuario puede  comentar.
     */
    public abstract boolean comment();

    /**
     * @return si el usuario puede aprobar.
     */
    public abstract boolean approve();

    /**
     * @return tsi el usuario puede  eliminar comentarios.
     * *
     */
    public abstract boolean delete();




}
