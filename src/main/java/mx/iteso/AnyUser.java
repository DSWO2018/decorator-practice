package mx.iteso;

/**
 * AnyUser class extends from User.
 */
public class AnyUser extends User {
    /**
     * name is the username.
     */
    private final String name;

    /**
     *
     * @param anyName si the name
     */
    AnyUser(final String anyName) {
        this.name = anyName;
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
        return "default";
    }
}
