package mx.iteso.privileges;

import mx.iteso.User;
import mx.iteso.UserBase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alan on 10/3/18.
 */
public class EditorTest {
    User user;
    @Before
    public void setUp(){
        user = new UserBase();
        user = new Editor(user);
    }
    @Test
    public void publish(){
        assertEquals(user.publish(),false);
    }
    @Test
    public void delete(){
        assertEquals(user.delete(),false);
    }
    @Test
    public void approve(){
        assertEquals(user.approve(),true);
    }
    @Test
    public void comment(){
        assertEquals(user.comment(),true);
    }
}