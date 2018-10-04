/**
 * Paquete de edxtends.
 *
 * @author Luis Fernando Palafox.
 * @version 1.1
 * @since 1.0
 */
package mx.iteso.User.ext;

import mx.iteso.User.User;

/**
 * Clase publisher.
 */
public class Publisher extends User {

    /**
     * Constructor de publisher.
     */
    public Publisher() {
        setPrivilegs();
    }

    /**
     * Se modifican los tipo de privilegios.
     */
    @Override
    public final void setPrivilegs() {
        setPublish(false);
        setApprove(false);
        setDelete(false);
        setComment(true);
    }

    /**
     * Clase privileges.
     */
    public abstract static class Privileges extends User {

        /**
         * Variable user.
         */
        private User user;


        /**
         * Getter de user.
         *
         * @return  user.
         */
        public final User getUser() {
            return user;
        }

        /**
         * setter de la variable usuario.
         *
         * @param userV usuario almacenado.
         */
        public final void setUser(final User userV) {
            this.user = userV;
        }

        /**
         * Se modifican los tipo de privilegios.
         */
        @Override
        public abstract void setPrivilegs();
    }
}
