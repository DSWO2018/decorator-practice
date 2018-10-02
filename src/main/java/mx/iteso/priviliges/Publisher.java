package mx.iteso.priviliges;

import mx.iteso.Blog;
import mx.iteso.Post;
import mx.iteso.PrivilegesDecorator;
import mx.iteso.User;

public class Publisher extends PrivilegesDecorator {
    User anyUser;

    public Publisher(User anyUser) {
        this.anyUser = anyUser;
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
        return "Publisher";
    }
}
