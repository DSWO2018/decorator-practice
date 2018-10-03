package mx.iteso;

import java.util.ArrayList;
import java.util.List;

/**
 * Blog class.
 */

public class Blog {
    /**
     * User object holds the owner.
     */
    private User owner;

    /**
     *
     */
    private List<Post> postList;

    /**
     *
     * @param anyOwner object who owns the blog
     */
    Blog(final User anyOwner) {
        owner = anyOwner;
        this.postList = new ArrayList<Post>();
    }

    /**
     *
     * @param body content
     * @return post object
     */
    public Post newPost(final String body) {
        Post anyPost = new Post(body);
        postList.add(anyPost);
        return anyPost;
    }

    /**
     *
     * @param post object.
     */
    public void removePost(final Post post) {
        postList.remove(post);
    }

    /**
     *
     * @return User object
     */
    public User getOwner() {
        return this.owner;
    }
}
