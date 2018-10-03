package mx.iteso;

/**
 * User abstract class.
 */

public abstract class User {
    /**
     *
     * @param blog where the post is going to be published
     * @param post content
     * @return a new Post object
     */
    public abstract Post publish(Blog blog, String post);

    /**
     *
     * @param post object which has to be approved
     */
    public abstract void approve(Post post);

    /**
     *
     * @param blog where the post is published
     * @param post object which is going bo te deleted
     */
    public abstract void delete(Blog blog, Post post);

    /**
     *
     * @param post where the comment is going to be published
     * @param comment content
     */
    public abstract void comment(Post post, String comment);

    /**
     *
     * @return the role
     */
    public abstract String role();
}
