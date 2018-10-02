package mx.iteso;

public abstract class User {
    public String description = "Any user";
    public String getDescription(){
        return description;
    }
    public abstract String publish();
    public abstract String approve();
    public abstract String delete();
    public abstract String comment();


}
