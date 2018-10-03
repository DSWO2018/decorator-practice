package mx.iteso.Privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

/**Javadoc comment aqui.*/
public class Publish extends PrivilegeDecorator {

    /**Javadoc comment aca.
     * @param newUser */
    public Publish(final User newUser) {
        super(newUser);
    }

    @Override
    public final void createUser(final String userType) {
        getUser().createUser(userType);
        if (userType == "Publisher" | userType == "Editor") {
            System.out.println("Able to publish on his own feed");
        } else if (userType == "Administrator") {
            System.out.println("Able to publish on all kind of feeds");
        }
    }
}
