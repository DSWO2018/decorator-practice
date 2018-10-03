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
 * Clase delete.
 */
public class Delete extends Privileges {

    public Delete(User user) {
        setUser(user);
        setPrivilegs();
    }

    @Override
    public void setPrivilegs() {
        setPublish(getUser().isPublish());
        setApprove(getUser().isApprove());
        setDelete(true);
        setComment(getUser().isComment());
    }
}