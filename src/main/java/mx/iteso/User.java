package mx.iteso;

/**
 * Class user.
 */

public abstract class User {

    /**
     * Method.
     * @return true if its able to publish
     */
    public abstract boolean publish();

    /**
     * Method.
     * @return true if able to comment
     */
    public abstract boolean comment();

    /**
     * Method.
     * @return true if its able to delete
     */
    public abstract boolean delete();

    /**
     * Method.
     * @return true if able to aproove comments
     */
    public abstract boolean approve();


}
