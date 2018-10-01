package mx.iteso;

/**
 * Created by Palaf on 01/10/2018.
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
