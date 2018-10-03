/**
 * Paquete de privalege.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.User.ext.privileges;

import mx.iteso.User.User;
import mx.iteso.User.ext.Privileges;

/**
 * Clase approve.
 */
public class Approve extends Privileges {


    public Approve(User user) {
        setUser(user);
        setPrivilegs();
    }

    @Override
    public void setPrivilegs() {
        setPublish(getUser().isPublish());
        setApprove(true);
        setDelete(getUser().isDelete());
        setComment(getUser().isComment());
    }
}
