package mx.iteso.User.ext.privileges;

import mx.iteso.User.User;
import mx.iteso.User.ext.Privileges;

/**
 * Created by Palaf on 01/10/2018.
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
