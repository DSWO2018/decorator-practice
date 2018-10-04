package mx.iteso;

import mx.iteso.User.User;
import mx.iteso.User.ext.Publisher;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Palaf on 03/10/2018.
 */
public class PublisherTest {
    User user;
    @Before
    public void setUp() throws Exception {
        user = new Publisher();
    }

    @Test
    public void testSetPrivilegs() throws Exception {
        assertEquals("User{ publish='own', approve=false, delete=false, comment=true}"
                , user.toString());
    }

}