package mx.iteso;


import java.util.ArrayList;
import java.util.List;

/**
 * Post class.
 */

public class Post {
    /**
     * body holds the post content.
     */
    private String body;

    /**
     * List holds the post comments.
     */
    private List<String> comments;

    /**
     * Boolean holds the post status.
     */
    private Boolean approved;

    /**
     *
     * @param anyBody is the post content
     */
    Post(final String anyBody) {
        body = anyBody;
        this.approved = false;
        this.comments = new ArrayList<String>();
    }

    /**
     * Approve the post.
     */
    public void approve() {
        this.approved = true;
    }

    /**
     *
     * @param comment body for the post.
     */
    public void comment(final String comment) {
        comments.add(comment);
    }

    /**
     *
     * @return boolean if post is approved
     */
    boolean isApproved() {
        return this.approved;
    }

    /**
     *
     * @return post comment list.
     */
    List<String> getComments() {
        return comments;
    }
}
