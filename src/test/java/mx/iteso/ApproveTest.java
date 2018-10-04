package mx.iteso;

import mx.iteso.User.User;
import mx.iteso.User.ext.Publisher;
import mx.iteso.User.ext.privileges.Approve;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Palaf on 03/10/2018.
 */
public class ApproveTest {
    User user;
    @Before
    public void setUp() throws Exception {
        user = new Publisher();
        user = new Approve(user);
    }

    @Test
    public void testSetPrivilegs() throws Exception {
        assertEquals("User{ publish='own', approve=true, delete=false, comment=true}"
                , user.toString());
    }
}