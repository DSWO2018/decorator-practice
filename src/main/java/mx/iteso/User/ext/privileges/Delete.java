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
    /**
     * Constructor.
     *
     * @param user usuario a guardar.
     */
    public Delete(final User user) {
        setUser(user);
        setPrivilegs();
    }

    /**
     * Se modifican los tipo de privilegios.
     */
    @Override
    public final  void setPrivilegs() {
        setPublish(getUser().isPublish());
        setApprove(getUser().isApprove());
        setDelete(true);
        setComment(getUser().isComment());
    }
}
