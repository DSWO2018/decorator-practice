package mx.iteso;

/**
 * Usuario.
 */
public class UsuarioBase extends User {
    /**
     * @return si el usuario puede o no publicar
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
     * @return si el usuario puede o no aprobar.
     */
    public final boolean approve() {
        return false;
    }
}
