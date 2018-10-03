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
     * Variable para.
     */
    private boolean publish = false;
    /**
     * Variable para.
     */
    private boolean approve = false;
    /**
     * Variable para.
     */
    private boolean delete = false;
    /**
     * Variable para.
     */
    private boolean comment = false;
    /**
     * Variable para.
     */
    private String publishContent = "";

    /**
     * Se retorna el tipo de calibración.
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
     * @param publishV da el tipo a calibrar.
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
     * Se retorna el tipo de calibración.
     *
     * @return retorna la calibracion.
     */
    public final boolean isApprove() {
        return approve;
    }

    /**
     * Se da el tipo de calibración.
     *
     * @param approveV da el tipo a calibrar.
     */
    public final void setApprove(final boolean approveV) {
        this.approve = approveV;
    }

    /**
     * Se retorna el tipo de calibración.
     *
     * @return retorna la calibracion.
     */
    public final boolean isDelete() {
        return delete;
    }

    /**
     * Se da el tipo de calibración.
     *
     * @param deleteV da el tipo a calibrar.
     */
    public final void setDelete(final boolean deleteV) {
        this.delete = deleteV;
    }

    /**
     * Se retorna el tipo de calibración.
     *
     * @return retorna la calibracion.
     */
    public final boolean isComment() {
        return comment;
    }

    /**
     * Se da el tipo de calibración.
     *
     * @param commentV da el tipo a calibrar.
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
    private final void setPublishContent(final String publishContentV) {
        this.publishContent = publishContentV;
    }

    @Override
    public final String toString() {

        return "User{" +
                " publish='" + getPublishContent() + '\'' +
                ", approve=" + isApprove() +
                ", delete=" + isDelete() +
                ", comment=" + isComment() +
                '}';
    }
}
