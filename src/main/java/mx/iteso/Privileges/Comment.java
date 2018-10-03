package mx.iteso.Privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**Clase respectiva de Comment.*/
public class Comment extends PrivilegeDecorator {

    /**Constructor de Comment.
     * @param newUser */
    public Comment(final User newUser) {
        super(newUser);
    }

    @Override
    public final void createUser(final String userType) {
        super.createUser(userType);
        System.out.println("Able to comment");
    }
}
