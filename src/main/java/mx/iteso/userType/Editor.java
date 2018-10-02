package mx.iteso.userType;

import mx.iteso.Publisher;
import mx.iteso.User;

public class Editor extends UserType {
    User user;

    public Editor(User user) {
        this.user = user;
    }

    public String getDescription() {
        return "Editor";
    }

    public String publish() {
        return user.publish();
    }

    public String approve() {
        return "Approve: YES";
    }

    public String delete() {
        return user.delete();
    }

    public String comment() {
        return user.comment();
    }


}
