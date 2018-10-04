package mx.iteso.User.ext.privileges;

import mx.iteso.User.User;
import mx.iteso.User.ext.Privileges;

/**
 * Created by Palaf on 03/10/2018.
 */
public class Publish extends Privileges {
    /**
     * Constructor.
     *
     * @param user usuario a guardar.
     */
    public Publish(final User user) {
        setUser(user);
        setPrivilegs();
    }

    /**
     * Se modifican los tipo de privilegios.
     */
    @Override
    public final void setPrivilegs() {
        setPublish(true);
        setApprove(getUser().isApprove());
        setDelete(getUser().isDelete());
        setComment(getUser().isComment());
    }
}
