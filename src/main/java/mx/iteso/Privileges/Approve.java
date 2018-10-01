package mx.iteso.Privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Approve extends PrivilegeDecorator {
    public Approve(User newUser) {
        super(newUser);
    }

    @Override
    public void createUser(String userType) {
        this.user.createUser(userType);
        System.out.println("Able to approve");
    }
}
