package mx.iteso;

public class Editor extends User {

    private User Usuario;

    public Editor( User user) {
        this.Usuario = user;
    }

    public boolean publishing() {
        return Usuario.publishing();
    }


    public boolean deleting() {
        return Usuario.deleting();
    }

    public boolean approving() {
        return Usuario.approving();
    }

    public boolean commenting() {
        return true;
    }
}