package mx.iteso;

public class Delete extends Privileges {

    public Delete(User user) {
        setUser(user);
        setPrivileges();
    }


    public void setPrivileges() {
        setPublish(getUser().isPublish());
        setApprove(getUser().isApprove());
        setDelete(true);
        setComment(getUser().isComment());
    }


}
