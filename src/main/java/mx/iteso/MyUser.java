package mx.iteso;

import mx.iteso.userType.Admin;
import mx.iteso.userType.Editor;

public class MyUser {
    public static void main(String []args){
        User usuario = new Publisher();
        System.out.println(usuario.getDescription() + " Privilegios: ");
        System.out.println(usuario.approve());
        System.out.println(usuario.comment());
        System.out.println(usuario.delete());
        System.out.println(usuario.publish());

        System.out.println();
        usuario = new Editor(usuario);
        System.out.println(usuario.getDescription() + " Privilegios: ");
        System.out.println(usuario.approve());
        System.out.println(usuario.comment());
        System.out.println(usuario.delete());
        System.out.println(usuario.publish());

        System.out.println();
        usuario = new Admin(usuario);
        System.out.println(usuario.getDescription() + " Privilegios: ");
        System.out.println(usuario.approve());
        System.out.println(usuario.comment());
        System.out.println(usuario.delete());
        System.out.println(usuario.publish());

    }
}
