package mx.iteso.Privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**Clase perteneciente a Delete.*/
public class Delete extends PrivilegeDecorator {

    /**Constructor de un delete.
     * @param newUser */
    public Delete(final User newUser) {
        super(newUser);
    }

    @Override
    public final void createUser(final String userType) {
        getUser().createUser(userType);
        System.out.println("Able to delete");
    }
}
