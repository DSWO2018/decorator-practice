package mx.iteso.User.ext;

import mx.iteso.User.User;

public class Publisher extends User {
    public Publisher() {
        setPrivilegs();
    }

    @Override
    public void setPrivilegs() {
        setPublish(false);
        setApprove(false);
        setDelete(false);
        setComment(true);
    }

    /**
     * Created by Palaf on 01/10/2018.
     */
    public abstract static class Privileges extends User {
        private User user;

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        @Override
        public abstract void setPrivilegs();
    }
}
