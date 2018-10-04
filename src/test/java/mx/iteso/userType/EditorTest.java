package mx.iteso.userType;

import mx.iteso.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EditorTest {
    private User user;
    @Before
    public void setUp(){
        user = mock((User.class));
    }
    @Test
    public void getDescription() {
        User editor = new Editor(user);
        String desc = editor.getDescription();
        assertEquals("Editor", desc);
    }

    @Test
    public void publish() {
        User editor = new Editor(user);
        when(user.publish()).thenReturn("Publish: YES own");
        String publish = editor.publish();
        assertEquals("Publish: YES own", publish);
    }

    @Test
    public void approve() {
        User editor = new Editor(user);
        String approve = editor.approve();
        assertEquals("Approve: YES", approve);
    }

    @Test
    public void delete() {
        User editor = new Editor(user);
        when(user.delete()).thenReturn("Delete : NO");
        String delete = editor.delete();
        assertEquals("Delete : NO", delete);

    }

    @Test
    public void comment() {
        User editor = new Editor(user);
        when(user.comment()).thenReturn("Comment: YES");
        String comment = editor.comment();
        assertEquals("Comment: YES", comment);

    }
}

