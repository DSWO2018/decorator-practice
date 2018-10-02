package mx.iteso.Decorators;

import mx.iteso.User;

public class Editor extends User {

    private User editor;
    User user;

    public Editor(User user){
        this.user = user;
    }
    public final boolean publish() {
        return user.publish();
    }

    public final boolean delete() {
        return false;
    }

    public final boolean approve() {
        return true;
    }

    public final boolean comment() {
        return true;
    }

    public String getUserType() {
        return "Editor";
    }
}
