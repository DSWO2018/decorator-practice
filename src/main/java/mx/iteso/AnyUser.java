package mx.iteso;

public class AnyUser extends User {
    String name;

    public AnyUser(String name) {
        this.name = name;
    }

    public Post publish(Blog blog, String post) {
        if(blog.getOwner().equals(this)) {
            return blog.newPost(post);
        }
        return null;
    }

    public void approve(Post post) {
        return;
    }

    public void delete(Blog blog, Post post) {
        return;
    }

    public void comment(Post post, String comment) {
        post.comment(comment);
    }

    public String role() {
        return "default";
    }
}
