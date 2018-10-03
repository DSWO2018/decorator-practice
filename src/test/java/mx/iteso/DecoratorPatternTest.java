package mx.iteso;

import mx.iteso.Privileges.Comment;
import mx.iteso.Privileges.Delete;
import mx.iteso.Privileges.Publish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class DecoratorPatternTest {

    User mockedPublisher;
    User mockedEditor;
    User mockedAdministrator;

    @Before
    public void setUp() {

        mockedPublisher = mock(NormalUser.class);
        mockedPublisher = new Comment(mockedPublisher);
        mockedPublisher = new Publish(mockedPublisher);

        mockedEditor = mock(NormalUser.class);
        mockedEditor = new Comment(mockedEditor);
        mockedEditor = new Publish(mockedEditor);

        mockedAdministrator = mock(NormalUser.class);
        mockedAdministrator = new Delete(mockedAdministrator);
        mockedAdministrator = new Comment(mockedAdministrator);
        mockedAdministrator = new Publish(mockedAdministrator);
    }

    @Test
    public void mainTest() {

        mockedPublisher.createUser("Publisher");
        mockedEditor.createUser("Editor");
        mockedAdministrator.createUser("Administrator");

        assertNotNull(mockedAdministrator);
        assertNotNull(mockedEditor);
        assertNotNull(mockedAdministrator);
    }
}
