package mx.iteso;

public class Publisher extends User {
    public Publisher() {
        setPrivilegs();
    }

    @Override
    public void setPrivilegs() {
        setPublish(false);
        setApprove(false);
        setDelete(false);
        setComment(true);
    }
}
