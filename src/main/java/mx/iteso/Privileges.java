package mx.iteso;

public abstract class Privileges extends User {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public abstract void setPrivileges();
}
