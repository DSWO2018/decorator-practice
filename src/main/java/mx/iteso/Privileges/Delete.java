package mx.iteso.Privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Delete extends PrivilegeDecorator {

    public Delete(User newUser) {
        super(newUser);
    }

    @Override
    public void createUser(String userType) {
        this.user.createUser(userType);
        System.out.println("Able to delete");
    }
}