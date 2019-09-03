package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Test
    public void buildRole() {
        Role dev = RoleFactory.buildRole("Software Developer");
        Role test = RoleFactory.buildRole("Software Tester");

        assertNotNull(dev);
        assertEquals(dev.getRoleName().equals("Software Developer"), true);
        assertTrue(dev instanceof Role);
        assertNotEquals(dev.getRoleName(), test.getRoleName());
        System.out.println("Here are two examples of two different roles within IT, namely: " +dev.toString() +"and " +test.toString());
    }
}