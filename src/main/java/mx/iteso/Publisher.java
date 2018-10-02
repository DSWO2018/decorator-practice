package mx.iteso;

public class Publisher extends User {
    public Publisher(){
        description = "Publisher";
    }

    public String publish() {
        return "Publish: YES own";

    }

    public String approve() {
        return "Approve: NO";
    }

    public String delete() {
        return "Delete: NO";
    }

    public String comment() {
        return "Comment: YES";
    }
}
