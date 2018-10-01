package mx.iteso;

public class Admin extends User {

    private User Usuario;

    public Admin(User user) {
        this.Usuario = user;
    }
 
    public boolean publishing() {
        return Usuario.publishing();
    }


    public boolean deleting() {
        return true;
    }


    public boolean approving() {
        return true;
    }

    public boolean commenting() {
        return Usuario.commenting();
    }
}
