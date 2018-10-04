package mx.iteso.userType;

import mx.iteso.User;

/**
 *  Admin class.
 */
public class Admin extends UserType {
    /**User type var. */
    private User user;

    /**
     * @param usuario .
     */
    public Admin(final User usuario) {
        this.user = usuario;
    }

    /**
     * @return .
     */
    public final String getDescription() {
        return "Admin";
    }
    /**
     * @return .
     */
    public final String publish() {
        return user.publish() + " and everyone";
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
        return "Delete : YES";
    }
    /**
     * @return .
     */
    public final String comment() {
        return user.comment();
    }


}
