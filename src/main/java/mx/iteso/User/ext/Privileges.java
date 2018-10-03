package mx.iteso.User.ext;

import mx.iteso.User.User;

/**
 * Created by Palaf on 03/10/2018.
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
    public abstract void setPrivilegs() ;
}
