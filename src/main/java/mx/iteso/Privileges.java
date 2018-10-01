package mx.iteso;

/**
 * Created by Palaf on 01/10/2018.
 */
public abstract class Privileges extends User {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public abstract void setPrivilegs();
}
