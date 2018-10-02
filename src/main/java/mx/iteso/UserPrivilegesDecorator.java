package mx.iteso;

/**
Class UserPrivilegesDecorator.
 */
public abstract class UserPrivilegesDecorator extends User {
    /**abstract function publish.
     * @return boolean.*/
    public abstract boolean publish();
    /**abstract function delete.
     * @return boolean.*/
    public abstract boolean delete();
    /**abstract function approve.
     * @return boolean.*/
    public abstract boolean approve();
    /**abstract function comment.
     * @return boolean.*/
    public abstract boolean comment();
}
