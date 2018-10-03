package mx.iteso.Privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**Clase especializada en privilegio arpporve.*/
public class Approve extends PrivilegeDecorator {

    /**metodo constructor de arpprove.
     * @param newUser */
    public Approve(final User newUser) {
        super(newUser);
    }

    /**No se por que se perdio este Javadoc.
     * @param userType */
    public final void createUser(final String userType) {
        getUser().createUser(userType);
        System.out.println("Able to approve");
    }
}
