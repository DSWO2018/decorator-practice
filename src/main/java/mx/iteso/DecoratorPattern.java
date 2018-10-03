package mx.iteso;

import mx.iteso.Privileges.Approve;
import mx.iteso.Privileges.Comment;
import mx.iteso.Privileges.Delete;
import mx.iteso.Privileges.Publish;

/**Implementacion del patron de diseño Decoration Pattern.*/
public class DecoratorPattern {

    /**Constructor.*/
    public void decoratorPatternConstructor() { }

    /**main.
     * @param args
     * Argumentos que se mandan a la funcion main.
     * */
    public static void main(final String[] args) {

        User publisher = new Publish(new Comment(new NormalUser()));
        User editor = new Publish(new Comment(new NormalUser()));
        User administrator = new Publish(new Approve(new Comment(
                new Delete(new NormalUser()))));

        publisher.createUser("Publisher");
        editor.createUser("Editor");
        administrator.createUser("Administrator");
    }
}
