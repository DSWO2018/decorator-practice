package mx.iteso;

import java.net.ServerSocket;

public class NormalUser implements User{

    @Override
    public void createUser(String userType) {
        System.out.println("Creating a new " + userType);
    }

}