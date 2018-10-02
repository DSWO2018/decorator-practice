package mx.iteso;

import mx.iteso.Decorators.*;

public class UserExample {

    public static void main(String []args){
        User usuario = null;
        
        usuario = new Publisher(usuario);
        System.out.println(usuario.getUserType());
        System.out.println(usuario.approve());
        System.out.println(usuario.comment());
        System.out.println(usuario.delete());
        System.out.println(usuario.publish());
        
        usuario = new Editor(usuario);
        System.out.println(usuario.getUserType());
        System.out.println(usuario.approve());
        System.out.println(usuario.comment());
        System.out.println(usuario.delete());
        System.out.println(usuario.publish());
        
        usuario = new Admin(usuario);
        System.out.println(usuario.getUserType());
        System.out.println(usuario.approve());
        System.out.println(usuario.comment());
        System.out.println(usuario.delete());
        System.out.println(usuario.publish());

    }
}
