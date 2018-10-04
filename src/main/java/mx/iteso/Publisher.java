package mx.iteso;

/**
 * Publisher class.
 */
public class Publisher extends User {
    /** Description var. */
    private String desc;

    /**
     * @param descrip .
     */
    public final void setDesc(final String descrip) {
        setDescription(desc);
        this.desc = descrip;
    }
    /**
     * @return .
     */
    public final String getDescription() {
        return  desc;
    }
    /**
     * Constructor.
     */
    public Publisher() {
        desc = "Publisher";
    }
    /**
     * Publish method @return .
     */
    public final String publish() {
        return "Publish: YES own";

    }
    /**
     * Approve method @return .
     */
    public final String approve() {
        return "Approve: NO";
    }
    /**
     * Delete method @return .
     */
    public final String delete() {
        return "Delete: NO";
    }
    /**
     * Comment method @return .
     */
    public final String comment() {
        return "Comment: YES";
    }
}
