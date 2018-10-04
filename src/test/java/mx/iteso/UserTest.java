package mx.iteso;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class UserTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(User.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void setPrivileges() {
    }

    @org.junit.Test
    public void isPublish() {
    }

    @org.junit.Test
    public void setPublish() {
    }

    @org.junit.Test
    public void isApprove() {
    }

    @org.junit.Test
    public void setApprove() {
    }

    @org.junit.Test
    public void isDelete() {
    }

    @org.junit.Test
    public void setDelete() {
    }

    @org.junit.Test
    public void isComment() {
    }

    @org.junit.Test
    public void setComment() {
    }

    @org.junit.Test
    public void getPublishContent() {
    }

    @org.junit.Test
    public void toString() {
    }
}
