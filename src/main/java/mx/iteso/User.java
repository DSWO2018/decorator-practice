package mx.iteso;

public abstract class User {
    public abstract Post publish(Blog blog, String post);
    public abstract void approve(Post post);
    public abstract void delete(Blog blog, Post post);
    public abstract void comment(Post post, String comment);
    public abstract String role();
}
