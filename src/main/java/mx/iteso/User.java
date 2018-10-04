package mx.iteso;

/**
 * User abstract class.
 */
public abstract class User {
    /** Desciption var. */
    private String description = "Any user";
    /** Get description method @return . */
    public abstract String getDescription();
    /**
     * @param desc .
     */
    public final void setDescription(final String desc) {
        this.description = desc;
    }
    /** Publish method @return . */
    public abstract String publish();

    /** Aprrove method @return . */
    public abstract String approve();

    /** Delete method @return . */
    public abstract String delete();
    /** Comment method @return . */
    public abstract String comment();


}
