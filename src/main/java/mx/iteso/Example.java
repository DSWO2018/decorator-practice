package mx.iteso;

import mx.iteso.privileges.Admin;
import mx.iteso.privileges.Editor;
import mx.iteso.privileges.Publisher;

/**
 * Created by Alan on 10/1/18.
 */
final class Example {
    /**Contructor.*/
    private Example() { };
    /**Function Main.
     * @param args .*/
    public static void main(final String[] args) {
        User usr1 = new UserBase();
        usr1 = new Admin(usr1);
        usr1 = new Editor(usr1);
        usr1 = new Publisher(usr1);
        System.out.println(usr1.publish());
        System.out.println(usr1.approve());
        System.out.println(usr1.delete());
        System.out.println(usr1.comment());
    }
}
