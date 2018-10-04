package mx.iteso;

import mx.iteso.User.User;
import mx.iteso.User.ext.Publisher;
import mx.iteso.User.ext.privileges.Publish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Palaf on 03/10/2018.
 */
public class PublishTest {
    User user;
    @Before
    public void setUp() throws Exception {
         user = new Publisher();
         user = new Publish(user);
    }

    @Test
    public void testSetPrivilegs() throws Exception {
        assertEquals("User{ publish='everyone', approve=false, delete=false, comment=true}"
                , user.toString());
    }


}