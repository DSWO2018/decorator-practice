package mx.iteso;

import static org.junit.Assert.*;

public class PublisherTest {
    User user = new Publisher();

    @org.junit.Test
    public void publish() {
        assertEquals("Publish: YES own", user.publish());

    }
    @org.junit.Test
    public void approve() {
        assertEquals("Approve: NO", user.approve());
    }

    @org.junit.Test
    public void delete() {
        assertEquals("Delete: NO", user.delete());
    }

    @org.junit.Test
    public void comment() {
        assertEquals("Comment: YES", user.comment());
    }
}