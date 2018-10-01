package mx.iteso;

public class Publisher extends User {

    private User Usuario;


    public Publisher(User user) {
        this.Usuario = user;
    }


    public boolean publishing() {
        return true;
    }
    public boolean deleting() {
        return Usuario.deleting();
    }


    public boolean approving() {
        return Usuario.approving();
    }


    public boolean commenting() {
        return Usuario.commenting();
    }
}