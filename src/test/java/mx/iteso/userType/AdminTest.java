package mx.iteso.userType;

import mx.iteso.User;
import mx.iteso.userType.Admin;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class AdminTest {
    private User user;
    @Before
    public void setUp(){
        user = mock((User.class));
    }
    @Test
    public void getDescription() {
        User admin = new Admin(user);
        when(user.getDescription()).thenReturn("Admin");
        String desc = admin.getDescription();
        assertEquals("Admin", desc);
    }

    @Test
    public void publish() {
        User admin = new Admin(user);
        when(user.publish()).thenReturn("Publish: YES own");
        String publish = admin.publish();
        assertEquals("Publish: YES own and everyone", publish);
    }

    @Test
    public void approve() {
        User admin = new Admin(user);
        String approve = admin.approve();
        assertEquals("Approve: YES", approve);
    }

    @Test
    public void delete() {
        User admin = new Admin(user);
        String delete = admin.delete();
        assertEquals("Delete : YES", delete);

    }

    @Test
    public void comment() {
        User admin = new Admin(user);
        when(user.comment()).thenReturn("Comment: YES");
        String comment = admin.comment();
        assertEquals("Comment: YES", comment);

    }
}