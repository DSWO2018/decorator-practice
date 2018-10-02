package mx.iteso;

import mx.iteso.priviliges.Admin;

public class Site {
    public static void main(String[] args) {
        User anyAdmin = new AnyUser("Admin");
        User anyEditor = new AnyUser("Editor");
        User anyUser = new AnyUser("User");
        Post adminPost;
        Blog adminBlog = new Blog(anyAdmin);

        adminPost = anyEditor.publish(adminBlog, "Prueba del Editor");
        if(adminPost==null) {
            System.out.println("No tiene permisos.");
        }

        adminPost = anyUser.publish(adminBlog, "Prueba del usuario");
        if(adminPost==null) {
            System.out.println("No tiene permisos.");
        }

        adminPost = anyAdmin.publish(adminBlog, "Prueba del admin");
        if(adminPost==null) {
            System.out.println("No tiene permisos.");
        }

        anyUser.approve(adminPost);

        if(adminPost.isApproved()) {
            System.out.println("Post aprobado");
        } else {
            System.out.println("Post pendiente de aprobacion");
        }

        anyAdmin.approve(adminPost);

        if(adminPost.isApproved()) {
            System.out.println("Post aprobado");
        } else {
            System.out.println("Post pendiente de aprobacion");
        }

        anyUser.comment(adminPost, "Primero");

        anyEditor.comment(adminPost, "Segundo");

        anyUser.comment(adminPost, "Tercero");

        for (String s : adminPost.getComments()) {
           System.out.println(s);
        }

    }
}
