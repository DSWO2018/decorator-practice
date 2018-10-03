package mx.iteso;

import mx.iteso.priviliges.Admin;
import mx.iteso.priviliges.Editor;
import mx.iteso.priviliges.Publisher;

/**
 * Site class. Example implementation.
 */
public final class Site {

    /**
     * Private constructor.
     */
    private Site() {

    }

    /**
     * @param args for test purposes.
     */
    public static void main(final String[] args) {
        User anyAdmin = new AnyUser("Admin");
        User anyEditor = new AnyUser("Editor");
        User anyUser = new AnyUser("User");

        User admin = new Admin(anyAdmin);
        User editor = new Editor(anyEditor);
        User user = new Publisher(anyUser);

        Post adminPost;
        Blog adminBlog = new Blog(admin);

        adminPost = editor.publish(adminBlog, "Prueba del Editor");
        if (adminPost == null) {
            System.out.println("No tiene permisos.");
        }

        adminPost = user.publish(adminBlog, "Prueba del usuario");
        if (adminPost == null) {
            System.out.println("No tiene permisos.");
        }

        adminPost = admin.publish(adminBlog, "Prueba del admin");
        if (adminPost == null) {
            System.out.println("No tiene permisos.");
        }

        user.approve(adminPost);

        if (adminPost != null && adminPost.isApproved()) {
            System.out.println("Post aprobado");
        } else {
            System.out.println("Post pendiente de aprobacion");
        }

        admin.approve(adminPost);

        if (adminPost != null && adminPost.isApproved()) {
            System.out.println("Post aprobado");
        } else {
            System.out.println("Post pendiente de aprobacion");
        }

        admin.comment(adminPost, "Primero");

        editor.comment(adminPost, "Segundo");

        user.comment(adminPost, "Tercero");

        for (String s : adminPost.getComments()) {
           System.out.println(s);
        }

    }
}
