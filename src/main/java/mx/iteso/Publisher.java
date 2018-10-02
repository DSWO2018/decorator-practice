package mx.iteso;

public class Publisher extends User {
    public Publisher() {
        setPrivileges();
    }


    public void setPrivileges() {
        setPublish(false);
        setApprove(false);
        setDelete(false);
        setComment(true);
    }
}
