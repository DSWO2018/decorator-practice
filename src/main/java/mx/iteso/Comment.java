package mx.iteso;

public class Comment extends Privileges {

    public Comment(User user) {
        setUser(user);
        setPrivileges();
    }

    @Override
    public void setPrivileges() {
        setPublish(getUser().isPublish());
        setApprove(getUser().isApprove());
        setDelete(getUser().isDelete());
        setComment(false);
    }
}