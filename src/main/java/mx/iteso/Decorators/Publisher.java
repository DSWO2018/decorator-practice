package mx.iteso.Decorators;

import mx.iteso.User;

public class Publisher extends User {
    /**
     * Publisher to be prompted.
     */
    private User publisher;

    /**
     * Method.
     * @param user to be complmented
     */
    public Publisher(final User user) {
        this.publisher = user;
    }

    /**
     * Method.
     * @return true if its able to publish
     */
    public final boolean publish() {
        return true;
    }

    /**
     * Method.
     * @return true if its able to comment
     */
    public final boolean comment() {
        return publisher.comment();
    }

    /**
     * Method.
     * @return true if its able to delete comments
     */
    public final boolean delete() {
        return publisher.delete();
    }

    /**
     * Method.
     * @return true if its able to approve comments
     */
    public final boolean approve() {
        return publisher.approve();
    }
}
