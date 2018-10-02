package mx.iteso.priviliges;

import mx.iteso.Blog;
import mx.iteso.Post;
import mx.iteso.PrivilegesDecorator;
import mx.iteso.User;

public class Admin extends PrivilegesDecorator {
    User anyUser;

    public Admin(User anyUser) {
        this.anyUser = anyUser;
    }

    public Post publish(Blog blog, String post) {
        return blog.newPost(post);
    }

    public void approve(Post post) {
        post.approve();
    }

    public void delete(Blog blog, Post post) {
        blog.removePost(post);
    }

    public void comment(Post post, String comment) {
        post.comment(comment);
    }

    public String role() {
        return "Admin";
    }
}
