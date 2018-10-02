package mx.iteso;

/**
 * Created by Alan on 10/1/18.
 */
public class UserBase extends User {
    /**function publish.
     * @return boolean.*/
    public final boolean publish() {
        return false;
    }
    /**function delete.
     *  @return boolean.*/
    public final boolean delete() {
        return false;
    }
    /**function approve.
     *  @return boolean.*/
    public final boolean approve() {
        return false;
    }
    /**function comment.
     *  @return boolean.*/
    public final boolean comment() {
        return true;
    }
}
