package mx.iteso.privileges;

import mx.iteso.User;
import mx.iteso.UserPrivilegesDecorator;

/**Class Editor.*/
public class Editor extends UserPrivilegesDecorator {
    /**Var user.*/
    private User user;
    /**Editor constructor.
     * @param usr User.*/
    public Editor(final User usr) {
        this.user = usr;
    }
    /**function publish.
     * @return boolean.*/
    public final boolean publish() {
        return user.publish();
    }
    /**function delete.
     *  @return boolean.*/
    public final boolean delete() {
        return user.delete();
    }
    /**function approve.
     *  @return boolean.*/
    public final boolean approve() {
        return true;
    }
    /**function approve.
     *  @return boolean.*/
    public final boolean comment() {
        return user.comment();
    }
}

