package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {

        UserDemography demo1 = UserDemographyFactory.buildUserDemography("rowankirchner@gmail.com", "Mr.", "1", "1", new Date());

        assertNotNull(demo1);
        assertEquals(demo1.getRaceId(), "1");
        assertTrue(demo1 instanceof UserDemography);

        System.out.println(demo1.toString());
    }
}