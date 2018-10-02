package mx.iteso;

import java.util.*;

public class Post {
    String body;
    List<String> comments;
    Boolean approved;

    public Post(String body) {
        this.body = body;
        this.approved = false;
        this.comments = new ArrayList<String>();
    }

    public void approve() {
        this.approved = true;
    }

    public void comment(String comment) {
        comments.add(comment);
    }

    public boolean isApproved() {
        return this.approved;
    }

    public List<String> getComments() {
        return comments;
    }
}
