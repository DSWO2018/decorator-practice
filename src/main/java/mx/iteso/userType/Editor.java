package mx.iteso.userType;

import mx.iteso.User;

/**
 * Editor class.
 */
public class Editor extends UserType {

    /** User type var.*/
   private User user;

    /**
     * @param usuario .
     */
    public Editor(final User usuario) {
        this.user = usuario;
    }

    /**
     * @return .
     */
    public final String getDescription() {
        return "Editor";
    }

    /**
     * @return .
     */
    public final String publish() {
        return user.publish();
    }

    /**
     * @return .
     */
    public final String approve() {
        return "Approve: YES";
    }

    /**
     * @return .
     */
    public final String delete() {
        return user.delete();
    }

    /**
     * @return .
     */
    public final String comment() {
        return user.comment();
    }


}
