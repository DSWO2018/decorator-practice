package mx.iteso;

/**Clase base para cada tipo de usuario.*/
public class NormalUser implements User {

    @Override
    public final void createUser(final String userType) {
        System.out.println("Creating a new " + userType);
    }

}
