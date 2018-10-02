package mx.iteso.Decorators;

import mx.iteso.User;

public class Admin extends User {

    User user;

    public Admin(User user){
        this.user = user;
    }
    public final boolean publish() {
        return user.publish();
    }

    public final boolean delete() {
        return true;
    }

    public final boolean approve() {
        return true;
    }

    public final boolean comment() {
        return true;
    }

    public String getUserType() {
        return "Admin";
    }
}