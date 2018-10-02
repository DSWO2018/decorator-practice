package mx.iteso.privileges;

import mx.iteso.User;
import mx.iteso.UserPrivilegesDecorator;

/**Class Publisher.*/
public class Publisher extends UserPrivilegesDecorator {
    /**Var user.*/
    private User user;
    /**Publisher constructor.
     * @param usr User.*/
    public Publisher(final User usr) {
        this.user = usr;
    }
    /**function publish.
     * @return boolean.*/
    public final boolean publish() {
        return true;
    }
    /**function delete.
     *  @return boolean.*/
    public final boolean delete() {
        return user.delete();
    }
    /**function approve.
     *  @return boolean.*/
    public final boolean approve() {
        return user.approve();
    }
    /**function approve.
     *  @return boolean.*/
    public final boolean comment() {
        return user.comment();
    }
}
