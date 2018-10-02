package mx.iteso;

public class Approve extends Privileges {


    public Approve(User user) {
        setUser(user);
        setPrivileges();
    }

    @Override
    public void setPrivileges() {
        setPublish(getUser().isPublish());
        setApprove(true);
        setDelete(getUser().isDelete());
        setComment(getUser().isComment());
    }
}
