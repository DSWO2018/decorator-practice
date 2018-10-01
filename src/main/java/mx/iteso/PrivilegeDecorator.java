package mx.iteso;

public class PrivilegeDecorator implements User{

    protected User user;

    public PrivilegeDecorator(User newUser){
        this.user = newUser;
    }

    @Override
    public void createUser(String userType) {
        this.user.createUser(userType);
    }
}