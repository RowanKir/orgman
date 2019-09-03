package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {

        UserRole role1 = UserRoleFactory.buildUserRole(UUID.randomUUID().toString(),"rowankirchner@kineticskunk.com", "1");
        UserRole role2 = UserRoleFactory.buildUserRole(UUID.randomUUID().toString(),"ethanstoffels@westerncape.gov", "2");

        assertNotNull(role1);
        assertNotNull(role2);
        assertEquals(role1.getRoleId(), "1");
        assertEquals(role2.getUserEmail(), "ethanstoffels@westerncape.gov");
        assertTrue(role1 instanceof UserRole);
        assertNotEquals(role1.getUserEmail(), role2.getUserEmail());

        System.out.println("Two different users: " +role1.toString() + " and " +role1.toString());
    }
}