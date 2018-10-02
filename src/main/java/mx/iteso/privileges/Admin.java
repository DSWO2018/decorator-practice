package mx.iteso.privileges;
import mx.iteso.User;
import mx.iteso.UserPrivilegesDecorator;

/**Class Admin.*/
public class Admin extends UserPrivilegesDecorator {
    /**Var user.*/
    private User user;
    /**Admin constructor.
     * @param usr User.*/
    public Admin(final User usr) {
        this.user = usr;
    }
    /**function publish.
     * @return boolean.*/
    @Override
    public final boolean publish() {
        return user.publish();
    }
    /**function delete.
     *  @return boolean.*/
    @Override
    public final boolean delete() {
        return true;
    }
    /**function approve.
     *  @return boolean.*/
    @Override
    public final boolean approve() {
        return user.approve();
    }
    /**function approve.
     *  @return boolean.*/
    @Override
    public final boolean comment() {
        return user.comment();
    }
}
