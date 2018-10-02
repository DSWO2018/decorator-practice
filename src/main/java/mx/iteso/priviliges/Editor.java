package mx.iteso.priviliges;

import mx.iteso.Blog;
import mx.iteso.Post;
import mx.iteso.PrivilegesDecorator;
import mx.iteso.User;

public class Editor extends PrivilegesDecorator {
    User anyUser;

    public Editor(User anyUser) {
        this.anyUser = anyUser;
    }


    public Post publish(Blog blog, String post) {
        if(blog.getOwner().equals(this)) {
            return blog.newPost(post);
        }
        return null;
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
        return "Editor";
    }
}
