package mx.iteso;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Blog {
    private User owner;
    private List<Post> postList;

    public Blog(User owner) {
        this.owner = owner;
        this.postList = new ArrayList<Post>();
    }

    public Post newPost(String body) {
        Post anyPost = new Post(body);
        postList.add(anyPost);
        return anyPost;
    }

    public void removePost(Post post) {
        postList.remove(post);
    }

    public User getOwner() {
        return this.owner;
    }
}
