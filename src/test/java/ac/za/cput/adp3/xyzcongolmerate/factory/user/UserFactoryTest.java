package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void buildUser()
    {
        User user1 = UserFactory.buildUser("rowanKirchner@gmail.com", "Rowan", "Kirchner");
        User user2 = UserFactory.buildUser("matthewPearce@gmail.com", "Matthew", "Jumarak");

        assertNotNull(user1);
        assertNotNull(user2);
        assertEquals(user1.getFirstName(), "Rowan");
        assertEquals(user2.getUserEmail(), "matthewPearce@gmail.com");
        assertTrue(user1 instanceof User);
        assertNotEquals(user1.getFirstName(), user2.getLastName());

        System.out.println("Two different users: " +user1.toString() + " and " +user2.toString());
    }
}