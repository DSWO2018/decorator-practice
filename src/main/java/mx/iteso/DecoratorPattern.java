package mx.iteso;

import mx.iteso.Privileges.Approve;
import mx.iteso.Privileges.Comment;
import mx.iteso.Privileges.Delete;
import mx.iteso.Privileges.Publish;

public class DecoratorPattern {

    public static void main(String[] args){

        User publisher = new Publish(new Comment(new NormalUser()));
        User editor = new Publish(new Comment(new NormalUser()));
        User administrator = new Publish(new Approve(new Comment(new Delete(new NormalUser()))));

        publisher.createUser("Publisher");
        editor.createUser("Editor");
        administrator.createUser("Administrator");
    }
}