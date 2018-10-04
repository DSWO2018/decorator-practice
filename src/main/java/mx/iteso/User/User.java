/**
 * Paquete de User.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.User;

/**
 * Clase base de usuarios.
 */
public abstract class User {
    /**
     * Variable para publish.
     */
    private boolean publish = false;
    /**
     * Variable para approve.
     */
    private boolean approve = false;
    /**
     * Variable para delete.
     */
    private boolean delete = false;
    /**
     * Variable para comment.
     */
    private boolean comment = false;
    /**
     * Variable para publishContent type.
     */
    private String publishContent = "";

    /**
     * Se modifican los tipo de privilegios.
     */
    public abstract void setPrivilegs();

    /**
     * Se retorna el tipo de calibración.
     *
     * @return retorna la calibracion.
     */
    public final boolean isPublish() {
        return publish;
    }

    /**
     * Se da el tipo de calibración.
     *
     * @param publishV da el tipo a publish type.
     */
    public final void setPublish(final boolean publishV) {
        this.publish = publishV;
        if (publish) {
            setPublishContent("everyone");
        } else {
            setPublishContent("own");
        }
    }

    /**
     * Se retorna el tipo de approve.
     *
     * @return retorna la approve.
     */
    public final boolean isApprove() {
        return approve;
    }

    /**
     * Se da el tipo de approve.
     *
     * @param approveV da el tipo a approve.
     */
    public final void setApprove(final boolean approveV) {
        this.approve = approveV;
    }

    /**
     * Se retorna el tipo de delete.
     *
     * @return retorna la delete.
     */
    public final boolean isDelete() {
        return delete;
    }

    /**
     * Se da el tipo de delete.
     *
     * @param deleteV da el tipo a delete.
     */
    public final void setDelete(final boolean deleteV) {
        this.delete = deleteV;
    }

    /**
     * Se retorna el tipo de commet.
     *
     * @return retorna la commet.
     */
    public final boolean isComment() {
        return comment;
    }

    /**
     * Se da el tipo de comment.
     *
     * @param commentV da el tipo a commet.
     */
    public final void setComment(final boolean commentV) {
        this.comment = commentV;
    }

    /**
     * Se retorna el tipo de calibración.
     *
     * @return retorna la calibracion.
     */
    public final String getPublishContent() {
        return publishContent;
    }

    /**
     * Se da el tipo de calibración.
     *
     * @param publishContentV da el tipo a calibrar.
     */
    private void setPublishContent(final String publishContentV) {
        this.publishContent = publishContentV;
    }

    @Override
    public final String toString() {

        return "User{"
                + " publish='"
                + getPublishContent() + '\''
                + ", approve="
                + isApprove()
                + ", delete=" + isDelete()
                + ", comment=" + isComment()
                + '}';
    }
}
