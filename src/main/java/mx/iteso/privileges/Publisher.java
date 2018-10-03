package mx.iteso.privileges;

import mx.iteso.Blog;
import mx.iteso.Post;
import mx.iteso.PrivilegesDecorator;
import mx.iteso.User;


/**
 * Publisher class extends from PrivilegesDecorator.
 */
public class Publisher extends PrivilegesDecorator {
    /**
     * anyUser holds the default user.
     */
    private final User anyUser;

    /**
     * Publisher constructor.
     * @param user initializes the user into the class.
     */
    public Publisher(final User user) {
        anyUser = user;
    }

    /**
     *
     * @param blog where the post is going to be published
     * @param post content
     * @return a new Post object
     */
    public Post publish(final Blog blog, final String post) {
        if (blog.getOwner().equals(this)) {
            return blog.newPost(post);
        }
        return null;
    }

    /**
     *
     * @param post object which has to be approved
     */
    public void approve(final Post post) {

    }

    /**
     *
     * @param blog where the post is published
     * @param post object which is going bo te deleted
     */
    public void delete(final Blog blog, final Post post) {

    }

    /**
     *
     * @param post where the comment is going to be published
     * @param comment content
     */
    public void comment(final Post post, final String comment) {
        post.comment(comment);
    }

    /**
     *
     * @return the role
     */
    public String role() {
        return "Publisher";
    }
}
