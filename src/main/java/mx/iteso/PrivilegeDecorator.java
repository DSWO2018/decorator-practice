package mx.iteso;

/**Clase decoradora.*/
public abstract class PrivilegeDecorator implements User {

    /**Creacion de un usuario.*/
    private User user;

    /**constructor.
     * @param newUser
     * nuevo usuario.*/
    public PrivilegeDecorator(final User newUser) {
        this.user = newUser;
    }

    /**simple metodo getty.
     * @return user
     * */
    public final User getUser() {
        return this.user;
    }

    @Override
    public void createUser(final String userType) { }
}
