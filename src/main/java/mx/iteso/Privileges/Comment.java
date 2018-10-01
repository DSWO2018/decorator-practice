package mx.iteso.Privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Comment extends PrivilegeDecorator {

    public Comment(User newUser) {
        super(newUser);
    }

    @Override
    public void createUser(String userType) {
        super.createUser(userType);

        System.out.println("Able to comment");
    }
}
