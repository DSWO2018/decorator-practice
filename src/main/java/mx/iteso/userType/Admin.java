package mx.iteso.userType;

import mx.iteso.User;

public class Admin extends UserType {
    User user;

    public Admin(User user){
        this.user = user;
    }
    public String getDescription() {
        return "Admin";
    }
    public String publish() {
        return user.publish() + " and everyone";
    }

    public String approve() {
        return "Approve: YES";
    }

    public String delete() {
        return "Delete : YES";
    }

    public String comment() {
        return user.comment();
    }


}
