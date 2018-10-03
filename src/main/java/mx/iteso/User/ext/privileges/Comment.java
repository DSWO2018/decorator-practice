package mx.iteso.User.ext.privileges;

import mx.iteso.User.User;
import mx.iteso.User.ext.Privileges;

/**
 * Created by Palaf on 01/10/2018.
 */
public class Comment extends Privileges {

    public Comment(User user) {
        setUser(user);
        setPrivilegs();
    }

    @Override
    public void setPrivilegs() {
        setPublish(getUser().isPublish());
        setApprove(getUser().isApprove());
        setDelete(getUser().isDelete());
        setComment(false);
    }
}
