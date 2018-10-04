package mx.iteso.privileges;

import mx.iteso.User;
import mx.iteso.UserBase;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by Alan on 10/3/18.
 */
public class AdminTest {
    User user;
    @Before
    public void setUp(){
        user = new UserBase();
        user = new Admin(user);
    }
    @Test
    public void publish(){
        assertEquals(user.publish(),false);
    }
    @Test
    public void delete(){
        assertEquals(user.delete(),true);
    }
    @Test
    public void approve(){
        assertEquals(user.approve(),false);
    }
    @Test
    public void comment(){
        assertEquals(user.comment(),true);
    }

}