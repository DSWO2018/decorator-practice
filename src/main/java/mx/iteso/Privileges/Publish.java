package mx.iteso.Privileges;

import mx.iteso.PrivilegeDecorator;
import mx.iteso.User;

public class Publish extends PrivilegeDecorator {

    public Publish(User newUser) {
        super(newUser);
    }

    @Override
    public void createUser(String userType) {
        this.user.createUser(userType);
        if(userType == "Publisher" | userType == "Editor")
            System.out.println("Able to publish on his own feed");
        else if(userType == "Administrator")
            System.out.println("Able to publish on all kind of feeds");
        System.out.println("Publishing");
    }
}
