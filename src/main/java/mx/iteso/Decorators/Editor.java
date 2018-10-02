package mx.iteso.Decorators;

import mx.iteso.User;

public class Editor extends User {
    /**
     * El editor creado
     */
    private User editor;

    /**
     * Method.
     * @param user User to complement
     */
    public Editor(final  User user) {
        this.editor = user;
    }
    /**
     * Method.
     * @return true if its able to publish
     */
    public final boolean publish() {
        return editor.publish();
    }

    /**
     * Method.
     * @return true if its able to comment
     */
    public final boolean comment() {
        return true;
    }

    /**
     * Method.
     * @return true if its able to delete comments
     */
    public final boolean delete() {
        return editor.delete();
    }

    /**
     * Method.
     * @return true if its able to approve comments
     */
    public final boolean approve() {
        return editor.approve();
    }
}
